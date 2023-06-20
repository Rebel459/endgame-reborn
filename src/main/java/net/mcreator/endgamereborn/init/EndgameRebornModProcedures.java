
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.endgamereborn.init;

import net.mcreator.endgamereborn.procedures.ProsperousEmeraldProcedureProcedure;
import net.mcreator.endgamereborn.procedures.EndStoneDustPlayerFinishesUsingItemProcedure;
import net.mcreator.endgamereborn.procedures.BonusExperienceProcedureProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class EndgameRebornModProcedures {
	public static void load() {
		new EndStoneDustPlayerFinishesUsingItemProcedure();
		new ProsperousEmeraldProcedureProcedure();
		new BonusExperienceProcedureProcedure();
	}
}
