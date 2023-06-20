
package net.mcreator.endgamereborn.item;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class EndStoneSwordItem extends SwordItem {
	public EndStoneSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 255;
			}

			public float getSpeed() {
				return 3f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 3, -2.4000000000000001f, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT));
	}
}
