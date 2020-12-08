package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    @Test
    void calculateAllSalesSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.calculateAllSalesSum(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSum() {
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.calculateAverageSum(monthlySales);
        assertEquals(expected, actual);

    }

    @Test
    void maxMonthSales() {
        StatsService service = new StatsService();
        int expected = 7;
        int actual = service.maxMonthSales(monthlySales);
        assertEquals(expected, actual);

    }

    @Test
    void minMonthSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.minMonthSales(monthlySales);
        assertEquals(expected, actual);
    }

    @Test
    void minMonthsAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.minMonthsAverage(monthlySales);
        assertEquals(expected, actual);


    }

    @Test
    void maxMonthsAverage() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.maxMonthsAverage(monthlySales);
        assertEquals(expected, actual);


    }


}