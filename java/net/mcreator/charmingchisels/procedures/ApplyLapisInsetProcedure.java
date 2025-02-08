package net.mcreator.charmingchisels.procedures;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
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

import net.mcreator.charmingchisels.CharmingChiselsMod;

public class ApplyLapisInsetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		ReplaceVanillaChiselingProcedure.execute(world, x, y, z, blockstate);
		if (entity instanceof LivingEntity _entity)
			_entity.swing(InteractionHand.MAIN_HAND, true);
		CharmingChiselsMod.queueServerWork(4, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.swing(InteractionHand.MAIN_HAND, true);
			CharmingChiselsMod.queueServerWork(4, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.swing(InteractionHand.MAIN_HAND, true);
			});
		});
		if (blockstate.is(BlockTags.create(ResourceLocation.parse("forge:chiseled"))) && (blockstate.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip8 ? blockstate.getValue(_getip8) : -1) == 0) {
			if ((entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) || (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.LAPIS_LAZULI)) : false)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("charming_chisels:chisel.inset")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("charming_chisels:chisel.inset")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.FIREWORK, (x + 0.5), (y + 0.5), (z + 0.5), 15, 0.2, 0.2, 0.2, 0.1);
				MrSaturnsGloriousCheckProcedure.execute();
				if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
					if (world instanceof ServerLevel _level) {
						itemstack.hurtAndBreak(1, _level, null, _stkprov -> {
						});
					}
					if (entity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(Items.LAPIS_LAZULI);
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
					}
				}
				{
					int _value = 11;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			}
		}
	}
}
