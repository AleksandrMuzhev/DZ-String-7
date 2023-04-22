package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int average = 0;
        for (int i : sales) {
            average += i;
        }
        return average / sales.length;
    }

    public int belowAverage(int[] sales) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) count++;
        }
        return count;
    }

    public int highAverage(int[] sales) {
        int sum = 0;
        int average = 0;
        int count = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / sales.length;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) count++;
        }
        return count;
    }
}