package com.owen1212055.biomevisuals.api.events;

import org.bukkit.NamespacedKey;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * Event fired when a dimension registry is about to be sent to a client during player login.
 *
 * @see RegistrySendEvent
 */
@Deprecated
public class DimensionRegistrySendEvent<T> extends RegistrySendEvent<T> {

    @Override
    public T getRegistryEntry(NamespacedKey key) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public void setRegistryEntry(NamespacedKey key, T data) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        throw new UnsupportedOperationException("Not implemented");
    }

}
