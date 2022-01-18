package me.liwk.karhu.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.liwk.karhu.api.data.CheckData;
import me.liwk.karhu.api.event.KarhuEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public final class KarhuPreCheckEvent extends KarhuEvent implements RawPacketInspectableEvent {

    private final Player player;
    private final CheckData check;
    private final Object packet;

    @Override
    public Object getPacket() {
        return packet;
    }

}
