package de.beastly.randytest.methods;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.concurrent.ThreadLocalRandom;

public class ItemRain {

    public static void itemRain (Location loc){

        int random =  ThreadLocalRandom.current().nextInt(1, 15   + 1);

        loc= loc.add(0,25,0);
        if(random == 1) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.COAL_ORE));
        if(random == 2) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.DIAMOND_ORE));
        if(random == 3) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.EMERALD_ORE));
        if(random == 4) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.GOLD_ORE));
        if(random == 5) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.IRON_ORE));
        if(random == 6) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.LAPIS_ORE));
        if(random == 7) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.QUARTZ_ORE));
        if(random == 8) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.REDSTONE_ORE));
        if(random == 9) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.COAL_ORE));
        if(random == 10) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.BREAD));
        if(random == 11) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.GRILLED_PORK));
        if(random == 12) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.COOKED_CHICKEN));
        if(random == 13) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.CARROT));
        if(random == 14) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.BAKED_POTATO));
        if(random == 15) loc.getWorld().dropItemNaturally(loc, new ItemStack(Material.TNT));





    }
}
