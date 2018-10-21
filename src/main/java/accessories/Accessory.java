package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public abstract class Accessory implements ISell {

    private InstrumentType family;
    private double boughtAt;
    private double sellAt;

    public Accessory(InstrumentType family, double boughtAt, double sellAt){
        this.family = family;
        this.boughtAt = boughtAt;
        this.sellAt = sellAt;
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

    public InstrumentType getFamily() {
        return family;
    }
}
