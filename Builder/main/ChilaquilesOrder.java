package org.example;

public class ChilaquilesOrder
{
    private int quantity;
    private double pricePerOrder;

    public ChilaquilesOrder(int quantity, double pricePerOrder) {
        this.quantity = quantity;
        this.pricePerOrder = pricePerOrder;
    }

    public double calculateTotalPrice() {
        return quantity * pricePerOrder;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerOrder() {
        return pricePerOrder;
    }
}
