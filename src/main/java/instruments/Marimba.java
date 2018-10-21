package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Marimba extends Instrument implements IPlay, ISell {

    private String range;

    public Marimba(MaterialType material, ColourType colour, InstrumentType family, double boughtAt, double sellAt, String range){
        super(material, colour, family, boughtAt, sellAt);
        this.range = range;
    }

    public String getRange() {
        return range;
    }
}
