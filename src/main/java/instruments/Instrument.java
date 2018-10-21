package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private MaterialType material;
    private ColourType colour;
    private InstrumentType family;
    private double buyAt;
    private double sellAt;

    public Instrument(MaterialType material, ColourType colour, InstrumentType family, double buyAt, double sellAt){
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.buyAt = buyAt;
        this.sellAt = sellAt;
    }

    @Override
    public double calculateMarkup() {
        return ((sellAt - buyAt) / buyAt);
    }

    @Override
    public String playSound(){
        return "A " + family.name() + " makes " + family.getSound() + " sound.";
    }

    public MaterialType getMaterial() {
        return material;
    }

    public ColourType getColour() {
        return colour;
    }

    public void setColour(ColourType colour) {
        this.colour = colour;
    }

    public InstrumentType getFamily() {
        return family;
    }

    public double getBuyAt() {
        return buyAt;
    }

    public double getSellAt() {
        return sellAt;
    }
}
