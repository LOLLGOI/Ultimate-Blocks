
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.ultimateblocks.item.UltimateerzitemItem;
import net.mcreator.ultimateblocks.item.UltimateSwordItem;
import net.mcreator.ultimateblocks.item.EvilMortyTheSourceItem;
import net.mcreator.ultimateblocks.UltimateBlocksMod;

public class UltimateBlocksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, UltimateBlocksMod.MODID);
	public static final RegistryObject<Item> ULTIMATE_SWORD = REGISTRY.register("ultimate_sword", () -> new UltimateSwordItem());
	public static final RegistryObject<Item> ULTIMATE_ERZ = block(UltimateBlocksModBlocks.ULTIMATE_ERZ, UltimateBlocksModTabs.TAB_ULTIMATE);
	public static final RegistryObject<Item> ULTIMATEERZITEM = REGISTRY.register("ultimateerzitem", () -> new UltimateerzitemItem());
	public static final RegistryObject<Item> EVIL_MORTY_THE_SOURCE = REGISTRY.register("evil_morty_the_source", () -> new EvilMortyTheSourceItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
