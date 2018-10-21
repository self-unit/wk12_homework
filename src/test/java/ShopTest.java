import accessories.Drumsticks;
import accessories.GuitarStrings;
import accessories.SheetMusic;
import accessories.TuningFork;
import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Drumsticks drumsticks;
    GuitarStrings guitarStrings;
    SheetMusic sheetMusic;
    TuningFork tuningFork;

    Guitar guitar;
    Marimba marimba;
    Piano piano;
    Trombone trombone;

    Shop shop;

    @Before
    public void before(){
        drumsticks = new Drumsticks(InstrumentType.PERCUSSION, 60.00, 78.00, 2);
        guitarStrings = new GuitarStrings(InstrumentType.STRING, 9.99, 15.00, "Bass", 6);
        sheetMusic = new SheetMusic(InstrumentType.VOCAL, 35.00, 53.99, "TLC", "Crazy, Sexy, Cool");
        tuningFork = new TuningFork(InstrumentType.VOCAL, 23.00, 25.00, "C#");

        guitar = new Guitar(MaterialType.STEEL, ColourType.SILVER, InstrumentType.STRING, 699.00, 999.00);
        marimba = new Marimba(MaterialType.WOOD, ColourType.INDIGO, InstrumentType.PERCUSSION, 5099.00, 6000.00, "Contra-Bass");
        piano = new Piano(MaterialType.WOOD, ColourType.BLACK, InstrumentType.KEYBAORD, 11000.00, 15000.00, "Upright");
        trombone = new Trombone(MaterialType.ALUMINUM, ColourType.TEAL, InstrumentType.BRASS, 900.00, 1399.00, "C4-A8");

        shop = new Shop(100.00);

    }

    @Test
    public void canAddStock(){
        shop.addStockItem(drumsticks);
        shop.addStockItem(guitarStrings);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(tuningFork);
        shop.addStockItem(guitar);
        shop.addStockItem(marimba);
        shop.addStockItem(piano);
        shop.addStockItem(trombone);
        assertEquals(8, shop.getStock().size());
    }

    @Test
    public void canFindItemByName(){
        shop.addStockItem(guitar);
        shop.addStockItem(marimba);
        assertEquals(true, shop.findStockItem(guitar));
    }

    @Test
    public void cantFindAbsentItemByName(){
        assertEquals(false, shop.findStockItem(piano));
    }

    @Test
    public void canSellStock(){
        shop.addStockItem(piano);
        shop.addStockItem(drumsticks);
        shop.sellStockItem(drumsticks);
        assertEquals(178.00, shop.getCashRegister(), 0.01);
        assertEquals(18.00, shop.getProfit(), 0.01);
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addStockItem(drumsticks);
        shop.addStockItem(guitarStrings);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(tuningFork);
        shop.addStockItem(guitar);
        shop.addStockItem(marimba);
        shop.addStockItem(piano);
        shop.addStockItem(trombone);
        assertEquals(5744.00, shop.getPotentialProfit(), 0.01);
    }

}
