package com.github.merinosheep.herobrine.item;

import com.github.merinosheep.herobrine.Main;

import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
public class FlintAndBlazeItem extends Item {
    public FlintAndBlazeItem() {
        super(new Item.Properties().setNoRepair().maxStackSize(1).defaultMaxDamage(260));
    }

    @Override 
    public ActionResultType onItemUse(ItemUseContext context) {		
		BlockPos pos = context.getPos().up();//fire shoudl be set on top of the block that was right clicked and not replaced
		ItemStack stack = context.getItem();
		context.getWorld().setBlockState(pos,Blocks.FIRE.getDefaultState());
		
			stack.damageItem(1, context.getPlayer(),(onBroken)-> {
			});

		 return ActionResultType.SUCCESS;
	}
       
}

