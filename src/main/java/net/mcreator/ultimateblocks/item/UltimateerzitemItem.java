
package net.mcreator.ultimateblocks.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.ultimateblocks.init.UltimateBlocksModTabs;

public class UltimateerzitemItem extends Item {
	public UltimateerzitemItem() {
		super(new Item.Properties().tab(UltimateBlocksModTabs.TAB_ULTIMATE).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(this);
	}
}
