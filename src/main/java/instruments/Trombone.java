package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public class Trombone extends Instrument implements IPlay, ISell {

    private String scale;

    public Trombone(MaterialType material, ColourType colour, InstrumentType family, double boughtAt, double sellAt, String scale){
        super(material, colour, family, boughtAt, sellAt);
        this.scale = scale;
    }

    public String getScale() {
        return scale;
    }
}
