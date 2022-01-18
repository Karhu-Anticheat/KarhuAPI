package me.liwk.karhu.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.liwk.karhu.api.data.CheckData;
import me.liwk.karhu.api.event.KarhuEvent;
import org.bukkit.entity.Player;

@Getter
@RequiredArgsConstructor
public final class KarhuBanEvent extends KarhuEvent {

    private final Player player;
    private final CheckData check;
}
