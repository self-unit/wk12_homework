import instruments.ColourType;
import instruments.Guitar;
import instruments.InstrumentType;
import instruments.MaterialType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar(MaterialType.STEEL, ColourType.SILVER, InstrumentType.STRING, 699.00, 999.00);
    }

    @Test
    public void hasType(){
        assertEquals(MaterialType.STEEL, guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals(ColourType.SILVER, guitar.getColour());
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.STRING, guitar.getFamily());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void hasBoughtValue(){
        assertEquals(699.00, guitar.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellValue(){
        assertEquals(999.00, guitar.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(0.43, guitar.calculateMarkup(), 0.01);
    }

    @Test
    public void canPlaySound(){
        assertEquals("This Guitar makes a 'Vrrrrrrrr' sound.", guitar.playSound());
    }

}
