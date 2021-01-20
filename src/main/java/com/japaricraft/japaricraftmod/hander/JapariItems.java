package com.japaricraft.japaricraftmod.hander;


import com.japaricraft.japaricraftmod.JapariCraftMod;
import com.japaricraft.japaricraftmod.SandStarSword;
import com.japaricraft.japaricraftmod.item.*;
import com.japaricraft.japaricraftmod.item.summon.DarkSandStar;
import com.japaricraft.japaricraftmod.tool.SandStarAxe;
import com.japaricraft.japaricraftmod.tool.SandStarPickaxe;
import com.japaricraft.japaricraftmod.tool.SandStarShovel;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.Collections;
import java.util.List;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

public class JapariItems {
    private static final NonNullList<Item> ITEMS = NonNullList.create();

    private static Item.ToolMaterial SandStar = EnumHelper.addToolMaterial("SandStar", 3, 800, 9F, 4F, 16).setRepairItem(new ItemStack(JapariItems.sandstarfragment));
    public static final ItemArmor.ArmorMaterial KabanHatMaterial = EnumHelper.addArmorMaterial("kabanhatmaterial", MODID +":"+"textures/models/armor/kabanhat_layer_1.png", 8, new int[]{2,0,0,2}, 30, net.minecraft.init.SoundEvents.ITEM_ARMOR_EQUIP_LEATHER,0);


    public static final Item japariman = new Japariman();
    public static final Item japarimancocoa = new JaparimanCocoa();
    public static final Item japarimanapple = new JaparimanApple();
    public static final Item japarimanfruit = new JaparimanFruit();
    public static final Item goldenjapariman = new GoldenJapariman();
    public static final Item curry = new Curry();
    public static final Item starjapariman = new StarJapariman();
    public static final Item sandstarfragment = new ItemSandStarFragment();
    public static final Item darksandstar = new DarkSandStar();
    public static final Item sugarstar = new SugarStar();
    public static final Item starcaramel = new StarCaramel();
    public static final Item sandstarsword = new SandStarSword(SandStar);
    public static final Item sandstarshovel = new SandStarShovel(SandStar);
    public static final Item sandstarpickaxe = new SandStarPickaxe(SandStar);
    public static final Item sandstaraxe = new SandStarAxe(SandStar, 8.0F, -2.9F);
    public static final Item wildliberationsource = new WildLiberationSource();
    public static final Item wildliberationpotion = new WildLiberationPotion();
    public static final Item kabanhat= new ItemKabanHat(KabanHatMaterial, 0, EntityEquipmentSlot.HEAD);
    public static final Item japaricoin = new ItemJapariCoin();

    public static List<Item> getItems()
    {
        return Collections.unmodifiableList(ITEMS);
    }

    public static Item registerItem(Item item, String name) {
        return registerItem(item, name, JapariCraftMod.tabJapariCraft);
    }

    public static Item registerItem(Item item, String name, CreativeTabs tab) {
        item.setUnlocalizedName(name);
        if (tab != null) {
            item.setCreativeTab(JapariCraftMod.tabJapariCraft);
        }

        item.setRegistryName(new ResourceLocation(JapariCraftMod.MODID, name));
        ForgeRegistries.ITEMS.register(item);
        JapariCraftMod.proxy.registerItemSided(item);

        return item;
    }

    public static void register(IForgeRegistry<Item> registry, Item item)
    {
        ITEMS.add(item);

        if (item instanceof ItemBlock && item.getRegistryName() == null)
        {
            item.setRegistryName(((ItemBlock)item).getBlock().getRegistryName());
        }

        registry.register(item);
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        register(registry, japariman.setRegistryName("japariman"));
        register(registry, japarimancocoa.setRegistryName("japarimancocoa"));
        register(registry, japarimanapple.setRegistryName("japarimanapple"));
        register(registry, japarimanfruit.setRegistryName("japarimanfruit"));
        register(registry, goldenjapariman.setRegistryName("goldenjapariman"));
        register(registry, curry.setRegistryName("curry"));
        register(registry, starjapariman.setRegistryName("starjapariman"));
        register(registry, darksandstar.setRegistryName("darksandstar"));
        register(registry, starcaramel.setRegistryName("starcaramel"));
        register(registry, sugarstar.setRegistryName("sugarstar"));
        register(registry, sandstarsword.setRegistryName("sandstarsword"));
        register(registry, sandstarpickaxe.setRegistryName("sandstarpickaxe"));
        register(registry, sandstarshovel.setRegistryName("sandstarshovel"));
        register(registry, sandstaraxe.setRegistryName("sandstaraxe"));
        register(registry, sandstarfragment.setRegistryName("sandstar_fragment"));
        register(registry, wildliberationpotion.setRegistryName("wildliberationpotion"));
        register(registry, wildliberationsource.setRegistryName("wildliberationsource"));
        register(registry, kabanhat.setRegistryName("kabanhat"));
        register(registry, japaricoin.setRegistryName("japaricoin"));
        OreDictionary.registerOre("sandstar", sandstarfragment);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels()
    {
        registerModel(japariman,"japariman");
        registerModel(japarimancocoa,"japariman_cocoa");
        registerModel(japarimanapple,"japariman_apple");
        registerModel(japarimanfruit,"japariman_fruit");
        registerModel(goldenjapariman,"golden_japariman");
        registerModel(curry,"curry");
        registerModel(starjapariman,"star_japariman");
        registerModel(darksandstar,"darksandstar");
        registerModel(starcaramel,"star_caramel");
        registerModel(sugarstar,"sugarstar");
        registerModel(sandstarsword,"sandstar_sword");
        registerModel(sandstarpickaxe,"sandstar_pickaxe");
        registerModel(sandstarshovel,"sandstar_shovel");
        registerModel(sandstaraxe, "sandstar_axe");
        registerModel(wildliberationpotion,"wildliberation_potion");
        registerModel(wildliberationsource,"wildliberation_source");
        registerModel(kabanhat,"kabanhat");
        registerModel(sandstarfragment,"sandstar_fragment");
        registerModel(japaricoin, "japaricoin");
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item, String modelName)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(MODID + ":" + modelName, "inventory"));
    }

    @SideOnly(Side.CLIENT)
    public static void registerModel(Item item)
    {
        registerModel(item, item.getRegistryName().getResourcePath());
    }
}
