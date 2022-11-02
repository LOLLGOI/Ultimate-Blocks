
package net.mcreator.ultimateblocks.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.ultimateblocks.init.UltimateBlocksModSounds;

public class EvilMortyTheSourceItem extends RecordItem {
	public EvilMortyTheSourceItem() {
		super(0, UltimateBlocksModSounds.REGISTRY.get(new ResourceLocation("ultimate_blocks:evil_morty")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
