package com.japaricraft.japaricraftmod.hander;


import com.japaricraft.japaricraftmod.JapariCraftMod;
import com.japaricraft.japaricraftmod.mob.SandStarHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.storage.loot.*;
import net.minecraft.world.storage.loot.properties.EntityProperty;
import net.minecraft.world.storage.loot.properties.EntityPropertyManager;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JapariTreasure {
    public static final ResourceLocation humanhouse = register("chest/humanhouse");
    private ResourceLocation lootTable;


    public static void init() {
        LootTableList.register(SandStarHandler.LOOT_TABLE);
    }
    private static ResourceLocation register(String id) {
        return LootTableList.register(new ResourceLocation(JapariCraftMod.MODID, id));
    }

    private static ResourceLocation register(EntityProperty.Serializer<?> serializer) {
        EntityPropertyManager.registerProperty(serializer);
        return serializer.getName();
    }

    public static ArrayList<ItemStack> getItemsFromTable(ResourceLocation lootTable, World world) {
        ArrayList<ItemStack> items = new ArrayList<>();

        LootTable table = world.getLootTableManager().getLootTableFromLocation(lootTable);
        LootContext.Builder lootBuilder = (new LootContext.Builder((WorldServer) world));
        Field f = ReflectionHelper.findField(LootTable.class, "pools", "field_186466_c", "c");
        List<LootPool> pools = null;
        try {
            pools = (List<LootPool>) f.get(table);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if (pools != null && pools.size() > 0) {
            for (LootPool pool : pools) {
                Field f2 = ReflectionHelper.findField(LootPool.class, "lootEntries", "field_186453_a", "a");
                List<LootEntry> entries = null;
                try {
                    entries = (List<LootEntry>) f2.get(pool);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                if (entries != null && entries.size() > 0) {
                    for (LootEntry entry:entries) {
                        if (entry instanceof LootEntryItem) {
                            entry.addLoot(items, new Random(), lootBuilder.build());
                        }
                    }
                }
            }
        }
        return items;
    }
}
