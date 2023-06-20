
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endgamereborn.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.endgamereborn.block.RemnantSteelOreBlock;
import net.mcreator.endgamereborn.block.EndStoneRemnantBlock;
import net.mcreator.endgamereborn.block.EndSoilBlock;
import net.mcreator.endgamereborn.block.ChorusClusterBlock;
import net.mcreator.endgamereborn.EndgameRebornMod;

public class EndgameRebornModBlocks {
	public static Block REMNANT_STEEL_ORE;
	public static Block END_STONE_REMNANT;
	public static Block END_SOIL;
	public static Block CHORUS_CLUSTER;

	public static void load() {
		REMNANT_STEEL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(EndgameRebornMod.MODID, "remnant_steel_ore"), new RemnantSteelOreBlock());
		END_STONE_REMNANT = Registry.register(Registry.BLOCK, new ResourceLocation(EndgameRebornMod.MODID, "end_stone_remnant"), new EndStoneRemnantBlock());
		END_SOIL = Registry.register(Registry.BLOCK, new ResourceLocation(EndgameRebornMod.MODID, "end_soil"), new EndSoilBlock());
		CHORUS_CLUSTER = Registry.register(Registry.BLOCK, new ResourceLocation(EndgameRebornMod.MODID, "chorus_cluster"), new ChorusClusterBlock());
	}

	public static void clientLoad() {
		RemnantSteelOreBlock.clientInit();
		EndStoneRemnantBlock.clientInit();
		EndSoilBlock.clientInit();
		ChorusClusterBlock.clientInit();
	}
}
