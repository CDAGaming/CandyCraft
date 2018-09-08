package com.valentin4311.candycraftmod.entity.ai;

import com.valentin4311.candycraftmod.items.CCItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.Path;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.math.Vec3d;

import java.util.List;

public class EntityAIAvoidPlayerGinger extends EntityAIBase {
    private static final String __OBFID = "CL_00001574";
    private EntityCreature theEntity;
    private double farSpeed;
    private double nearSpeed;
    private Entity closestLivingEntity;
    private float distanceFromEntity;
    /**
     * The PathEntity of our entity
     */
    private Path entityPathEntity;
    /**
     * The PathNavigate of our entity
     */
    private PathNavigate entityPathNavigate;
    /**
     * The class of the entity we should avoid
     */
    private Class targetEntityClass;

    public EntityAIAvoidPlayerGinger(EntityCreature par1EntityCreature, Class par2Class, float par3, double par4, double par6) {
        theEntity = par1EntityCreature;
        targetEntityClass = par2Class;
        distanceFromEntity = par3;
        farSpeed = par4;
        nearSpeed = par6;
        entityPathNavigate = par1EntityCreature.getNavigator();
        setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    @Override
    public boolean shouldExecute() {
        if (targetEntityClass == EntityPlayer.class) {
            if (theEntity instanceof EntityTameable && ((EntityTameable) theEntity).isTamed()) {
                return false;
            }

            closestLivingEntity = theEntity.worldObj.getClosestPlayerToEntity(theEntity, distanceFromEntity);

            if (closestLivingEntity != null && ((EntityPlayer) closestLivingEntity).inventory.hasItemStack(new ItemStack(CCItems.gingerbreadEmblem))) {
                return false;
            }
            if (closestLivingEntity == null) {
                return false;
            }
        } else {
            List list = theEntity.worldObj.getEntitiesWithinAABB(targetEntityClass, theEntity.getEntityBoundingBox().expand(distanceFromEntity, 3.0D, distanceFromEntity));

            if (list.isEmpty()) {
                return false;
            }

            closestLivingEntity = (Entity) list.get(0);
        }

        Vec3d vec3 = RandomPositionGenerator.findRandomTargetBlockAwayFrom(theEntity, 16, 7, new Vec3d(closestLivingEntity.posX, closestLivingEntity.posY, closestLivingEntity.posZ));

        if (vec3 == null) {
            return false;
        } else if (closestLivingEntity.getDistanceSq(vec3.xCoord, vec3.yCoord, vec3.zCoord) < closestLivingEntity.getDistanceSqToEntity(theEntity)) {
            return false;
        } else {
            entityPathEntity = entityPathNavigate.getPathToXYZ(vec3.xCoord, vec3.yCoord, vec3.zCoord);
            return entityPathEntity == null ? false : entityPathEntity.isDestinationSame(vec3);
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    @Override
    public boolean continueExecuting() {
        return !entityPathNavigate.noPath();
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    @Override
    public void startExecuting() {
        entityPathNavigate.setPath(entityPathEntity, farSpeed);
    }

    /**
     * Resets the task
     */
    @Override
    public void resetTask() {
        closestLivingEntity = null;
    }

    /**
     * Updates the task
     */
    @Override
    public void updateTask() {
        if (theEntity.getDistanceSqToEntity(closestLivingEntity) < 49.0D) {
            theEntity.getNavigator().setSpeed(nearSpeed);
        } else {
            theEntity.getNavigator().setSpeed(farSpeed);
        }
    }
}
