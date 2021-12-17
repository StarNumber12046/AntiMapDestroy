package it.riccardomurachelli.mc.AntiMapDestroy;

import org.bukkit.Material;
import org.bukkit.command.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandsender, org.bukkit.command.Command command, String label, String[] args) {
        ItemStack item = new ItemStack(Material.CRAFTING_TABLE, 1);
        ItemMeta itemdata = item.getItemMeta();
        itemdata.setDisplayName("§f§lEDIT §6§lMAP");
        itemdata.addEnchant(Enchantment.DIG_SPEED, 5, true);
        itemdata.setLore(Arrays.asList("§oMettimi nella mano", "non principale", "per essere in grado", "di editare la mappa"));
        item.setItemMeta(itemdata);
        ((Player) commandsender).getInventory().setItemInOffHand(item);
        commandsender.sendMessage("§3§lTieni il crafting table nella mano non principale per essere in grado di editare la mappa.");
        return true;
    }
}