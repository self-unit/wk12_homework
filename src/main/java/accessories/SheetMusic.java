package accessories;

import behaviours.ISell;
import instruments.InstrumentType;

public class SheetMusic extends Accessory implements ISell {

    private String artist;
    private String album;

    public SheetMusic(InstrumentType family, double boughtAt, double sellAt, String artist, String album){
        super(family, boughtAt, sellAt);
        this.album = album;
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
