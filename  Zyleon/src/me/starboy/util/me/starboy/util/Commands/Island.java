package me.starboy.util.me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Island implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.GOLD  + "" + ChatColor.BOLD + "Your Island panel is opening");
            player.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "An Bug has found reporting it and after that opening your panel Some gifts have given to you!");

            ItemStack diamond = new ItemStack(Material.DIAMOND_AXE);

            diamond.setAmount(25);

            player.getInventory().addItem(diamond);

        }

        return true;

    }
}