package com.valentin4311.candycraftmod.items;

import com.valentin4311.candycraftmod.blocks.CCBlocks;
import com.valentin4311.candycraftmod.entity.EntityCandyArrow;
import com.valentin4311.candycraftmod.misc.CCEnchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemCandyCrossbow extends Item {
    public ItemCandyCrossbow() {
        super();
        maxStackSize = 1;
        setMaxDamage(160);
    }

    @Override
    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
        return par2ItemStack != null && par2ItemStack.getItem() == Item.getItemFromBlock(CCBlocks.caramelBlock);
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer, int par4) {
        int j = getMaxItemUseDuration(par1ItemStack) - par4;

        boolean flag = par3EntityPlayer.capabilities.isCreativeMode || EnchantmentHelper.getEnchantmentLevel(Enchantments.INFINITY, par1ItemStack) > 0;

        if (flag || par3EntityPlayer.inventory.hasItemStack(new ItemStack(CCItems.honeyBolt))) {
            float f = j / 20.0F;
            f = (f * f + f * 4.0F) / 3.0F;

            f /= 8;

            if ((double) f < 1.0F) {
                return;
            }

            if (f > 1.0F) {
                f = 1.0F;
            }

            EntityCandyArrow entityarrow = new EntityCandyArrow(par2World, par3EntityPlayer, f * 3.0F);
            entityarrow.setBolt(true);

            if (f == 1.0F) {
                entityarrow.setIsCritical(true);
            }

            int k = EnchantmentHelper.getEnchantmentLevel(Enchantments.POWER, par1ItemStack);

            if (k > 0) {
                entityarrow.setDamage(entityarrow.getDamage() + k * 0.5D + 0.5D + 8.0D);
            }

            int l = EnchantmentHelper.getEnchantmentLevel(Enchantments.PUNCH, par1ItemStack);

            if (l > 0) {
                entityarrow.setKnockbackStrength(l);
            }
            int l2 = EnchantmentHelper.getEnchantmentLevel(CCEnchantments.honeyGlue, par1ItemStack);

            if (l2 > 0) {
                entityarrow.slow = l2;
            }
            if (EnchantmentHelper.getEnchantmentLevel(Enchantments.FLAME, par1ItemStack) > 0) {
                entityarrow.setFire(100);
            }

            par1ItemStack.damageItem(1, par3EntityPlayer);
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 1.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 1.6F) + f * 0.5F);

            if (flag) {
                entityarrow.canBePickedUp = 2;
            } else {
                par3EntityPlayer.inventory.consumeInventoryItem(CCItems.honeyBolt);
            }

            entityarrow.canBePickedUp = 1;

            if (!par2World.isRemote) {
                par2World.spawnEntityInWorld(entityarrow);
            }
        }
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return EnumAction.BOW;
    }

    @Override
    public ItemStack onItemUseFinish(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        return par1ItemStack;
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 72000;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
        if (par3EntityPlayer.capabilities.isCreativeMode || par3EntityPlayer.inventory.hasItemStack(CCItems.honeyBolt)) {
            par3EntityPlayer.setItemInUse(par1ItemStack, getMaxItemUseDuration(par1ItemStack));
        }

        return par1ItemStack;
    }

    @Override
    public int getItemEnchantability() {
        return 1;
    }
    /*
     * @Override
     *
     * @SideOnly(Side.CLIENT) public ModelResourceLocation getModel(ItemStack
     * stack, EntityPlayer player, int useRemaining) { if (stack != null &&
     * stack.getItem() == CCItems.caramelCrossbow && useRemaining != 0) { int j
     * = 72000 - useRemaining;
     *
     * if (j >= 72) { return ClientProxy.crossAn3; }
     *
     * if (j > 48) { return ClientProxy.crossAn2; }
     *
     * if (j > 0) { return ClientProxy.crossAn1; } }
     *
     * return null; }
     */
}
