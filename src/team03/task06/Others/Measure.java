package team03.task06.Others;

import team03.task06.plates.MainPlate;

public class Measure {

    public int time;
    public String mainplate;
    public boolean status;
    public double scale;

    public Measure(int time, String mainPlate, boolean status, double scale) {
        this.time = time;
        this.mainplate = mainPlate;
        this.status = status;
        this.scale = scale;
    }
}
