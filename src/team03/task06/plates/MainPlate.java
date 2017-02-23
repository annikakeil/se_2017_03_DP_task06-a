package team03.task06.plates;

public class MainPlate extends Plate{

    //TODO public Sensor sensor ?

    // Constructor
    public MainPlate (String name) {
        super(name);
    }

    //Methods
    @Override
    public void swing(){
        int countSwing = 0;
        for(Plate p : plates){
            if(p.status == true){
                countSwing++;
            }
        }

        if(countSwing >= 2) {
            this.status=true;
        }
    }
}
