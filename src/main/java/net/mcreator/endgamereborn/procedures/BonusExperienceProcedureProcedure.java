package net.mcreator.endgamereborn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ExperienceOrb;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.endgamereborn.EndgameRebornMod;

import java.util.Map;

public class BonusExperienceProcedureProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EndgameRebornMod.LOGGER.warn("Failed to load dependency world for procedure BonusExperienceProcedure!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndgameRebornMod.LOGGER.warn("Failed to load dependency entity for procedure BonusExperienceProcedure!");
			return;
		}
		LevelAccessor world = (LevelAccessor) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (Mth.nextDouble(RandomSource.create(), 1, 10) >= 9) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, (entity.getX()), (entity.getY()), (entity.getZ()), 1));
		}
	}
}
