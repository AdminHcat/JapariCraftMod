package com.japaricraft.japaricraftmod.block;

import com.japaricraft.japaricraftmod.JapariCraftMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockSandStar extends Block {
    public BlockSandStar()
    {
        super(Material.ICE);
        setCreativeTab(JapariCraftMod.tabJapariCraft);
        setUnlocalizedName("SandStarBlock");
        setHardness(4.0F);/*硬さ*/
        setResistance(30.0F);/*爆破耐性*/
        setSoundType(SoundType.GLASS);
        setLightLevel(10);
        setHarvestLevel("pickaxe",1);
    }
    //ブロックの描画
    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
    @Override
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullCube(IBlockState state)
    {
        return false;
    }

    @Override
    public boolean isFullBlock(IBlockState state)
    {
        return false;
    }

}