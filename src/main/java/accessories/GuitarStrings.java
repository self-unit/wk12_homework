package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public class GuitarStrings extends Accessory implements ISell {

    private String type;
    private int amount;

    public GuitarStrings(InstrumentType family, double buyAt, double sellAt, String type, int amount){
        super(family, buyAt, sellAt);
        this.amount = amount;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }
}
