
package net.mcreator.endgamereborn.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

public class PoppedChorusHoeItem extends HoeItem {
	public PoppedChorusHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 127;
			}

			public float getSpeed() {
				return 5f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 12;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.POPPED_CHORUS_FRUIT));
			}
		}, 0, -1f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
