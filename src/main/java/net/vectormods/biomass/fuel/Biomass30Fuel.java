
package net.vectormods.biomass.fuel;

import net.vectormods.biomass.item.RefinedBiomassItem;
import net.vectormods.biomass.BiomassModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

@BiomassModElements.ModElement.Tag
public class Biomass30Fuel extends BiomassModElements.ModElement {
	public Biomass30Fuel(BiomassModElements instance) {
		super(instance, 32);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(RefinedBiomassItem.block, (int) (1)).getItem())
			event.setBurnTime(16000);
	}
}
