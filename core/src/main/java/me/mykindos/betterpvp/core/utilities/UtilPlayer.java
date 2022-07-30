package me.mykindos.betterpvp.core.utilities;

import org.bukkit.entity.Player;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class UtilPlayer {

    public static int getPing(Player player) {
        try {

            Method getHandleMethod = player.getClass().getDeclaredMethod("getHandle");
            Object entityPlayer = getHandleMethod.invoke(player);
            Field pingField = entityPlayer.getClass().getDeclaredField("ping");
            pingField.setAccessible(true);

            int ping = pingField.getInt(entityPlayer);

            return Math.max(ping, 0);
        } catch (Exception e) {
            return 1;
        }
    }


}