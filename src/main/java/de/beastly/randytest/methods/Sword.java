package de.beastly.randytest.methods;

import de.beastly.randytest.RandyTest;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;

public class Sword {

    public static void sword(ArmorStand stand, Integer redo){
        Integer active = 1;
        Location loc = stand.getLocation().add(0.0D, 0.0D, 0.0D);
            loc = loc.add(loc.getDirection().getX(), loc.getDirection().getY() - 0.05D,
                    loc.getDirection().getZ());
        stand.teleport(loc);

        List<Entity> near = stand.getNearbyEntities(0.1,0.5,0.1);
        if((stand.getLocation().getBlock().getType() != Material.AIR)){
            stand.remove();
            active = 0;
        }
        if(!near.isEmpty()){

            if(redo < 45) {
                if (near.get(0) instanceof LivingEntity) {
                    LivingEntity ent = (LivingEntity) near.get(0);

                    if (ent.getHealth() - 8 > 0) {
                        ent.setHealth(ent.getHealth() - 8);
                    } else {
                        ent.setHealth(0);
                    }

                    stand.remove();
                    active = 0;
                } else return;
            }
        }
        if(redo == 0){

            stand.remove();
            active = 0;
        }
        if(active != 1) return;
        new BukkitRunnable() {

            @Override
            public void run() {
                if(stand != null) {
                    sword(stand, redo-1);
                }
            }

        }.runTaskLater(RandyTest.plugin, 3);
    }

}
