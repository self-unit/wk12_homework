import instruments.ColourType;
import instruments.InstrumentType;
import instruments.Marimba;
import instruments.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MarimbaTest {

    Marimba marimba;

    @Before
    public void before() {
        marimba = new Marimba(MaterialType.WOOD, ColourType.INDIGO, InstrumentType.PERCUSSION, 5099.00, 6000.00, "Contra-Bass");
    }

    @Test
    public void hasType(){
        assertEquals(MaterialType.WOOD, marimba.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals(ColourType.INDIGO, marimba.getColour());
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.PERCUSSION, marimba.getFamily());
    }

    @Test
    public void hasBoughtValue(){
        assertEquals(4099.00, marimba.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellValue(){
        assertEquals(6000.00, marimba.getSellAt(), 0.01);
    }

    @Test
    public void hasRange(){
        assertEquals("Contra-Bass", marimba.getRange());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.18, marimba.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("This Marimba makes a 'Clack' sound.", marimba.playSound());
    }
}
