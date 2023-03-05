package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
//            totalSale = totalSale + sale;
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public long monthMaxSale(long[] sales) {
        int monthMax = 0;
        long maxSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                monthMax = i;
                maxSale = sales[i];
            }
        }
        return monthMax + 1;
    }

    public long monthMinSale(long[] sales) {
        int monthMin = 0;
        long minSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                monthMin = i;
                minSale = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int monthLessAverage(long[] sales) {
        int counter = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int counter = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale > avg) {
                counter++;
            }
        }
        return counter;
    }
}




