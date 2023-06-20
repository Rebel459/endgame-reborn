
package net.mcreator.endgamereborn.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

public class EndStoneHoeItem extends HoeItem {
	public EndStoneHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 255;
			}

			public float getSpeed() {
				return 3f;
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
				return Ingredient.of(new ItemStack(Blocks.END_STONE));
			}
		}, 0, -2f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
