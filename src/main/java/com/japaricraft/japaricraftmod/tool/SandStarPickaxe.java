package com.japaricraft.japaricraftmod.tool;

import net.minecraft.item.ItemPickaxe;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class SandStarPickaxe extends ItemPickaxe {
    public SandStarPickaxe(ToolMaterial SandStar) {
        super(SandStar);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SandStarPickaxe");
    }
}
