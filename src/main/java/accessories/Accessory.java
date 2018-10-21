package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public abstract class Accessory implements ISell {

    private InstrumentType family;
    private double buyAt;
    private double sellAt;

    public Accessory(InstrumentType family, double buyAt, double sellAt){
        this.family = family;
        this.buyAt = buyAt;
        this.sellAt = sellAt;
    }

    @Override
    public double calculateMarkup() {
        return ((sellAt - buyAt) / buyAt);
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
