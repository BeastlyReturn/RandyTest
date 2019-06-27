package de.beastly.randytest.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemConsume implements Listener {

    @EventHandler
    public static void itemConsume (PlayerItemConsumeEvent e){
        if(e.getItem().getType()== Material.POTION && e.getItem().hasItemMeta() && e.getItem().getItemMeta().hasLore()){
            ItemStack item = e.getItem();

            if(item.getItemMeta().getLore().contains("§bFlash Trank")) {
            e.getPlayer().addPotionEffect((new PotionEffect(PotionEffectType.SPEED, 10*20, 1)));

        }
            if(item.getItemMeta().getLore().contains("§9Energydrink")) {
                e.getPlayer().addPotionEffect((new PotionEffect(PotionEffectType.FAST_DIGGING, 15*20, 0)));

            }
        }
    }



}
