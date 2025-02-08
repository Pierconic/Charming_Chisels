
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.charmingchisels.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.charmingchisels.CharmingChiselsMod;

public class CharmingChiselsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, CharmingChiselsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_OPEN = REGISTRY.register("bounty.open", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.open")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_CLOSE = REGISTRY.register("bounty.close", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.close")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_COMPLETED = REGISTRY.register("bounty.completed", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.completed")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_ANNIHALATED = REGISTRY.register("bounty.annihalated", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.annihalated")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_FAILED = REGISTRY.register("bounty.failed", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.failed")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MEDALLION_DISPENSE = REGISTRY.register("medallion.dispense", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "medallion.dispense")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOOK_DISPENSE = REGISTRY.register("book.dispense", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "book.dispense")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHISEL_CARVE = REGISTRY.register("chisel.carve", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "chisel.carve")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHISEL_INSET = REGISTRY.register("chisel.inset", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "chisel.inset")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SHADE_STEP = REGISTRY.register("shade.step", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "shade.step")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HEART_MAGIC = REGISTRY.register("heart.magic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "heart.magic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HEART_SORCERY = REGISTRY.register("heart.sorcery", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "heart.sorcery")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPADE_MAGIC = REGISTRY.register("spade.magic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "spade.magic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPADE_SORCERY = REGISTRY.register("spade.sorcery", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "spade.sorcery")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CLUB_MAGIC = REGISTRY.register("club.magic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "club.magic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CLUB_SORCERY = REGISTRY.register("club.sorcery", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "club.sorcery")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DIAMOND_MAGIC = REGISTRY.register("diamond.magic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "diamond.magic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DIAMOND_SORCERY = REGISTRY.register("diamond.sorcery", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "diamond.sorcery")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MAGIC_FIZZLE = REGISTRY.register("magic.fizzle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "magic.fizzle")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_STAMP = REGISTRY.register("bounty.stamp", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.stamp")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_NOPE = REGISTRY.register("bounty.nope", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.nope")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOUNTY_DEPOSIT = REGISTRY.register("bounty.deposit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "bounty.deposit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MEDALLION_SHATTER = REGISTRY.register("medallion.shatter", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "medallion.shatter")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SCROLL_UNFURL = REGISTRY.register("scroll.unfurl", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "scroll.unfurl")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUNTER_AMBIENT = REGISTRY.register("hunter.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "hunter.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUNTER_HURT = REGISTRY.register("hunter.hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "hunter.hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUNTER_INTERACT = REGISTRY.register("hunter.interact", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "hunter.interact")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUNTER_ACCEPT = REGISTRY.register("hunter.accept", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "hunter.accept")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HUNTER_YES = REGISTRY.register("hunter.yes", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "hunter.yes")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JESTER_INTERACT = REGISTRY.register("jester.interact", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "jester.interact")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SOLAR_MAGIC = REGISTRY.register("solar.magic", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "solar.magic")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JESTER_AMBIENT = REGISTRY.register("jester.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "jester.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JESTER_YES = REGISTRY.register("jester.yes", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "jester.yes")));
	public static final DeferredHolder<SoundEvent, SoundEvent> JESTER_ACCEPT = REGISTRY.register("jester.accept", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "jester.accept")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOTANIST_AMBIENT = REGISTRY.register("botanist.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "botanist.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOTANIST_INTERACT = REGISTRY.register("botanist.interact", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "botanist.interact")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOTANIST_YES = REGISTRY.register("botanist.yes", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "botanist.yes")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOTANIST_ACCEPT = REGISTRY.register("botanist.accept", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "botanist.accept")));
	public static final DeferredHolder<SoundEvent, SoundEvent> WHISTLE_TRIGGER = REGISTRY.register("whistle.trigger", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "whistle.trigger")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ARCHIVIST_INTERACT = REGISTRY.register("archivist.interact", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "archivist.interact")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ARCHIVIST_AMBIENT = REGISTRY.register("archivist.ambient", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "archivist.ambient")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ARCHIVIST_YES = REGISTRY.register("archivist.yes", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "archivist.yes")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ARCHIVIST_ACCEPT = REGISTRY.register("archivist.accept", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "archivist.accept")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SATURN_BOING = REGISTRY.register("saturn.boing", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("charming_chisels", "saturn.boing")));
}
