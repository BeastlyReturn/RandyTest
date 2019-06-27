package de.beastly.randytest.events;

import de.beastly.randytest.methods.Sword;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class SwordThrow implements Listener {

    @EventHandler
    public static void swordThrow (PlayerInteractEvent e){

        if((e.getAction() == Action.RIGHT_CLICK_AIR) && (e.getItem() != null) && (e.getItem().getType() == Material.IRON_SWORD) && e.getItem().hasItemMeta() && (e.getItem().getItemMeta().hasLore())) {
            ItemStack i = e.getItem();
            ItemMeta im = i.getItemMeta();
            Player p = e.getPlayer();
            String lore = im.getLore().get(0).replace("Verwendbar: ", "");
            Integer use = Integer.parseInt(lore);

            if(use > 1) {

                List<String> lorelist = new ArrayList<>();
                lorelist.add("Verwendbar: " + (use-1));
                im.setLore(lorelist);
                i.setItemMeta(im);
                p.updateInventory();
            }else p.setItemInHand(null);
            ArmorStand stand = p.getWorld().spawn(p.getLocation().add(0,1,0), ArmorStand.class);
            stand.setArms(true);
            if(i == null){
                ItemStack itemhandstand = new ItemStack(Material.IRON_SWORD);
                ItemMeta itemhandstandmeta = itemhandstand.getItemMeta();
                itemhandstandmeta.setDisplayName("ThrowSword");
                itemhandstand.setItemMeta(itemhandstandmeta);
                stand.setItemInHand(itemhandstand);
            }else {
                stand.setItemInHand(i);
            }
            stand.setFallDistance(0);
            stand.setGravity(false);
            stand.setVisible(false);

            Sword.sword(stand,  50);
        }else return;


    }
}
