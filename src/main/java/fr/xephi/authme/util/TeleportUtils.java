package fr.xephi.authme.util;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.util.concurrent.CompletableFuture;

/**
 * This class is a utility class for handling async teleportation of players in game.
 */
public class TeleportUtils {
    /**
     * Teleport a player to a specified location.
     *
     * @param player   The player to be teleported
     * @param location Where should the player be teleported
     */
    public static void teleport(Player player, Location location) {
        player.teleportAsync(location);
    }
}
