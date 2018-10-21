package instruments;

public enum InstrumentType {
    WOODWIND("haaaaaaaar"),
    BRASS("Parp"),
    STRING("Vrrrrrrrr"),
    KEYBAORD("Plink-Plonk"),
    PERCUSSION("Clack"),
    VOCAL("AHHH");

    private final String sound;

    InstrumentType(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
