package ru.netology.stats;

public class StatsService {
    public int calculateAllSalesSum(int[] monthlySales) {
        int allSalesSum = 0;
        for (int monthlySale : monthlySales) {
            allSalesSum += monthlySale;
        }
        return allSalesSum;

    }

    public int calculateAverageSum(int[] monthlySales) {
        int averageSum = calculateAllSalesSum(monthlySales);
        return averageSum / monthlySales.length;

    }

    public int maxMonthSales(int[] monthlySales) {
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] >= monthlySales[month])
                month = i;
        }
        return month;

    }

    public int minMonthSales(int[] monthlySales) {
        int month = 0;
        for (int i = 1; i < monthlySales.length; i++) {
            if (monthlySales[i] <= monthlySales[month])
                month = i;
        }
        return month;
    }

    public int minMonthsAverage(int[] monthlySales) {
        int average = calculateAverageSum(monthlySales);
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (average > monthlySale) {
                month++;
            }
        }
        return month;


    }

    public int maxMonthsAverage(int[] monthlySales) {
        int average = calculateAverageSum(monthlySales);
        int month = 0;
        for (int monthlySale : monthlySales) {
            if (average < monthlySale) {
                month++;
            }
        }
        return month;
    }


}




