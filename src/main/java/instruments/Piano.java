package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Piano extends Instrument implements IPlay, ISell {

    private int numberOfKeys;
    private String setup;

    public Piano(MaterialType material, ColourType colour, InstrumentType family, double boughtAt, double sellAt, String setup){
        super(material, colour, family, boughtAt, sellAt);
        this.setup = setup;
        this.numberOfKeys = 88;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String getSetup() {
        return setup;
    }
}
