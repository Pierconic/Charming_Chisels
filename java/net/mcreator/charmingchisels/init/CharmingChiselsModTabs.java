
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charmingchisels.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.charmingchisels.CharmingChiselsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class CharmingChiselsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CharmingChiselsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(CharmingChiselsModItems.CHISEL_CAVEAT.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_PLAIN.get());
			tabData.accept(CharmingChiselsModItems.COPPER_INSET.get());
			tabData.accept(CharmingChiselsModItems.IRON_INSET.get());
			tabData.accept(CharmingChiselsModItems.GOLD_INSET.get());
			tabData.accept(CharmingChiselsModItems.EMERALD_INSET.get());
			tabData.accept(CharmingChiselsModItems.LAPIS_INSET.get());
			tabData.accept(CharmingChiselsModItems.AMETHYST_INSET.get());
			tabData.accept(CharmingChiselsModItems.QUARTZ_INSET.get());
			tabData.accept(CharmingChiselsModItems.GLOWSTONE_INSET.get());
			tabData.accept(CharmingChiselsModItems.REDSTONE_INSET.get());
			tabData.accept(CharmingChiselsModItems.DIAMOND_INSET.get());
			tabData.accept(CharmingChiselsModItems.NETHERITE_INSET.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_NEXUS.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_SKULL.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_HIEROGLYPH.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_SNOUT.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_GROAN.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_DOOM.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_ETCHING.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_SWIRL.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_LEGEND.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_THING.get());
			tabData.accept(CharmingChiselsModItems.CHISEL_POWERUP.get());

		}
	}
}
