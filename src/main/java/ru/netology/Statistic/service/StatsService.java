package ru.netology.Statistic.service;

public class StatsService {


    // Вызов метода подсчёта суммы всех продаж за год и вывод результата
    public int getYearRevenue(int[] sales) {
        int sum = 0;
        for (int monthSale : sales) {
            sum += monthSale;
        }
        return sum;
    }
    // Вызов метода подсчёта средней суммы продаж за месяц
    public double getAverageMonthlySales(int[] sales) {
        return Math.round(getYearRevenue(sales) * 100.0 / sales.length) / 100.0;
    }
    // Вызов метода определения номера месяца с максимальной суммой продаж
    public int getLastMaxMonthSales(int[] sales) {
        int currentMaxSalesMonth = 0;
        int currentMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= currentMax) {
                currentMax = sales[i];
                currentMaxSalesMonth = i;
            }
        }
        return currentMaxSalesMonth + 1;
    }
    // Вызов метода определения номера месяца с минимальной суммой продаж
    public int getLastMinMonthSales(int[] sales) {
        int currentMinSalesMonth = 0;
        int currentMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= currentMin) {
                currentMin = sales[i];
                currentMinSalesMonth = i;
            }
        }
        return currentMinSalesMonth + 1;
    }
    // Вызов метода определения количества месяцев, в которых продажи были ниже среднего
    public int getCountMonthsWithSalesLowerAverage(int[] sales) {
        int monthsAmount = 0;
        double averageMonthlySales = getAverageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale < averageMonthlySales) {
                monthsAmount++;
            }
        }
        return monthsAmount;
    }
    // Вызов метода определения количества месяцев, в которых продажи были выше среднего
    public int getCountMonthsWithSalesHigherAverage(int[] sales) {
        int monthsAmount = 0;
        double averageMonthlySales = getAverageMonthlySales(sales);
        for (int monthSale : sales) {
            if (monthSale > averageMonthlySales) {
                monthsAmount++;
            }
        }
        return monthsAmount;
    }

}


