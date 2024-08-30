package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class SalesRecordTest
{
    @Test
    public void testCalculateTotalSales() {
        SalesRecord record = new SalesRecord();
        record.addOrder(new ChilaquilesOrder(3, 50.0));
        record.addOrder(new ChilaquilesOrder(2, 50.0));
        double expectedTotalSales = 250.0;
        assertEquals(expectedTotalSales, record.calculateTotalSales(), "Total sales should be 250.0");
    }
}
