package me.starboy.util.me.starboy.util.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class PanelGUI {

    public static void openMain(Player player) {

        Inventory inv = Bukkit.createInventory(null, 27, ChatColor.GREEN + "" + ChatColor.BOLD + "Your Island Panel");


    }
}
