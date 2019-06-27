package de.beastly.randytest.events;

import de.beastly.randytest.methods.RandomReward;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    @EventHandler
    public static void blockBreak (BlockBreakEvent e){


        if(e.getBlock().getType() != Material.SPONGE) return;

        RandomReward.getRandomReward(e.getPlayer(), e.getBlock().getLocation());





    }
}
