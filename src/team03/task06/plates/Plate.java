package team03.task06.plates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plate {

    // Attributes
    public String name;
    protected boolean status;
    protected Plate parentPlate;
    protected List<Plate> plates = new ArrayList<Plate>();

    // Constructor
    public Plate(String name) {
        this.name = name;
        this.status = false;
    }

    // Methods
    public void swing(){
        Random r = new Random();

        if(r.nextDouble() < 0.05){
            status=true;
        }
    }

    public void addPlate(Plate plate) {
        plates.add(plate);
        plate.setParentPlate(this);
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public Plate getParentPlate() {
        return parentPlate;
    }

    public void setParentPlate(Plate parentPlate) {
        this.parentPlate = parentPlate;
    }
}
