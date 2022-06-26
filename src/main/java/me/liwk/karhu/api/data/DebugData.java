package me.liwk.karhu.api.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.md_5.bungee.api.chat.BaseComponent;

@Getter
public final class DebugData {

    private final String debug;
    private final BaseComponent hoverMessage;
    private long ping;
    private int maxVl;

    public DebugData(String debug, BaseComponent hoverMessage) {
        this.debug = debug;
        this.hoverMessage = hoverMessage;
    }

    public DebugData(String debug, BaseComponent hoverMessage, long ping, int maxVl) {
        this.debug = debug;
        this.hoverMessage = hoverMessage;
        this.ping = ping;
        this.maxVl = maxVl;
    }

}
