package me.liwk.karhu.api.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.md_5.bungee.api.chat.BaseComponent;

@RequiredArgsConstructor
@Getter
public final class DebugData {

    private final String debug;
    private final BaseComponent hoverMessage;

}
