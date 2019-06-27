package de.beastly.randytest.events;

import de.beastly.randytest.RandyTest;
import de.beastly.randytest.methods.ItemRain;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class CollectEvent implements Listener {
     @EventHandler
        public void itemDrop(PlayerDropItemEvent e) {

if(e.getItemDrop().getItemStack().getType() != Material.GOLD_NUGGET) return;
e.getItemDrop().setPickupDelay(5*20);
         new BukkitRunnable() {

             @Override
             public void run() {
                 List<Entity> near = e.getItemDrop().getNearbyEntities(0.2,0.2,0.2);
                 for (int i = 0; i <= near.size(); i++) {

                     if(near.get(i) instanceof ArmorStand){
                         ArmorStand stand = (ArmorStand) near.get(i);
                         if(stand.getHelmet().getType() == Material.SPONGE){
                             ItemRain.itemRain(stand.getLocation());
                                e.getItemDrop().remove();
                             stand.remove();
                         }
                     }


                 }
             }
         }.runTaskLater(RandyTest.plugin, 3*20);


         }
         }


