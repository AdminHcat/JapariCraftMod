package com.japaricraft.japaricraftmod.block;

import com.japaricraft.japaricraftmod.JapariCraftMod;
import com.japaricraft.japaricraftmod.hander.JapariItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSandStarOre extends Block {

    public BlockSandStarOre() {
        super(Material.ROCK);
        this.setCreativeTab(JapariCraftMod.tabJapariCraft);
        this.setUnlocalizedName("sandstar_ore");
        this.setHardness(5f);
        this.setResistance(0f);
        this.setHarvestLevel("pickaxe", 2);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return JapariItems.sandstarfragment;
    }

    // 幸運でドロップする量の設定。(幸運で掘った時にドロップする量をランダムにできる)
    @Override
    public int quantityDroppedWithBonus(int level, Random random) {
        if (level > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, level)) {
            int j = random.nextInt(level + 2) - 1;
            if (j < 0) {
                j = 0;
            }
            return this.quantityDropped(random) * (j + 1);
        } else {
            return this.quantityDropped(random);
        }
    }


    @Override
    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) {
        return true;
    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        Random rand = new Random();
        return rand.nextInt(5) + 3;
    }
}
