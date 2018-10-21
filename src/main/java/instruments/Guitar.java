package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(MaterialType material, ColourType colour, InstrumentType family, double boughtAt, double sellAt){
        super(material, colour, family, boughtAt, sellAt);
        this.numberOfStrings = 5;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
