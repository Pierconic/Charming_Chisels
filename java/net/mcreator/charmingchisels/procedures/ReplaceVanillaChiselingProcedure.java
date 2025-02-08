package net.mcreator.charmingchisels.procedures;

import net.neoforged.neoforge.event.level.BlockEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.charmingchisels.init.CharmingChiselsModBlocks;

import javax.annotation.Nullable;

@EventBusSubscriber
public class ReplaceVanillaChiselingProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getState());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		execute(null, world, x, y, z, blockstate);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, BlockState blockstate) {
		if (blockstate.getBlock() == Blocks.CHISELED_STONE_BRICKS || blockstate.getBlock() == Blocks.INFESTED_CHISELED_STONE_BRICKS) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_STONE_CAVEAT.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_QUARTZ_BLOCK) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_QUARTZ_NEXUS.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_NETHER_BRICKS) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_NETHER_BRICKS_SKULL.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_SANDSTONE) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_SANDSTONE_HIEROGLYPH.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_POLISHED_BLACKSTONE) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_BLACKSTONE_SNOUT.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_DEEPSLATE) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_DEEPSLATE_GROAN.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		} else if (blockstate.getBlock() == Blocks.CHISELED_RED_SANDSTONE) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = CharmingChiselsModBlocks.CHISELED_RED_SANDSTONE_DOOM.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				BlockEntity _be = world.getBlockEntity(_bp);
				CompoundTag _bnbt = null;
				if (_be != null) {
					_bnbt = _be.saveWithFullMetadata(world.registryAccess());
					_be.setRemoved();
				}
				world.setBlock(_bp, _bs, 3);
				if (_bnbt != null) {
					_be = world.getBlockEntity(_bp);
					if (_be != null) {
						try {
							_be.loadWithComponents(_bnbt, world.registryAccess());
						} catch (Exception ignored) {
						}
					}
				}
			}
		}
	}
}
