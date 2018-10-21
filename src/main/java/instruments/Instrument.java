package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private MaterialType material;
    private ColourType colour;
    private InstrumentType family;
    private double boughtAt;
    private double sellAt;

    public Instrument(MaterialType material, ColourType colour, InstrumentType family, double boughtAt, double sellAt){
        this.material = material;
        this.colour = colour;
        this.family = family;
        this.boughtAt = boughtAt;
        this.sellAt = sellAt;
    }

    @Override
    public String playSound(){
        return "This " + this.getClass().getSimpleName() +" makes a '" + family.getSound() + "' sound.";
    }

    @Override
    public double calculateMarkup() {
        return ((sellAt - boughtAt) / boughtAt);
    }

    @Override
    public String getName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public double getBoughtAt() {
        return boughtAt;
    }

    @Override
    public double getSellAt() {
        return sellAt;
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
}
