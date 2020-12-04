
package net.vectormods.biomass.fuel;

import net.vectormods.biomass.BiomassModElements;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;

@BiomassModElements.ModElement.Tag
public class Biomass7Fuel extends BiomassModElements.ModElement {
	public Biomass7Fuel(BiomassModElements instance) {
		super(instance, 7);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(Blocks.OAK_LEAVES, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
