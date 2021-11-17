package mrharpies.kaboom;

import mrharpies.kaboom.command.kaboom_command;
import mrharpies.kaboom.listener.clickair_listener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kaboom extends JavaPlugin {





    @Override
    public void onEnable() {



        // Plugin startup logic
        Bukkit.getLogger().info(ChatColor.GREEN + "Kaboom is now enabled and run at the version");
        getCommand("kaboom").setExecutor(new kaboom_command());
        getServer().getPluginManager().registerEvents(new clickair_listener(),this);







    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        Bukkit.getLogger().info(ChatColor.RED +"Kaboom is now disabled" );

    }
}
