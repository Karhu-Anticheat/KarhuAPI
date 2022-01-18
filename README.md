# KarhuAPI
Karhu Anticheat Developer API

Please note that you need to drop KarhuAPI.jar into plugins folder for it to work.

Example below

public final class ExampleListener implements KarhuListener {

    public ExampleListener() {
        KarhuAPI.getEventRegistry().addListener(this);
    }

    @Override
    public void onEvent(KarhuEvent event) {

        if(event instanceof KarhuAlertEvent){
           final CheckData check = ((KarhuAlertEvent) event).getCheck();
           final Player player = ((KarhuAlertEvent) event).getPlayer();
        }

    }

}

