package me.liwk.karhu.api.event.example;

import me.liwk.karhu.api.data.CheckData;
import me.liwk.karhu.api.event.KarhuEvent;
import me.liwk.karhu.api.event.KarhuListener;
import me.liwk.karhu.api.event.impl.KarhuAlertEvent;
import org.bukkit.entity.Player;

public final class ExampleListener implements KarhuListener {

    public ExampleListener() {
        //KarhuAPI.getEventRegistry().addListener(this);
    }

    @Override
    public void onEvent(KarhuEvent event) {

        if(event instanceof KarhuAlertEvent){
           final CheckData check = ((KarhuAlertEvent) event).getCheck();
           final Player player = ((KarhuAlertEvent) event).getPlayer();
        }

    }

}
