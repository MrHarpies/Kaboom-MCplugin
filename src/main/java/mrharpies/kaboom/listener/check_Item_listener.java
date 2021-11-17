package mrharpies.kaboom.listener;

import mrharpies.kaboom.Kaboom;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;

public class check_Item_listener implements org.bukkit.event.Listener{

    public int hasrequiredItem = 0;

    @EventHandler
    public void onPlayerUse(PlayerInteractEvent event){
        Player p = event.getPlayer();
        if(p.getItemInHand().getType() == Material.DIAMOND_SWORD){

            hasrequiredItem = 1;



        }
        else {
            hasrequiredItem = 0;

        }
    }
}
