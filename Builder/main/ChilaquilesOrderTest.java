package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ChilaquilesOrderTest {
    @Test
    public void testCalculateTotalPrice() {
        ChilaquilesOrder order = new ChilaquilesOrder(3, 50.0);
        double expectedTotalPrice = 150.0;
        assertEquals(expectedTotalPrice, order.calculateTotalPrice(), "Total price should be 150.0");
    }

    @Test
    public void testGetQuantity() {
        ChilaquilesOrder order = new ChilaquilesOrder(3, 50.0);
        assertEquals(3, order.getQuantity(), "Quantity should be 3");
    }

    @Test
    public void testGetPricePerOrder() {
        ChilaquilesOrder order = new ChilaquilesOrder(3, 50.0);
        assertEquals(50.0, order.getPricePerOrder(), "Price per order should be 50.0");
    }
}
