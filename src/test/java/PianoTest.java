import instruments.ColourType;
import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before() {
        piano = new Piano(MaterialType.WOOD, ColourType.BLACK, InstrumentType.KEYBAORD, 11000.00, 15000.00, "Upright");
    }

    @Test
    public void hasType(){
        assertEquals(MaterialType.WOOD, piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals(ColourType.BLACK, piano.getColour());
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.KEYBAORD, piano.getFamily());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void hasSetup(){
        assertEquals("Upright", piano.getSetup());
    }

    @Test
    public void hasBoughtValue(){
        assertEquals(11000.00, piano.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellValue(){
        assertEquals(15000.00, piano.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.36, piano.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("This Piano makes a 'Plink-Plonk' sound.", piano.playSound());
    }
}
