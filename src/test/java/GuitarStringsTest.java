
import accessories.GuitarStrings;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings(InstrumentType.STRING, 9.99, 15.00, "Bass", 6);
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.STRING, guitarStrings.getFamily());
    }

    @Test
    public void hasBoughtAtValue(){
        assertEquals(9.99, guitarStrings.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellAtValue(){
        assertEquals(15.00, guitarStrings.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.50, guitarStrings.calculateMarkup(), 0.01);
    }

    @Test
    public void hasType(){
        assertEquals("Bass", guitarStrings.getType());
    }

    @Test
    public void hasAmount(){
        assertEquals(6, guitarStrings.getAmount());
    }
}
