package me.starboy.util.me.starboy.util.Commands;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class PanelCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
           player.sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "Panel is Coming Soon Not yet released and also /island is kinda working but sll in progress :)");
           player.sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "Use /island for more info");

            ItemStack emerald = new ItemStack(Material.EMERALD);


            emerald.setAmount(54);

            player.getInventory().addItem(emerald);


        }
        return true;
    }
}
