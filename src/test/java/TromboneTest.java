import instruments.ColourType;
import instruments.InstrumentType;
import instruments.MaterialType;
import instruments.Trombone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TromboneTest {

    Trombone trombone;

    @Before
    public void before() {
        trombone = new Trombone(MaterialType.ALUMINUM, ColourType.TEAL, InstrumentType.BRASS, 900.00, 1399.00, "C4-A8");
    }

    @Test
    public void hasType(){
        assertEquals(MaterialType.ALUMINUM, trombone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals(ColourType.TEAL, trombone.getColour());
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.BRASS, trombone.getFamily());
    }

    @Test
    public void hasBoughtValue(){
        assertEquals(900.00, trombone.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellValue(){
        assertEquals(1399.00, trombone.getSellAt(), 0.01);
    }

    @Test
    public void hasScale(){
        assertEquals("C4-A8", trombone.getScale());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.55, trombone.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("This Trombone makes a 'Parp' sound.", trombone.playSound());
    }
}
