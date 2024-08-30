package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class ChilaquilesShopTest
{
    @Test
    public void testTakeOrder() {
        ChilaquilesShop shop = new ChilaquilesShop();
        shop.takeOrder(3);
        double expectedTotalSales = 150.0;
        assertEquals(expectedTotalSales, shop.getTotalSales(), "Total sales should be 150.0");
    }

    @Test
    public void testMultipleOrders() {
        ChilaquilesShop shop = new ChilaquilesShop();
        shop.takeOrder(3);
        shop.takeOrder(2);
        double expectedTotalSales = 250.0;
        assertEquals(expectedTotalSales, shop.getTotalSales(), "Total sales should be 250.0");
    }
}
