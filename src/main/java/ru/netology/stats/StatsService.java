package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] purchases) {
        int sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public int SalesPerMonth(int[] purchases) {
        return sumAllSales(purchases) / purchases.length;
    }

    public int lastMaxSalesMonth(int[] purchases) {
        int month = 0;
        int lastMaxMonth = month;
        int lastMaxPurchase = purchases[0];
        for (int purchase : purchases) {
            month += 1;
            if (lastMaxPurchase <= purchase) {
                lastMaxPurchase = purchase;
                lastMaxMonth = month;
            }
        }
        return lastMaxMonth;
    }

    public int lastMinSalesMonth(int[] purchases) {
        int month = 0;
        int lastMinMonth = month;
        int lastMinPurchase = purchases[0];
        for (int purchase : purchases) {
            month += 1;
            if (lastMinPurchase >= purchase) {
                lastMinPurchase = purchase;
                lastMinMonth = month;
            }
        }
        return lastMinMonth;
    }

    public int aboveAvgMonthSales(int[] purchases) {
        int aboveAvgMonth = 0;
        int avgSalesPerMonth = SalesPerMonth(purchases);
        for (int purchase : purchases) {
            if (avgSalesPerMonth < purchase) {
                aboveAvgMonth += 1;
            }
        }
        return aboveAvgMonth;
    }

    public int belowAvgMonthSales(int[] purchases) {
        int belowAvgMonth = 0;
        int SalesPerMonth = SalesPerMonth(purchases);
        for (int purchase : purchases) {
            if (SalesPerMonth > purchase) {
                belowAvgMonth += 1;
            }
        }
        return belowAvgMonth;
    }
}