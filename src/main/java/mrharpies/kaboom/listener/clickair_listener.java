package mrharpies.kaboom.listener;

import mrharpies.kaboom.Kaboom;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class clickair_listener implements org.bukkit.event.Listener {








    @EventHandler
    public void onLeftClick(PlayerInteractEvent playerInteractEvent) {
        Player p = playerInteractEvent.getPlayer();



            if ((playerInteractEvent.getAction() == Action.LEFT_CLICK_AIR) && )  {
                p.playSound(p.getLocation(), Sound.ITEM_ARMOR_EQUIP_ELYTRA, 100, 0);
                p.setVelocity(p.getLocation().getDirection().multiply(2));
            }
            else {
                p.playSound(p.getLocation(), Sound.ENTITY_ENDERMAN_TELEPORT, 100, 0);
                p.sendMessage(ChatColor.RED + "You can teleport in blocks!");


            }


        }
    }
}