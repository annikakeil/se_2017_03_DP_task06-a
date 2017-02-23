package team03.task06.main;

import team03.task06.plates.MainPlate;
import team03.task06.plates.Plate;
import team03.task06.plates.SubPlate;

public class Application {
    public static void main(String[] args) {

        MainPlate m1 = new MainPlate("M1");
        SubPlate m1s1 = new SubPlate("S1", m1);
        SubPlate m1s2 = new SubPlate("S2", m1);

        m1.addPlate(m1s1);

        Plate m1s1p1 = new Plate("P1");
        Plate m1s1p2 = new Plate("P2");
        Plate m1s1p3 = new Plate("P3");



    }
}