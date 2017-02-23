package team03.task06.Repository;

import team03.task06.Others.Measure;

import java.util.ArrayList;

public class Repository {

    private ArrayList<Measure> measureRepository = new ArrayList<Measure>();

    public void addMeasure(Measure m){
        measureRepository.add(m);
    }

    public ArrayList<Measure> read(){
        return measureRepository;
    }
}
