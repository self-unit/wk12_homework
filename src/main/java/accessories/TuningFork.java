package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public class TuningFork extends Accessory implements ISell {

    private String key;

    public TuningFork(InstrumentType family, double boughtAt, double sellAt, String key){
        super(family, boughtAt, sellAt);
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
