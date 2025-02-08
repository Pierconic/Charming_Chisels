package net.mcreator.charmingchisels.procedures;

import net.neoforged.neoforge.event.entity.player.ItemEntityPickupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class GrantChiselRecipesProcedure {
	@SubscribeEvent
	public static void onPickup(ItemEntityPickupEvent.Pre event) {
		execute(event, event.getPlayer(), event.getItemEntity().getItem());
	}

	public static void execute(Entity entity, ItemStack itemstack) {
		execute(null, entity, itemstack);
	}

	private static void execute(@Nullable Event event, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == Items.RAW_COPPER) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:copper_inset_recipe")));
		} else if (itemstack.getItem() == Items.RAW_IRON) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:iron_inset_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:planer_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_etching_recipe")));
		} else if (itemstack.getItem() == Items.RAW_GOLD) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:gold_inset_recipe")));
		} else if (itemstack.getItem() == Items.EMERALD) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:emerald_inset_recipe")));
		} else if (itemstack.getItem() == Items.DIAMOND) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:diamond_inset_recipe")));
		} else if (itemstack.getItem() == Items.AMETHYST_SHARD) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:amethyst_inset_recipe")));
		} else if (itemstack.getItem() == Items.LAPIS_LAZULI) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:lapis_inset_recipe")));
		} else if (itemstack.getItem() == Items.REDSTONE) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:redstone_inset_recipe")));
		} else if (itemstack.getItem() == Items.GLOWSTONE_DUST) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:glowstone_inset_recipe")));
		} else if (itemstack.getItem() == Blocks.TARGET.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_caveat_recipe")));
		} else if (itemstack.getItem() == Items.QUARTZ) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_nexus_recipe")));
		} else if (itemstack.getItem() == Blocks.SCULK_CATALYST.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_groan_recipe")));
		} else if (itemstack.getItem() == Items.BONE) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_skull_recipe")));
		} else if (itemstack.getItem() == Blocks.GILDED_BLACKSTONE.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_snout_recipe")));
		} else if (itemstack.getItem() == Items.WITHER_SKELETON_SKULL) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_doom_recipe")));
		} else if (itemstack.getItem() == Blocks.MOSS_BLOCK.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_hieroglyph_recipe")));
		} else if (itemstack.getItem() == Blocks.OXIDIZED_COPPER.asItem()) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_swirl_recipe")));
		} else if (itemstack.getItem() == Items.ZOMBIE_HEAD) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_legend_recipe")));
		} else if (itemstack.getItem() == Items.ENCHANTED_GOLDEN_APPLE) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_thing_recipe")));
		} else if (itemstack.getItem() == Items.TURTLE_SCUTE) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(ResourceLocation.parse("charming_chisels:chisel_powerup_recipe")));
		}
	}
}
