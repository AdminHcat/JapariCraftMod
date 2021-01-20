package com.japaricraft.japaricraftmod;

import com.japaricraft.japaricraftmod.gui.JapariGuiHandler;
import com.japaricraft.japaricraftmod.hander.JapariBlocks;
import com.japaricraft.japaricraftmod.hander.JapariItems;
import com.japaricraft.japaricraftmod.mob.JapariEntityRegistry;
import com.japaricraft.japaricraftmod.mob.JapariRenderingRegistry;
import com.japaricraft.japaricraftmod.world.ComponentJapariHouse1;
import com.japaricraft.japaricraftmod.world.SandStarOreGenerator;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.gen.structure.MapGenStructureIO;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.VillagerRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;


@Mod(modid = JapariCraftMod.MODID, name = JapariCraftMod.MODNAME, version = JapariCraftMod.VERSION, useMetadata = true,updateJSON = "https://github.com/pentantan/JapariCraftMod/blob/master/src/main/japaricraftmod.json")
public class JapariCraftMod {

    public static final String MODID = "japaricraftmod";
    public static final String VERSION = "3.3.1";
    public static final String MODNAME = "JapariCraftMod";


    //Modの情報を格納する。 mcmod.infoの上位互換
    @Mod.Metadata
    public static ModMetadata metadata;

    @SidedProxy(clientSide = "com.japaricraft.japaricraftmod.ClientProxy", serverSide = "com.japaricraft.japaricraftmod.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static JapariCraftMod instance;
    public static final int ID_JAPARI_INVENTORY = 1;
    public static final CreativeTabs tabJapariCraft = new TabJapariCraft("JapariCraftTab");
    public static VillagerRegistry.VillagerProfession japariProfession;

    @EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event)
    {
        IForgeRegistry<Block> registry = event.getRegistry();

        JapariBlocks.registerBlocks(registry);
    }
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        JapariBlocks.registerItemBlocks(registry);
        JapariItems.registerItems(registry);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void registerModels(ModelRegistryEvent event) {
        JapariBlocks.registerModels();
        JapariItems.registerModels();
    }

    @SubscribeEvent
    public void registerEntityEntries(RegistryEvent.Register<EntityEntry> event)
    {
        JapariEntityRegistry.registerEntities();
    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        GameRegistry.registerWorldGenerator(new SandStarOreGenerator(), 0);
        if (event.getSide().isClient())
        {
            JapariRenderingRegistry.registerRenderers();
        }
        MinecraftForge.EVENT_BUS.register(new LootTableEventHandler());
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new JapariGuiHandler());
        //メタ情報の登録
        loadMeta();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        JapariEntityRegistry.addSpawns();
        // チャンク生成時に追加構造物の生成が行われるようにフック
        VillagerRegistry villageRegistry = VillagerRegistry.instance();
        VillagerRegistry.instance().registerVillageCreationHandler(new ComponentJapariHouse1.VillageManager());
        MapGenStructureIO.registerStructureComponent(ComponentJapariHouse1.class, "JH1");

        //Villagerのレンダー

        japariProfession = new VillagerRegistry.VillagerProfession(JapariCraftMod.MODID + ":zookeeper","japaricraftmod:textures/entity/zookeeper.png", "japaricraftmod:textures/entity/zookeeper_zombie.png");
        ForgeRegistries.VILLAGER_PROFESSIONS.register(japariProfession);
        VillagerRegistry.VillagerCareer career_zookeeper = new VillagerRegistry.VillagerCareer(japariProfession, MODID + ".zookeeper");
        career_zookeeper.addTrade(1,
                new EntityVillager.EmeraldForItems(Items.WHEAT, new EntityVillager.PriceInfo(18, 22)),
                new EntityVillager.EmeraldForItems(Items.APPLE, new EntityVillager.PriceInfo(12, 18)),
                new EntityVillager.EmeraldForItems(Items.SUGAR, new EntityVillager.PriceInfo(14, 19)),
                new EntityVillager.EmeraldForItems(Items.CARROT, new EntityVillager.PriceInfo(15, 19))
        );
        career_zookeeper.addTrade(2,
                new EntityVillager.ListItemForEmeralds(JapariItems.japariman, new EntityVillager.PriceInfo(-10, -18)),
                new EntityVillager.ListItemForEmeralds(JapariItems.japarimanapple, new EntityVillager.PriceInfo(-10, -18)),
                new EntityVillager.ListItemForEmeralds(JapariItems.kabanhat, new EntityVillager.PriceInfo(1, 2))
        );
        career_zookeeper.addTrade(3,
                new EntityVillager.EmeraldForItems(Items.SLIME_BALL, new EntityVillager.PriceInfo(8, 14)),
                new EntityVillager.ListItemForEmeralds(JapariItems.sandstarsword, new EntityVillager.PriceInfo(13,17)),
                new EntityVillager.ListItemForEmeralds(JapariItems.sandstarpickaxe, new EntityVillager.PriceInfo(13, 18)),
                new EntityVillager.ListItemForEmeralds(JapariItems.wildliberationpotion, new EntityVillager.PriceInfo(8, 13))
        );
    }
    private void loadMeta() {
        metadata.modId = MODID;
        metadata.name = MODNAME;
        metadata.version = VERSION;
        metadata.description = ("けもフレ関連のアイテムを追加します");
        metadata.credits = ("モデル製作者:dragon");
        metadata.logoFile = ("assets/japaricraftmod/textures/logo.png");
        metadata.url=("https://minecraft.curseforge.com/projects/japaricraftmod");
        
        metadata.autogenerated = false;
    }
}

