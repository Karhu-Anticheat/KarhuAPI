package me.liwk.karhu.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.liwk.karhu.api.data.CheckData;
import me.liwk.karhu.api.event.KarhuEvent;
import org.bukkit.entity.Player;

@RequiredArgsConstructor
@Getter
public final class KarhuPostCheckEvent extends KarhuEvent implements RawPacketInspectableEvent {

    private final boolean failed;
    private final CheckData check;
    private final Player player;
    private final Object packet;

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    @Override
    public boolean isCancellable() {
        return false;
    }

    @Override
    public Object getPacket() {
        return packet;
    }

}
