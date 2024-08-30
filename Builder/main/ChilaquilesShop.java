package org.example;
import java.util.Scanner;
public class ChilaquilesShop
{
    private SalesRecord salesRecord;
    private static final double PRICE_PER_ORDER = 50.0;

    public ChilaquilesShop() {
        salesRecord = new SalesRecord();
    }

    // Core logic for taking an order
    public void takeOrder(int quantity) {
        ChilaquilesOrder order = new ChilaquilesOrder(quantity, PRICE_PER_ORDER);
        salesRecord.addOrder(order);
    }

    // Core logic for getting total sales
    public double getTotalSales() {
        return salesRecord.calculateTotalSales();
    }
}
