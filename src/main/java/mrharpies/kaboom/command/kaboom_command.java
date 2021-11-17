package mrharpies.kaboom.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class kaboom_command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p =(Player)sender;

        if(sender instanceof Player){

            p.setVelocity(new Vector(2,3,4));

        }






        return false;
    }
}
