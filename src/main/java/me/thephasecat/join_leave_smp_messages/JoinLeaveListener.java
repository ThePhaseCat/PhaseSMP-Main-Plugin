package me.thephasecat.join_leave_smp_messages;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){

        Player player = e.getPlayer();
        if (player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.GREEN + "Welcome back, " + ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + "!");
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Make sure you have the PhaseSMP Resource Pack installed! You can find the link in the Discord!");
        }else{
            e.setJoinMessage(ChatColor.BLUE + "" + ChatColor.BOLD + player.getDisplayName() + ", " + ChatColor.BLUE + "welcome to the PhaseSMP!");
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Make sure you have the PhaseSMP Resource Pack installed! You can find the link in the Discord!");
        }

    }

    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();
        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED + " has left the server! Bye!");

    }

}
