package me.starboy.util;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Void implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "You have given your items");

            ItemStack apple = new ItemStack(Material.APPLE);

            apple.setAmount(128);

            player.getInventory().addItem(apple);


        }

        return false;

    }
}
