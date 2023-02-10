package ru.netology.javaqa.javaqamvn.services;

public class SalesService {

    public int sumSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int averageSales(int[] sales) {

        int sum = sumSales(sales);

        int average = sum / sales.length;

        return average;
    }

    public int lowAverageSumSales(int[] sales) {

        int sum = sumSales(sales);

        int averageSumSales = sum / sales.length;
        int monthAmount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                monthAmount++;
            }
        }
        return monthAmount;
    }

    public int upAverageSumSales(int[] sales) {
        int sum = sumSales(sales);

        int averageSumSales = sum / sales.length;
        int monthSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSumSales) {
                monthSales++;
            }
        }
        return monthSales;
    }
}


