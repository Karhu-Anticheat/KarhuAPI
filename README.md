# KarhuAPI
Karhu Anticheat Developer API

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

