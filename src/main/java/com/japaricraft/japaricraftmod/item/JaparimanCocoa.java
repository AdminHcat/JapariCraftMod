
package com.japaricraft.japaricraftmod.item;


import net.minecraft.item.ItemFood;


import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class JaparimanCocoa extends ItemFood {
    public JaparimanCocoa() {
        super(5,3,false);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("JaparimanCocoa");
    }

}