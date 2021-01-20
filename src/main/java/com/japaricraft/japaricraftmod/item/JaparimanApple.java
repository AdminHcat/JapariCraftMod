package com.japaricraft.japaricraftmod.item;

import net.minecraft.item.ItemFood;


import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;

public class JaparimanApple extends ItemFood {
    public JaparimanApple() {
        super(7, 4, false);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("JaparimanApple");
    }

}