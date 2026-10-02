package ru.netology.stats;

import static ru.netology.stats.StatsService.*;

public class Main {

    public static void main(String[] args) {
        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        // Вызов метода подсчёта суммы всех продаж за год и вывод результата
        int StatsService = calculateStatsService(yearlySales);
        System.out.println("Сумма продаж за год: " + StatsService);

        // Вызов метода подсчёта средней суммы продаж за месяц
        int avgSalesPerMonth = calculateAvgSalesPerMonth(yearlySales);
        System.out.println("Средняя сумма продаж за месяц: " + avgSalesPerMonth);

        // Вызов метода определения номера месяца с минимальной суммой продаж
        int minSalesMonth = calculateMinSalesMonth(yearlySales);
        System.out.println("Номер месяца с минимальной суммой продаж: " + minSalesMonth);

        // Вызов метода определения номера месяца с максимальной суммой продаж
        int maxSalesMonth = calculateMaxSalesMonth(yearlySales);
        System.out.println("Номер месяца с максимальной суммой продаж: " + maxSalesMonth);

        // Вызов метода определения количества месяцев, в которых продажи были ниже среднего
        int salesBelowAverage = calculateSalesBelowAverage(yearlySales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + salesBelowAverage);

        // Вызов метода определения количества месяцев, в которых продажи были выше среднего
        int salesAboveAverage = calculateSalesAboveAverage(yearlySales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + salesAboveAverage);

    }
}