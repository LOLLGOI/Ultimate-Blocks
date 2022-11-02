
package net.mcreator.ultimateblocks.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.ultimateblocks.init.UltimateBlocksModTabs;
import net.mcreator.ultimateblocks.init.UltimateBlocksModItems;

import java.util.List;

public class UltimateSwordItem extends Item {
	public UltimateSwordItem() {
		super(new Item.Properties().tab(UltimateBlocksModTabs.TAB_ULTIMATE).durability(2031).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack itemstack) {
		return new ItemStack(UltimateBlocksModItems.ULTIMATE_SWORD.get());
	}

	@Override
	public int getEnchantmentValue() {
		return 15;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent("The Strongest Sword"));
	}
}
