package it.riccardomurachelli.mc.AntiMapDestroy;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.*;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.entity.*;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.*;
import java.util.Arrays;
import java.util.Objects;

public class PluginListener implements Listener {
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack item = new ItemStack(Material.CRAFTING_TABLE, 1);
        ItemMeta itemdata = item.getItemMeta();
        itemdata.setDisplayName("§f§lEDIT §6§lMAP");
        itemdata.addEnchant(Enchantment.DIG_SPEED, 5, true);
        itemdata.setLore(Arrays.asList("§oMettimi nella mano", "non principale", "per essere in grado", "di editare la mappa"));
        item.setItemMeta(itemdata);
        event.getPlayer().getInventory().getItemInOffHand();
        event.getPlayer().getInventory().getItemInMainHand();
        if (!event.getPlayer().getInventory().getItemInMainHand().getType().isBlock()) {
            event.setCancelled(true);
            return;
        }
        if (!Objects.equals(event.getPlayer().getInventory().getItemInOffHand().getItemMeta(), itemdata)) {
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
        ItemStack item = new ItemStack(Material.CRAFTING_TABLE, 1);
        ItemMeta itemdata = item.getItemMeta();
        itemdata.setDisplayName("§f§lEDIT §6§lMAP");
        itemdata.addEnchant(Enchantment.DIG_SPEED, 5, true);
        itemdata.setLore(Arrays.asList("§oMettimi nella mano", "non principale", "per essere in grado", "di editare la mappa"));
        item.setItemMeta(itemdata);
        event.getPlayer().getInventory().getItemInOffHand();
        event.getPlayer().getInventory().getItemInMainHand();
        if (!event.getPlayer().getInventory().getItemInMainHand().getType().isBlock()) {
            event.setCancelled(true);
            return;
        }
        if (!Objects.equals(event.getPlayer().getInventory().getItemInOffHand().getItemMeta(), itemdata)) {
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onBlockDamage(BlockDamageEvent event) {
        event.setCancelled(true);
    }
    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event) {
        if (!(event.getEntity() instanceof Player)) {
            event.setCancelled(true);
        }
    }
    @EventHandler
    public void onItemDrop(PlayerDropItemEvent event) {
        event.setCancelled(true);
    }
}