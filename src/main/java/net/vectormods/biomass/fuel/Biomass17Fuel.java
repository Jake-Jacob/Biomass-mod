
package net.vectormods.biomass.fuel;

import net.vectormods.biomass.BiomassModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

@BiomassModElements.ModElement.Tag
public class Biomass17Fuel extends BiomassModElements.ModElement {
	public Biomass17Fuel(BiomassModElements instance) {
		super(instance, 17);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.PINK_TULIP, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
