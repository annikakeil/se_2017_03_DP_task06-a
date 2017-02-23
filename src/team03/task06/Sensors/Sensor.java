package team03.task06.Sensors;

import java.util.List;

public class Sensor {

    List<ISensorListener> listeners;

    public void checkSwing(){
        //TODO checkSwing
    }

    public void addListener(ISensorListener listener){
        listeners.add(listener);
    }
}
