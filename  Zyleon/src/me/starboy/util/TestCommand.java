package me.starboy.util;

import net.minecraft.server.v1_8_R3.ItemNetherStar;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class TestCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.AQUA + "You have received the starter kit :)");

         ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET);
         ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS);
         ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS);
         ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
         ItemStack apple = new ItemStack(Material.GOLDEN_APPLE);
         ItemStack sword = new ItemStack(Material.IRON_SWORD);
         ItemStack bow = new ItemStack(Material.BOW);
         ItemStack arrows = new ItemStack(Material.ARROW);


         helmet.setAmount(1);
         boots.setAmount(1);
         leggings.setAmount(1);
         chestplate.setAmount(1);
         apple.setAmount(64);
         sword.setAmount(1);
         bow.setAmount(1);
         arrows.setAmount(128);

         player.getInventory().addItem(helmet,boots,leggings,chestplate,apple,sword,arrows,bow);

        }
        return true;
    }
}

