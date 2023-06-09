
package net.mcreator.endgamereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.endgamereborn.init.EndgameRebornModItems;

public class GildedSteelShovelItem extends ShovelItem {
	public GildedSteelShovelItem() {
		super(new Tier() {
			public int getUses() {
				return 2735;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 5.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(EndgameRebornModItems.GILDED_STEEL_INGOT), new ItemStack(Items.NETHERITE_INGOT), new ItemStack(Items.NETHERITE_SCRAP));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).fireResistant());
	}
}
