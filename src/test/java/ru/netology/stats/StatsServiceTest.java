package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void sumAllSales() {
        int expected = 180;
        StatsService service = new StatsService();
        int actual = service.sumAllSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void SalesPerMonth() {
        int expected = 15;
        StatsService service = new StatsService();
        int actual = service.SalesPerMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void lastMaxSalesMonth() {
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.lastMaxSalesMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void lastMinSalesMonth() {
        int expected = 9;
        StatsService service = new StatsService();
        int actual = service.lastMinSalesMonth(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void aboveAvgMonthSales() {
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.aboveAvgMonthSales(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void belowAvgMonthSales() {
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.belowAvgMonthSales(purchases);
        assertEquals(expected, actual);
    }
}