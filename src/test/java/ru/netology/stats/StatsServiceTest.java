package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculateStatsServiceTest() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 44390000;
        int actualSum = service.calculateStatsService(yearlySales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void calculateAvgSalesPerMonth() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 3699166;
        int avgSales = service.calculateAvgSalesPerMonth(yearlySales);

        Assertions.assertEquals(expectedSum, avgSales);
    }

    @Test
    public void calculateMinSalesMonth() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 0;
        int minDay = service.calculateMinSalesMonth(yearlySales);

        Assertions.assertEquals(expectedSum, minDay);
    }

    @Test
    public void calculateMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 11;
        int maxDay = service.calculateMaxSalesMonth(yearlySales);

        Assertions.assertEquals(expectedSum, maxDay);
    }

    @Test
    public void calculateSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 5;
        int monthsBelowAverage = service.calculateSalesBelowAverage(yearlySales);

        Assertions.assertEquals(expectedSum, monthsBelowAverage);
    }

    @Test
    public void calculateSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] yearlySales = {1_900_000, 2_800_000, 2_950_000, 3_890_000, 3_500_000, 3_500_000, 3_900_000, 4_000_000, 4_300_000, 3_900_000, 4_800_000, 4_950_000};

        int expectedSum = 7;
        int monthsAboveAverage = service.calculateSalesAboveAverage(yearlySales);

        Assertions.assertEquals(expectedSum, monthsAboveAverage);
    }

}
