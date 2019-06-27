package de.beastly.randytest.methods;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomReward {

    public static void getRandomReward (Player p, Location blockloc){


        int random =  ThreadLocalRandom.current().nextInt(1, 5 + 1);

        if(random == 1){
            ItemStack item1 = new ItemStack(Material.IRON_SWORD);
            ItemMeta item1meta = item1.getItemMeta();
            List<String> lore = new ArrayList<>();
            lore.add("Verwendbar: 5");
            item1meta.setLore(lore);
            item1meta.setDisplayName("ThrowSword");
            item1.setItemMeta(item1meta);
            blockloc.getWorld().dropItemNaturally(blockloc, item1);
        }else if(random == 2){
            ItemStack item1 = new ItemStack(Material.POTION);
            ItemMeta item1meta = item1.getItemMeta();
            List<String> lore = new ArrayList<>();
            lore.add("§bFlash Trank");
            item1meta.setLore(lore);
            item1meta.setDisplayName("Flash Trank");
            item1.setItemMeta(item1meta);
            blockloc.getWorld().dropItemNaturally(blockloc, item1);
        }else if(random == 3){
            ItemStack item1 = new ItemStack(Material.POTION);
            ItemMeta item1meta = item1.getItemMeta();
            List<String> lore = new ArrayList<>();
            lore.add("§9Energydrink");
            item1meta.setLore(lore);
            item1meta.setDisplayName("Energydrink");
            item1.setItemMeta(item1meta);
            blockloc.getWorld().dropItemNaturally(blockloc, item1);
        }else if(random == 4){
            ItemStack item1 = new ItemStack(Material.PAPER);
            ItemMeta item1meta = item1.getItemMeta();
            List<String> lore = new ArrayList<>();
            lore.add("§cHeilt einmalig 4 Herzen");
            item1meta.setLore(lore);
            item1meta.setDisplayName("§cErste Hilfe Kasten");
            item1.setItemMeta(item1meta);
            blockloc.getWorld().dropItemNaturally(blockloc, item1);
            p.getInventory().addItem(item1);
        }else if(random == 5){
    SpawnStructure.brunnen(blockloc,blockloc, p, blockloc.getBlock());
        }


    }
}
