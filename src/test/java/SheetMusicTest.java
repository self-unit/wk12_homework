import accessories.SheetMusic;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(InstrumentType.VOCAL, 35.00, 53.99, "TLC", "Crazy, Sexy, Cool");
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.VOCAL, sheetMusic.getFamily());
    }

    @Test
    public void hasBoughtAtValue(){
        assertEquals(35.00, sheetMusic.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellAtValue(){
        assertEquals(53.99, sheetMusic.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.54, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void hasArtist(){
        assertEquals("TLC", sheetMusic.getArtist());
    }

    @Test
    public void hasAlbum(){
        assertEquals("Crazy, Sexy, Cool", sheetMusic.getAlbum());
    }
}
