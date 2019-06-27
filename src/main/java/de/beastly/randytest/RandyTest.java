package de.beastly.randytest;

        import de.beastly.randytest.events.*;
        import org.bukkit.Bukkit;
        import org.bukkit.plugin.java.JavaPlugin;


public class RandyTest extends JavaPlugin {
        public static RandyTest plugin;

        @Override
        public void onEnable() {
                plugin = this;

                Bukkit.getPluginManager().registerEvents(new BlockBreak(), this);
                Bukkit.getPluginManager().registerEvents(new SwordThrow(), this);
                Bukkit.getPluginManager().registerEvents(new StandManipulate(), this);
                Bukkit.getPluginManager().registerEvents(new ItemConsume(), this);
                Bukkit.getPluginManager().registerEvents(new MedKit(), this);
                Bukkit.getPluginManager().registerEvents(new CollectEvent(), this);

        }

        @Override
        public void onDisable() {


        }
}
