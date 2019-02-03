package me.starboy.util.me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class OwnerCryptoCurrency implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command,String label,String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "" + ChatColor.BOLD + "We are currently encrypting your currency Please wait a while!");
            player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "We have successfully encrypted your currency now its ready to get thrown in your Bank Account  ");
            player.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Here is a small prize using this command :)");


            ItemStack diamond = new ItemStack(Material.DIAMOND);

            diamond.setAmount(64);

            player.getInventory().addItem(diamond);
        }
              return true;
    }
}
