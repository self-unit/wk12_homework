import accessories.TuningFork;
import instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TuningForkTest {
    TuningFork tuningFork;

    @Before
    public void before(){
        tuningFork = new TuningFork(InstrumentType.VOCAL, 23.00, 25.00, "C#");
    }

    @Test
    public void hasFamily(){
        assertEquals(InstrumentType.VOCAL, tuningFork.getFamily());
    }

    @Test
    public void hasBoughtAtValue(){
        assertEquals(23.00, tuningFork.getBoughtAt(), 0.01);
    }

    @Test
    public void hasSellAtValue(){
        assertEquals(25.00, tuningFork.getSellAt(), 0.01);
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(0.09, tuningFork.calculateMarkup(), 0.01);
    }

    @Test
    public void hasType(){
        assertEquals("C#", tuningFork.getKey());
    }

}
