package com.japaricraft.japaricraftmod.tool;

import net.minecraft.item.ItemSpade;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class SandStarShovel extends ItemSpade{

    public SandStarShovel(ToolMaterial SandStar) {
        super(SandStar);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SandStarShovel");
    }
}