package com.japaricraft.japaricraftmod.block;

import com.japaricraft.japaricraftmod.hander.JapariItems;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockWoodenBox extends Block {
    public BlockWoodenBox() {
        super(Material.WOOD);
        setUnlocalizedName("WoodenBox");
        setHardness(0.2F);
        setResistance(0.4F);
        setSoundType(SoundType.WOOD);
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if (rand.nextInt(5) == 0){
            return Items.APPLE;
        }
        else if (rand.nextInt(7) == 0){
            return Items.IRON_NUGGET;
        }
        else if (rand.nextInt(10) == 0){
            return Items.GOLD_NUGGET;
        }
        else if (rand.nextInt(18) == 0){
            return Items.GOLDEN_APPLE;
        }
        else if (rand.nextInt(25) == 0){
            return JapariItems.sandstarfragment;
        }
        else if (rand.nextInt(28) == 0){

            return JapariItems.sandstarpickaxe;

        }
        else{
            return Items.STICK;
        }
    }
    public int quantityDropped(Random random)
    {
        return 4;
    }
}
