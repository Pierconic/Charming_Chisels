
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charmingchisels.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.charmingchisels.item.RedstoneInsetItem;
import net.mcreator.charmingchisels.item.QuartzInsetItem;
import net.mcreator.charmingchisels.item.NetheriteInsetItem;
import net.mcreator.charmingchisels.item.LapisInsetItem;
import net.mcreator.charmingchisels.item.IronInsetItem;
import net.mcreator.charmingchisels.item.GoldInsetItem;
import net.mcreator.charmingchisels.item.GlowstoneInsetItem;
import net.mcreator.charmingchisels.item.EmeraldInsetItem;
import net.mcreator.charmingchisels.item.DiamondInsetItem;
import net.mcreator.charmingchisels.item.CopperInsetItem;
import net.mcreator.charmingchisels.item.ChiselThingItem;
import net.mcreator.charmingchisels.item.ChiselSwirlItem;
import net.mcreator.charmingchisels.item.ChiselSnoutItem;
import net.mcreator.charmingchisels.item.ChiselSkullItem;
import net.mcreator.charmingchisels.item.ChiselPowerupItem;
import net.mcreator.charmingchisels.item.ChiselPlainItem;
import net.mcreator.charmingchisels.item.ChiselNexusItem;
import net.mcreator.charmingchisels.item.ChiselLegendItem;
import net.mcreator.charmingchisels.item.ChiselHieroglyphItem;
import net.mcreator.charmingchisels.item.ChiselGroanItem;
import net.mcreator.charmingchisels.item.ChiselEtchingItem;
import net.mcreator.charmingchisels.item.ChiselDoomItem;
import net.mcreator.charmingchisels.item.ChiselCaveatItem;
import net.mcreator.charmingchisels.item.AmethystInsetItem;
import net.mcreator.charmingchisels.CharmingChiselsMod;

public class CharmingChiselsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CharmingChiselsMod.MODID);
	public static final DeferredItem<Item> CHISELED_QUARTZ_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_CAVEAT);
	public static final DeferredItem<Item> CHISEL_CAVEAT = REGISTRY.register("chisel_caveat", ChiselCaveatItem::new);
	public static final DeferredItem<Item> CHISEL_PLAIN = REGISTRY.register("chisel_plain", ChiselPlainItem::new);
	public static final DeferredItem<Item> DIAMOND_INSET = REGISTRY.register("diamond_inset", DiamondInsetItem::new);
	public static final DeferredItem<Item> COPPER_INSET = REGISTRY.register("copper_inset", CopperInsetItem::new);
	public static final DeferredItem<Item> IRON_INSET = REGISTRY.register("iron_inset", IronInsetItem::new);
	public static final DeferredItem<Item> GOLD_INSET = REGISTRY.register("gold_inset", GoldInsetItem::new);
	public static final DeferredItem<Item> EMERALD_INSET = REGISTRY.register("emerald_inset", EmeraldInsetItem::new);
	public static final DeferredItem<Item> LAPIS_INSET = REGISTRY.register("lapis_inset", LapisInsetItem::new);
	public static final DeferredItem<Item> AMETHYST_INSET = REGISTRY.register("amethyst_inset", AmethystInsetItem::new);
	public static final DeferredItem<Item> GLOWSTONE_INSET = REGISTRY.register("glowstone_inset", GlowstoneInsetItem::new);
	public static final DeferredItem<Item> REDSTONE_INSET = REGISTRY.register("redstone_inset", RedstoneInsetItem::new);
	public static final DeferredItem<Item> CHISELED_STONE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_STONE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_ANDESITE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_GRANITE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_GRANITE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_CAVEAT);
	public static final DeferredItem<Item> CHISELED_DIORITE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_DIORITE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_CAVEAT);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_TUFF_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_TUFF_CAVEAT);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_CAVEAT = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_CAVEAT);
	public static final DeferredItem<Item> CHISELED_QUARTZ_NEXUS = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_NEXUS);
	public static final DeferredItem<Item> CHISELED_ANDESITE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_NEXUS);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_NEXUS);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_NEXUS);
	public static final DeferredItem<Item> CHISELED_DIORITE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_DIORITE_NEXUS);
	public static final DeferredItem<Item> CHISELED_GRANITE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_GRANITE_NEXUS);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_NEXUS = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_NEXUS);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_NEXUS = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_NEXUS);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_NEXUS);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_NEXUS);
	public static final DeferredItem<Item> CHISELED_STONE_NEXUS = block(CharmingChiselsModBlocks.CHISELED_STONE_NEXUS);
	public static final DeferredItem<Item> CHISELED_TUFF_NEXUS = block(CharmingChiselsModBlocks.CHISELED_TUFF_NEXUS);
	public static final DeferredItem<Item> CHISEL_NEXUS = REGISTRY.register("chisel_nexus", ChiselNexusItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_SKULL = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_SKULL);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_SKULL = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_SKULL);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_SKULL = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_SKULL);
	public static final DeferredItem<Item> CHISELED_DIORITE_SKULL = block(CharmingChiselsModBlocks.CHISELED_DIORITE_SKULL);
	public static final DeferredItem<Item> CHISELED_GRANITE_SKULL = block(CharmingChiselsModBlocks.CHISELED_GRANITE_SKULL);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_SKULL = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_SKULL);
	public static final DeferredItem<Item> CHISELED_QUARTZ_SKULL = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_SKULL);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_SKULL = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_SKULL);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_SKULL = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_SKULL);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_SKULL = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_SKULL);
	public static final DeferredItem<Item> CHISELED_STONE_SKULL = block(CharmingChiselsModBlocks.CHISELED_STONE_SKULL);
	public static final DeferredItem<Item> CHISELED_TUFF_SKULL = block(CharmingChiselsModBlocks.CHISELED_TUFF_SKULL);
	public static final DeferredItem<Item> CHISEL_SKULL = REGISTRY.register("chisel_skull", ChiselSkullItem::new);
	public static final DeferredItem<Item> CHISEL_HIEROGLYPH = REGISTRY.register("chisel_hieroglyph", ChiselHieroglyphItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_DIORITE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_DIORITE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_GRANITE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_GRANITE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_QUARTZ_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_STONE_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_STONE_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_TUFF_HIEROGLYPH = block(CharmingChiselsModBlocks.CHISELED_TUFF_HIEROGLYPH);
	public static final DeferredItem<Item> CHISELED_ANDESITE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_SNOUT);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_SNOUT);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_SNOUT);
	public static final DeferredItem<Item> CHISELED_DIORITE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_DIORITE_SNOUT);
	public static final DeferredItem<Item> CHISELED_GRANITE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_GRANITE_SNOUT);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_SNOUT = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_SNOUT);
	public static final DeferredItem<Item> CHISELED_QUARTZ_SNOUT = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_SNOUT);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_SNOUT = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_SNOUT);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_SNOUT);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_SNOUT);
	public static final DeferredItem<Item> CHISELED_STONE_SNOUT = block(CharmingChiselsModBlocks.CHISELED_STONE_SNOUT);
	public static final DeferredItem<Item> CHISELED_TUFF_SNOUT = block(CharmingChiselsModBlocks.CHISELED_TUFF_SNOUT);
	public static final DeferredItem<Item> CHISEL_SNOUT = REGISTRY.register("chisel_snout", ChiselSnoutItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_GROAN = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_GROAN);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_GROAN = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_GROAN);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_GROAN = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_GROAN);
	public static final DeferredItem<Item> CHISELED_DIORITE_GROAN = block(CharmingChiselsModBlocks.CHISELED_DIORITE_GROAN);
	public static final DeferredItem<Item> CHISELED_GRANITE_GROAN = block(CharmingChiselsModBlocks.CHISELED_GRANITE_GROAN);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_GROAN = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_GROAN);
	public static final DeferredItem<Item> CHISELED_QUARTZ_GROAN = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_GROAN);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_GROAN = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_GROAN);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_GROAN = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_GROAN);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_GROAN = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_GROAN);
	public static final DeferredItem<Item> CHISELED_STONE_GROAN = block(CharmingChiselsModBlocks.CHISELED_STONE_GROAN);
	public static final DeferredItem<Item> CHISELED_TUFF_GROAN = block(CharmingChiselsModBlocks.CHISELED_TUFF_GROAN);
	public static final DeferredItem<Item> CHISEL_GROAN = REGISTRY.register("chisel_groan", ChiselGroanItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_DOOM = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_DOOM);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_DOOM = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_DOOM);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_DOOM = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_DOOM);
	public static final DeferredItem<Item> CHISELED_DIORITE_DOOM = block(CharmingChiselsModBlocks.CHISELED_DIORITE_DOOM);
	public static final DeferredItem<Item> CHISELED_GRANITE_DOOM = block(CharmingChiselsModBlocks.CHISELED_GRANITE_DOOM);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_DOOM = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_DOOM);
	public static final DeferredItem<Item> CHISELED_QUARTZ_DOOM = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_DOOM);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_DOOM = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_DOOM);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_DOOM = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_DOOM);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_DOOM = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_DOOM);
	public static final DeferredItem<Item> CHISELED_STONE_DOOM = block(CharmingChiselsModBlocks.CHISELED_STONE_DOOM);
	public static final DeferredItem<Item> CHISELED_TUFF_DOOM = block(CharmingChiselsModBlocks.CHISELED_TUFF_DOOM);
	public static final DeferredItem<Item> CHISEL_DOOM = REGISTRY.register("chisel_doom", ChiselDoomItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_ETCH = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_ETCH);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_ETCH = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_ETCH);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_ETCH = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_ETCH);
	public static final DeferredItem<Item> CHISELED_DIORITE_ETCH = block(CharmingChiselsModBlocks.CHISELED_DIORITE_ETCH);
	public static final DeferredItem<Item> CHISELED_GRANITE_ETCH = block(CharmingChiselsModBlocks.CHISELED_GRANITE_ETCH);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_ETCH = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_ETCH);
	public static final DeferredItem<Item> CHISELED_QUARTZ_ETCH = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_ETCH);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_ETCH = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_ETCH);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_ETCH = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_ETCH);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_ETCH = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_ETCH);
	public static final DeferredItem<Item> CHISELED_STONE_ETCH = block(CharmingChiselsModBlocks.CHISELED_STONE_ETCH);
	public static final DeferredItem<Item> CHISELED_TUFF_ETCH = block(CharmingChiselsModBlocks.CHISELED_TUFF_ETCH);
	public static final DeferredItem<Item> CHISEL_ETCHING = REGISTRY.register("chisel_etching", ChiselEtchingItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_SWIRL);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_SWIRL);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_SWIRL);
	public static final DeferredItem<Item> CHISELED_DIORITE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_DIORITE_SWIRL);
	public static final DeferredItem<Item> CHISELED_GRANITE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_GRANITE_SWIRL);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_SWIRL = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_SWIRL);
	public static final DeferredItem<Item> CHISELED_QUARTZ_SWIRL = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_SWIRL);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_SWIRL = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_SWIRL);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_SWIRL);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_SWIRL);
	public static final DeferredItem<Item> CHISELED_STONE_SWIRL = block(CharmingChiselsModBlocks.CHISELED_STONE_SWIRL);
	public static final DeferredItem<Item> CHISELED_TUFF_SWIRL = block(CharmingChiselsModBlocks.CHISELED_TUFF_SWIRL);
	public static final DeferredItem<Item> CHISEL_SWIRL = REGISTRY.register("chisel_swirl", ChiselSwirlItem::new);
	public static final DeferredItem<Item> NETHERITE_INSET = REGISTRY.register("netherite_inset", NetheriteInsetItem::new);
	public static final DeferredItem<Item> QUARTZ_INSET = REGISTRY.register("quartz_inset", QuartzInsetItem::new);
	public static final DeferredItem<Item> CHISELED_STONE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_STONE_LEGEND);
	public static final DeferredItem<Item> CHISEL_LEGEND = REGISTRY.register("chisel_legend", ChiselLegendItem::new);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_LEGEND);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_LEGEND);
	public static final DeferredItem<Item> CHISELED_GRANITE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_GRANITE_LEGEND);
	public static final DeferredItem<Item> CHISELED_DIORITE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_DIORITE_LEGEND);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_LEGEND);
	public static final DeferredItem<Item> CHISELED_ANDESITE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_LEGEND);
	public static final DeferredItem<Item> CHISELED_QUARTZ_LEGEND = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_LEGEND);
	public static final DeferredItem<Item> CHISELED_TUFF_LEGEND = block(CharmingChiselsModBlocks.CHISELED_TUFF_LEGEND);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_LEGEND = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_LEGEND);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_LEGEND = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_LEGEND);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_LEGEND = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_LEGEND);
	public static final DeferredItem<Item> SECRET_FACE_OF_NOTCH = block(CharmingChiselsModBlocks.SECRET_FACE_OF_NOTCH);
	public static final DeferredItem<Item> CHISEL_THING = REGISTRY.register("chisel_thing", ChiselThingItem::new);
	public static final DeferredItem<Item> CHISELED_ANDESITE_THING = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_THING);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_THING = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_THING);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_THING = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_THING);
	public static final DeferredItem<Item> CHISELED_DIORITE_THING = block(CharmingChiselsModBlocks.CHISELED_DIORITE_THING);
	public static final DeferredItem<Item> CHISELED_GRANITE_THING = block(CharmingChiselsModBlocks.CHISELED_GRANITE_THING);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_THING = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_THING);
	public static final DeferredItem<Item> CHISELED_QUARTZ_THING = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_THING);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_THING = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_THING);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_THING = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_THING);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_THING = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_THING);
	public static final DeferredItem<Item> CHISELED_STONE_THING = block(CharmingChiselsModBlocks.CHISELED_STONE_THING);
	public static final DeferredItem<Item> CHISELED_TUFF_THING = block(CharmingChiselsModBlocks.CHISELED_TUFF_THING);
	public static final DeferredItem<Item> CHISELED_ANDESITE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_ANDESITE_POWERUP);
	public static final DeferredItem<Item> CHISEL_POWERUP = REGISTRY.register("chisel_powerup", ChiselPowerupItem::new);
	public static final DeferredItem<Item> CHISELED_BLACKSTONE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_BLACKSTONE_POWERUP);
	public static final DeferredItem<Item> CHISELED_DEEPSLATE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_DEEPSLATE_POWERUP);
	public static final DeferredItem<Item> CHISELED_DIORITE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_DIORITE_POWERUP);
	public static final DeferredItem<Item> CHISELED_GRANITE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_GRANITE_POWERUP);
	public static final DeferredItem<Item> CHISELED_NETHER_BRICKS_POWERUP = block(CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_POWERUP);
	public static final DeferredItem<Item> CHISELED_QUARTZ_POWERUP = block(CharmingChiselsModBlocks.CHISELED_QUARTZ_POWERUP);
	public static final DeferredItem<Item> CHISELED_RED_NETHER_BRICKS_POWERUP = block(CharmingChiselsModBlocks.CHISELED_RED_NETHER_BRICKS_POWERUP);
	public static final DeferredItem<Item> CHISELED_RED_SANDSTONE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_POWERUP);
	public static final DeferredItem<Item> CHISELED_SANDSTONE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_SANDSTONE_POWERUP);
	public static final DeferredItem<Item> CHISELED_STONE_POWERUP = block(CharmingChiselsModBlocks.CHISELED_STONE_POWERUP);
	public static final DeferredItem<Item> CHISELED_TUFF_POWERUP = block(CharmingChiselsModBlocks.CHISELED_TUFF_POWERUP);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
