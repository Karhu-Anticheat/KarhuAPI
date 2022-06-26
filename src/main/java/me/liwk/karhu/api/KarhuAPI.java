package me.liwk.karhu.api;

import me.liwk.karhu.api.event.registry.EventRegistry;
import me.liwk.karhu.api.event.registry.KarhuEventListenerRegistry;
import me.liwk.karhu.api.users.UserAccessor;
import org.bukkit.plugin.java.JavaPlugin;

public final class KarhuAPI extends JavaPlugin {

    private static KarhuEventListenerRegistry eventRegistry = null;
    private static UserAccessor userAccessor = null;

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {
        eventRegistry.shutdown();
    }

    /**
     * Returns the user accessor
     *
     * @return user accessor
     */
    public static UserAccessor getUserAccessor() {
        if (userAccessor == null) {
            userAccessor = new UserAccessor();
        }
        return userAccessor;
    }

    /**
     * Returns the event service
     *
     * @return registry
     */
    public static KarhuEventListenerRegistry getEventRegistry() {
        if (eventRegistry == null) {
            eventRegistry = new EventRegistry();
        }
        return eventRegistry;
    }

    public static void shutdown() {
        if (eventRegistry == null) return;
        eventRegistry.shutdown();
    }

    public static long getFreeMemory() {
        final Runtime r = Runtime.getRuntime();
        return r.freeMemory() / 1024L / 1024L;
    }

    public static long getMaxMemory() {
        final Runtime r = Runtime.getRuntime();
        return r.maxMemory() / 1024L / 1024L;
    }

    public static long getTotalMemory() {
        final Runtime r = Runtime.getRuntime();
        return r.totalMemory() / 1024L / 1024L;
    }

}
