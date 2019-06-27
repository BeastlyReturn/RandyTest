package de.beastly.randytest.methods;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class   SpawnStructure {

    public static void brunnen(Location loc, Location baseloc, Player p, Block b){
        ArmorStand stand = p.getWorld().spawn(baseloc.getBlock().getLocation().add(0.5,-1,0.5), ArmorStand.class);
        stand.setVisible(false);
        ItemStack itemhandstand = new ItemStack(Material.SPONGE);
        ItemMeta itemhandstandmeta = itemhandstand.getItemMeta();
        itemhandstandmeta.setDisplayName("ThrowSword");
        itemhandstand.setItemMeta(itemhandstandmeta);
        stand.setHelmet(itemhandstand);
        stand.setCanPickupItems(false);
        stand.setGravity(false);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,5,0).getBlock().setType(Material.SPONGE);

        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,1,0).getBlock().setType(Material.WATER);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,1,0).getBlock().setType(Material.WATER);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(1,0,0).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(-1,0,0).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,0,1).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,0,-1).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(1,1,0).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(-1,1,0).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,1,1).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,1,-1).getBlock().setType(Material.STONE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,5,0).getBlock().setType(Material.SPONGE);
        loc.setX(b.getLocation().getX());
        loc.setY(b.getLocation().getY());
        loc.setZ(b.getLocation().getZ());
        loc.add(0,-1,0).getBlock().setType(Material.STONE);
        p.sendMessage("A wishing well? Maybe you should throw in a coin…");

    }
}
