
package net.mcreator.endgamereborn.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.endgamereborn.init.EndgameRebornModItems;

public class AscendedSteelHoeItem extends HoeItem {
	public AscendedSteelHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 2501;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EndgameRebornModItems.ASCENDED_STEEL_INGOT), new ItemStack(Blocks.GLOWSTONE));
			}
		}, 0, 0f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
