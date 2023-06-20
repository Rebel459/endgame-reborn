
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endgamereborn.init;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.endgamereborn.world.features.ores.RemnantSteelOreFeature;
import net.mcreator.endgamereborn.world.features.ores.EndStoneRemnantFeature;
import net.mcreator.endgamereborn.world.features.ores.EndSoilFeature;
import net.mcreator.endgamereborn.EndgameRebornMod;

import net.fabricmc.fabric.api.biome.v1.BiomeSelectionContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;

import java.util.function.Predicate;

public class EndgameRebornModFeatures {
	public static void load() {
		register("remnant_steel_ore", RemnantSteelOreFeature.feature(), RemnantSteelOreFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("end_stone_remnant", EndStoneRemnantFeature.feature(), EndStoneRemnantFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
		register("end_soil", EndSoilFeature.feature(), EndSoilFeature.GENERATE_BIOMES, GenerationStep.Decoration.UNDERGROUND_ORES);
	}

	private static void register(String registryName, Feature feature, Predicate<BiomeSelectionContext> biomes, GenerationStep.Decoration genStep) {
		Registry.register(Registry.FEATURE, new ResourceLocation(EndgameRebornMod.MODID, registryName), feature);
		BiomeModifications.addFeature(biomes, genStep, ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(EndgameRebornMod.MODID, registryName)));
	}
}
