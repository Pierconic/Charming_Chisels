
package net.mcreator.charmingchisels.item;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import net.mcreator.charmingchisels.procedures.ApplyHieroglyphProcedure;

import java.util.List;

public class ChiselHieroglyphItem extends Item {
	public ChiselHieroglyphItem() {
		super(new Item.Properties().durability(650).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.literal(("\u00A77") + "Hieroglyphics"));

	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		ApplyHieroglyphProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getLevel().getBlockState(context.getClickedPos()), context.getPlayer(),
				context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
