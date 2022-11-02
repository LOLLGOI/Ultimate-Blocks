
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.ultimateblocks.block.UltimateErzBlock;
import net.mcreator.ultimateblocks.UltimateBlocksMod;

public class UltimateBlocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, UltimateBlocksMod.MODID);
	public static final RegistryObject<Block> ULTIMATE_ERZ = REGISTRY.register("ultimate_erz", () -> new UltimateErzBlock());
}
