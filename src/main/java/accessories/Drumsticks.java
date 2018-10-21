package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public class Drumsticks extends Accessory implements ISell {

    private int sets;

    public Drumsticks(InstrumentType family, double boughtAt, double sellAt, int sets){
        super(family, boughtAt, sellAt);
        this.sets = sets;
    }

    public int getSets() {
        return sets;
    }

}
