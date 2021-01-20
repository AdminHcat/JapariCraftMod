package com.japaricraft.japaricraftmod;


import com.japaricraft.japaricraftmod.hander.JapariItems;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LootTableEventHandler {
    @SubscribeEvent
    public void onLootTableLoad(LootTableLoadEvent event)
    {
        if (event.getName().equals(LootTableList.CHESTS_WOODLAND_MANSION))
        {
            LootPool main = event.getTable().getPool("main");
            if (main != null)
            {
                main.addEntry(new LootEntryItem(JapariItems.sandstarfragment, 6, 2, new LootFunction[0], new LootCondition[0], "japaricraftmod:sandstarfragment"));
                main.addEntry(new LootEntryItem(JapariItems.sandstaraxe, 4, 2, new LootFunction[0], new LootCondition[0], "japaricraftmod:sandstaraxe"));
            }
        }
        if (event.getName().equals(LootTableList.CHESTS_SPAWN_BONUS_CHEST))
        {
            LootPool main = event.getTable().getPool("main");
            if (main != null)
            {
                main.addEntry(new LootEntryItem(JapariItems.japariman, 5, 4, new LootFunction[0], new LootCondition[0], "japaricraftmod:japariman"));
                main.addEntry(new LootEntryItem(JapariItems.japarimanapple, 5, 4, new LootFunction[0], new LootCondition[0], "japaricraftmod:japarimanapple"));
                main.addEntry(new LootEntryItem(JapariItems.japarimancocoa, 5, 4, new LootFunction[0], new LootCondition[0], "japaricraftmod:japarimancocoa"));
            }
        }
        if (event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT))
        {
            LootPool main = event.getTable().getPool("main");
            if (main != null)
            {
                main.addEntry(new LootEntryItem(JapariItems.sandstarpickaxe, 5, 1, new LootFunction[0], new LootCondition[0], "japaricraftmod:sandstarpickaxe"));
                main.addEntry(new LootEntryItem(JapariItems.sandstarfragment, 7, 3, new LootFunction[0], new LootCondition[0], "japaricraftmod:sandstarfragment"));
                main.addEntry(new LootEntryItem(JapariItems.japaricoin, 1, 2, new LootFunction[0], new LootCondition[0], "japaricraftmod:japaricoin"));
            }
        }
    }
}
