package net.mcreator.endgamereborn.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.endgamereborn.EndgameRebornMod;

import java.util.Map;

public class EndStoneDustPlayerFinishesUsingItemProcedure {

	public static void execute(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				EndgameRebornMod.LOGGER.warn("Failed to load dependency entity for procedure EndStoneDustPlayerFinishesUsingItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (Mth.nextDouble(RandomSource.create(), 0, 10) >= 3) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 300, 0));
		}
		if (Mth.nextDouble(RandomSource.create(), 0, 10) >= 9) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200, 0));
		}
		if (Mth.nextDouble(RandomSource.create(), 0, 20) >= 19) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 100, 0));
		}
	}
}
