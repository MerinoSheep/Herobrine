package com.github.merinosheep.herobrine.item;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.github.merinosheep.herobrine.Main;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
public class FlintAndBlazeItem extends Item {
    public FlintAndBlazeItem() {
        super(new Item.Properties().setNoRepair().maxStackSize(1).defaultMaxDamage(260));
    }

    @Override 
    public ActionResultType onItemUse(ItemUseContext context) {
		Block block = context.getWorld().getBlockState(context.getPos()).getBlock();
		BlockPos pos = context.getPos().up();
		context.getWorld().setBlockState(pos,Blocks.FIRE.getDefaultState());
		if(block==Blocks.NETHERRACK){
			Main.LOGGER.debug("NETHERACK");
		}
        return ActionResultType.SUCCESS;
	}
}
