package net.mcreator.charmingchisels.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class ApplyPlanerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ReplaceVanillaChiselingProcedure.execute(world, x, y, z, blockstate);
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.stonecutter.take_result")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("ui.stonecutter.take_result")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.POOF, (x + 0.5), (y + 0.8), (z + 0.5), 15, 0.2, 0.2, 0.2, 0.1);
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (world instanceof ServerLevel _level) {
				itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
				});
			}
		}
		if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:chiseled"))) && !((blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip9 ? blockstate.getValue(_getip9) : -1) == 0)) {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			InsetRemovalProcedure.execute(world, x, y, z, blockstate, entity);
		} else {
			if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:quartz_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.QUARTZ_BLOCK.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:stone_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.STONE_BRICKS.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:diorite_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_DIORITE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:granite_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_GRANITE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:andesite_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_ANDESITE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:nether_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.NETHER_BRICKS.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:red_nether_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.RED_NETHER_BRICKS.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:sandstone_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CUT_SANDSTONE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:red_sandstone_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.CUT_RED_SANDSTONE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:tuff_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_TUFF.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:deepslate_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_DEEPSLATE.defaultBlockState(), 3);
			} else if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:blackstone_chiselable")))) {
				world.setBlock(BlockPos.containing(x, y, z), Blocks.POLISHED_BLACKSTONE.defaultBlockState(), 3);
			}
		}
	}
}
