package me.liwk.karhu.api.event.registry;

import me.liwk.karhu.api.event.KarhuEvent;
import me.liwk.karhu.api.event.KarhuListener;

public interface KarhuEventListenerRegistry {

    boolean fireEvent(KarhuEvent event);

    void shutdown();

    void addListener(KarhuListener listener);

    void removeListener(KarhuListener listener);

}
