package com.valentin4311.candycraftmod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockChewingGumPlate extends BlockChewingGum {
    protected static final AxisAlignedBB GUM_PLATE_AABB = new AxisAlignedBB(0.0F, 0.0F, 0.0F, 1.0F, 0.15625F, 1.0F);

    public BlockChewingGumPlate(Material p_i45394_1_) {
        super(p_i45394_1_);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
        return GUM_PLATE_AABB;
    }

    @Override
    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, World worldIn, BlockPos pos) {
        return null;
    }

    @Override
    public boolean canPlaceBlockAt(World par1World, BlockPos pos) {
        IBlockState i = par1World.getBlockState(pos.down());
        return i.isOpaqueCube();
    }

    @Override
    public void neighborChanged(IBlockState state, World par1World, BlockPos pos, Block par5) {
        if (!canPlaceBlockAt(par1World, pos)) {
            par1World.setBlockToAir(pos);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT;
    }
}
