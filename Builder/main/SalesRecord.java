package org.example;
import java.util.ArrayList;
import java.util.List;
public class SalesRecord
{
    private List<ChilaquilesOrder> orders;

    public SalesRecord() {
        orders = new ArrayList<>();
    }

    public void addOrder(ChilaquilesOrder order) {
        orders.add(order);
    }

    public double calculateTotalSales() {
        return orders.stream().mapToDouble(ChilaquilesOrder::calculateTotalPrice).sum();
    }
}
