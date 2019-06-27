package de.beastly.randytest.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.inventory.ItemStack;

public class StandManipulate implements Listener {

    @EventHandler
    public static void standManipulate(PlayerArmorStandManipulateEvent e) {
        if (e.getArmorStandItem() != null) {
                ItemStack i = e.getArmorStandItem();
                if(i.hasItemMeta() && i.getItemMeta().hasDisplayName() && i.getItemMeta().getDisplayName().equals("ThrowSword")){
                    e.setCancelled(true);
                }
        }
    }
}
