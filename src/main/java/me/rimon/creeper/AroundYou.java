package me.rimon.creeper;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.bukkit.Bukkit;
import org.bukkit.entity.*;
import org.bukkit.entity.Creeper;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.jetbrains.annotations.NotNull;

import java.util.List;


public class AroundYou implements Listener {

   @EventHandler
    public void onPlayerMove(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        List<Entity> nearby =  p.getNearbyEntities(20,20,20);
        for (Entity tmp: nearby)
            if (tmp instanceof Creeper)
                ((Creeper) tmp).explode();

        }

    }
