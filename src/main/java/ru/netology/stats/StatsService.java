package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales = totalSales + sale;
        }
        return totalSales;
    }

    public long averageSales(long[] sales) {
        long totalSales = sumSales(sales);

        return totalSales / sales.length;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int monthsWhenSalesBelowAverage(long[] sales) {
        int quantity = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                quantity++;
            }
        }
        return quantity;
    }

    public int monthsWhenSalesAboveAverage(long[] sales) {
        int quantity = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                quantity++;
            }
        }
        return quantity;
    }
}


