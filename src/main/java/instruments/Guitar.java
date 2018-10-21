package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {

    private int numberOfStrings;

    public Guitar(MaterialType material, ColourType colour, InstrumentType family, double buyAt, double sellAt){
        super(material, colour, family, buyAt, sellAt);
        this.numberOfStrings = 5;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
