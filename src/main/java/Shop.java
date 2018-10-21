import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private double cashRegister;
    private double profit;

    public Shop(double cashRegister){
        this.cashRegister = cashRegister;
        this.stock = new ArrayList<>();
        this.profit = 0;
    }

    public double getCashRegister() {
        return cashRegister;
    }

    public double getProfit() {
        return profit;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addStockItem(ISell stockItem) {
        this.stock.add(stockItem);
    }

    public boolean findStockItem(ISell stockItem) {
        return this.stock.contains(stockItem);
    }

    public void sellStockItem(ISell stockItem) {
        for (ISell item : stock) {
            if (item == stockItem) {
                this.cashRegister += item.getSellAt();
                this.profit += (item.getSellAt() - item.getBoughtAt());
            }
        }
        this.stock.remove(stockItem);
    }

    public double getPotentialProfit(){
        for (ISell item : stock) {
            this.profit += (item.calculateMarkup() * item.getBoughtAt());
        }
        return this.profit;
    }
}
