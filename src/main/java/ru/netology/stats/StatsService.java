package ru.netology.stats;

public class StatsService {


    // Метод подсчёта суммы всех продаж за год и вывод результата
    public static int calculateStatsService(int[] yearlySales) {
        int sum = 0;
        for (int sale : yearlySales) {
            sum += sale;
        }
        return sum;
    }

    // Метод для подсчета средней суммы продаж
    public static int calculateAvgSalesPerMonth(int[] yearlySales) {
        if (yearlySales.length == 0) {
            return 0;
        }
        int total = calculateStatsService(yearlySales);
        int avgSales = 0;
        return avgSales = total / yearlySales.length;
    }

    // Метод определения номера месяца, в котором был минимум продаж
    public static int calculateMinSalesMonth(int[] yearlySales) {
        int minDay = 0;
        for (int i = 0; i < yearlySales.length; i++) {
            if (yearlySales[i] < yearlySales[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    // Метод определения номера месяца, в котором был максимум продаж
    public static int calculateMaxSalesMonth(int[] yearlySales) {
        int maxDay = 0;
        for (int i = 0; i < yearlySales.length; i++) {
            if (yearlySales[i] > yearlySales[maxDay]) {
                maxDay = i;
            }
        }
        return maxDay;
    }

    // Метод определения количества месяцев, в которых продажи были ниже среднего
    public static int calculateSalesBelowAverage(int[] yearlySales) {
        int monthsBelowAverage = 0;
        int avgSales = calculateAvgSalesPerMonth(yearlySales);
        for (int sale : yearlySales) {
            if (sale < avgSales) {
                monthsBelowAverage++;
            }
        }
        return monthsBelowAverage;
    }

    // Метод определения количества месяцев, в которых продажи были выше среднего
    public static int calculateSalesAboveAverage(int[] yearlySales) {
        int monthsAboveAverage = 0;
        int avgSales = calculateAvgSalesPerMonth(yearlySales);
        for (int sale : yearlySales) {
            if (sale > avgSales) {
                monthsAboveAverage++;
            }
        }
        return monthsAboveAverage;
    }

}


