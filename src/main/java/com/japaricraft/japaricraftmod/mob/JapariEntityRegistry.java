package com.japaricraft.japaricraftmod.mob;


import com.google.common.collect.Lists;
import com.japaricraft.japaricraftmod.JapariCraftMod;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.registry.EntityRegistry;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static com.japaricraft.japaricraftmod.JapariCraftMod.instance;
import static net.minecraftforge.common.BiomeDictionary.Type.*;

public class JapariEntityRegistry {
    public static void registerEntities() {
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.KouteiPenguin"), KouteiPenguin.class, "KouteiPenguin", 1, instance, 60, 1, true, 2243405, 7375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Cerulean"), Cerulean.class, "Cerulean", 2, instance, 60, 1, false, 4243405, 7375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Serval"), Serval.class, "Serval", 3, instance, 60, 1, true, 16703405, 6375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Shoebill"), Shoebill.class, "Shoebill", 5, instance, 60, 1, true, 7375001, 10000);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.WhiteOwl"), WhiteOwl.class, "WhiteOwl", 6, instance, 60, 1, true, 7375001, 7375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.BrownOwl"), BrownOwl.class, "BrownOwl", 7, instance, 60, 1, true, 5243410, 5243405);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Araisan"), Araisan.class, "Araisan", 12, instance, 60, 1, true, 0x666699, 0x969696);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Fennec"), Fennec.class, "Fennec", 14, instance, 60, 1, true, 13434879, 13408767);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.PoisonCerulean"), PoisonCerulean.class, "PoisonCerulean", 13, instance, 60, 1, false, 4243405, 7375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Guide"), Guide.class, "Guide", 11, instance, 60, 1, false);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.SandStarHandler"), SandStarHandler.class, "SandStarHandler", 15, instance, 60, 1, false, 9868950, 13434879);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.RoyalPenguin"), RoyalPenguin.class, "RoyalPenguin", 16, instance, 60, 1, false, 2243405, 7375001);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Alpaca"), Alpaca.class, "Alpaca", 17, instance, 60, 1, false, 0xf0f5f0, 0xf5f5dc);
        EntityRegistry.registerModEntity(new ResourceLocation(JapariCraftMod.MODID, "mobs.Squirre"), Squirre.class, "Squirre", 18, instance, 60, 1, false, 0xf0f5f0, 0x993300);

    }
    public static void addSpawns()
    {
        //Biomeの種類で湧くように
        List<BiomeManager.BiomeEntry> biomeEntries = new ArrayList<BiomeManager.BiomeEntry>();
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeManager.BiomeType.COOL));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeManager.BiomeType.DESERT));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeManager.BiomeType.ICY));
        biomeEntries.addAll(BiomeManager.getBiomes(BiomeManager.BiomeType.WARM));
        List<Biome> biomes = new ArrayList<Biome>();
        for (BiomeManager.BiomeEntry b : biomeEntries) {
            biomes.add(b.biome);
        }
        biomes.addAll(BiomeManager.oceanBiomes);
        List<Biome> snow_biomes = Lists.newArrayList();
        for (Biome biome : Biome.REGISTRY) {
            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
            if (types.contains(SNOWY) && !types.contains(FOREST) && !types.contains(SANDY)&& !types.contains(NETHER) && !biome.getSpawnableList(EnumCreatureType.CREATURE).isEmpty()) {
                snow_biomes.add(biome);
            }
        }
        List<Biome> plain_biomes = Lists.newArrayList();
        for (Biome biome : Biome.REGISTRY) {
            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
            if (types.contains(PLAINS) && !types.contains(SNOWY) && !types.contains(NETHER) && !biome.getSpawnableList(EnumCreatureType.CREATURE).isEmpty()) {
                plain_biomes.add(biome);
            }
        }
        List<Biome> forest_biomes = Lists.newArrayList();
        for (Biome biome : Biome.REGISTRY) {
            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
            if (types.contains(FOREST) && !types.contains(SNOWY) && !types.contains(NETHER) && !biome.getSpawnableList(EnumCreatureType.CREATURE).isEmpty()) {
                forest_biomes.add(biome);
            }
        }
        List<Biome> sandy_biomes = Lists.newArrayList();
        for (Biome biome : Biome.REGISTRY) {
            Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(biome);
            if (types.contains(SANDY) && !types.contains(SNOWY) && !types.contains(WASTELAND) && !types.contains(NETHER) && !biome.getSpawnableList(EnumCreatureType.CREATURE).isEmpty()) {
                sandy_biomes.add(biome);
            }
        }
        EntityRegistry.addSpawn(Fennec.class, 6, 1, 2, EnumCreatureType.CREATURE, sandy_biomes.toArray(new Biome[sandy_biomes.size()]));
        EntityRegistry.addSpawn(KouteiPenguin.class, 6, 1, 3, EnumCreatureType.CREATURE, snow_biomes.toArray(new Biome[snow_biomes.size()]));
        EntityRegistry.addSpawn(RoyalPenguin.class, 6, 1, 3, EnumCreatureType.CREATURE, snow_biomes.toArray(new Biome[snow_biomes.size()]));
        EntityRegistry.addSpawn(Serval.class, 10, 2, 3, EnumCreatureType.CREATURE, Biome.getBiome(35), Biome.getBiome(36), Biome.getBiome(163));
        EntityRegistry.addSpawn(Shoebill.class, 9, 2, 3, EnumCreatureType.CREATURE, forest_biomes.toArray(new Biome[forest_biomes.size()]));
        EntityRegistry.addSpawn(Araisan.class, 9, 2, 3, EnumCreatureType.CREATURE, forest_biomes.toArray(new Biome[forest_biomes.size()]));
        EntityRegistry.addSpawn(WhiteOwl.class, 9, 2, 2, EnumCreatureType.CREATURE, forest_biomes.toArray(new Biome[forest_biomes.size()]));
        EntityRegistry.addSpawn(BrownOwl.class, 9, 2, 2, EnumCreatureType.CREATURE, forest_biomes.toArray(new Biome[forest_biomes.size()]));
        EntityRegistry.addSpawn(Squirre.class, 9, 2, 3, EnumCreatureType.CREATURE, forest_biomes.toArray(new Biome[forest_biomes.size()]));
        EntityRegistry.addSpawn(Cerulean.class, 32, 2, 4, EnumCreatureType.MONSTER, biomes.toArray(new Biome[biomes.size()]));
        EntityRegistry.addSpawn(PoisonCerulean.class, 27, 2, 4, EnumCreatureType.MONSTER, Biomes.SWAMPLAND);
        EntityRegistry.addSpawn(Alpaca.class, 9, 2, 3, EnumCreatureType.CREATURE, Biome.getBiome(3), Biome.getBiome(34), Biome.getBiome(162));
    }
}
