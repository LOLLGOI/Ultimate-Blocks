
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateblocks.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class UltimateBlocksModTabs {
	public static CreativeModeTab TAB_ULTIMATE;

	public static void load() {
		TAB_ULTIMATE = new CreativeModeTab("tabultimate") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(UltimateBlocksModItems.ULTIMATE_SWORD.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
