package de.beastly.randytest.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MedKit implements Listener {
    @EventHandler
    public static void medKit (PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_AIR && e.getItem() != null && e.getItem().hasItemMeta() && e.getItem().getItemMeta().hasDisplayName() && e.getItem().getItemMeta().getDisplayName().equals("§cErste Hilfe Kasten")){
        if(e.getItem().getAmount() > 1){
            e.getItem().setAmount(e.getItem().getAmount()-1);
        } else{
            e.getPlayer().setItemInHand(null);
        }
        if(e.getPlayer().getHealth()+8 > e.getPlayer().getMaxHealth()){
            e.getPlayer().setHealth(e.getPlayer().getMaxHealth());
        }else e.getPlayer().setHealth(e.getPlayer().getHealth()+8);
        }
    }
}
