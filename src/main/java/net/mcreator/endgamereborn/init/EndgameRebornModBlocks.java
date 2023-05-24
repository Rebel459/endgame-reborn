
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endgamereborn.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

import net.mcreator.endgamereborn.block.RemnantSteelOreBlock;
import net.mcreator.endgamereborn.EndgameRebornMod;

public class EndgameRebornModBlocks {
	public static Block REMNANT_STEEL_ORE;

	public static void load() {
		REMNANT_STEEL_ORE = Registry.register(Registry.BLOCK, new ResourceLocation(EndgameRebornMod.MODID, "remnant_steel_ore"), new RemnantSteelOreBlock());
	}

	public static void clientLoad() {
		RemnantSteelOreBlock.clientInit();
	}
}
