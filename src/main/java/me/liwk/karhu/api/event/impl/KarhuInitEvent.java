package me.liwk.karhu.api.event.impl;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.liwk.karhu.api.event.KarhuEvent;

@Getter
@RequiredArgsConstructor
public final class KarhuInitEvent extends KarhuEvent {

    private final long loadTime;

    /**
     * Checks if the event is cancellable
     *
     * @return cancellable
     */
    @Override
    public boolean isCancellable() {
        return false;
    }

}
