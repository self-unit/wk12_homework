import accessories.Drumsticks;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    Drumsticks drumsticks;

    @Before
    public void before(){
        drumsticks = new Drumsticks(InstrumentType.PERCUSSION, 60.00, 78.00, 2);
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.PERCUSSION, drumsticks.getFamily());
    }

    @Test
    public void hasBoughtAtValue(){
        assertEquals(60.00, drumsticks.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellAtValue(){
        assertEquals(78.00, drumsticks.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.3, drumsticks.calculateMarkup(), 0.01);
    }

    @Test
    public void hasSets(){
        assertEquals(2, drumsticks.getSets());
    }
}
