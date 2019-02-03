package me.starboy.util;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BETA implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Kit system is in BETA Right now!");

        }

        return true;
    }


}
