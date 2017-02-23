package team03.task06.plates;

public class SubPlate extends Plate{



    public SubPlate(String name, Plate parentPlate){
        super(name, parentPlate);
        parentPlate.addPlate(this);
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

        if(countSwing >= 3) {
            this.status=true;
        }
    }
}
