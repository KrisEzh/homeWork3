package com.company;

public class Main {

    public static void main(String[] args) {

        int clientOS = 1;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        //homeTask2

        int clientOs = 1;
        int phoneYear = 2015;
        if (clientOs == 1 && phoneYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }


        //homeTask3

        int year = 2021;
        if (year % 400 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год является високосным");
        } else if (year % 4 == 0) {
            System.out.println("Год является високосным");
        } else
            System.out.println("Год не является високосным");


        //homeTask4


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней : 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }


        //homeTask 5

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
        }


        //homeTask6

        int clientAge = 19;
        int clientSalary = 58_000;
        if (clientAge >= 23 && clientSalary >= 50_000) {
            System.out.println(clientSalary * 3 * 1.2);
        } else if (clientAge >= 23 && clientSalary >= 80_000) {
            System.out.println(clientSalary * 3 * 1.5);
        } else if (clientAge < 23 && clientSalary >= 50_000) {
            System.out.println(clientSalary * 2 * 1.2);
        } else if (clientAge < 23 && clientSalary >= 80_000) {
            System.out.println(clientSalary * 2 * 1.2);
        }


        //homeTask 7


        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;
        int baseRate = 10;
        int maxMonthPayment = salary / 2;
        System.out.println("Максимальный платеж при ЗП 330_000 рублей равен" + maxMonthPayment);
        int time = 12;
        double middleMonthPayment = (wantedSum / 12) + ((10 / 12) * wantedSum);
        System.out.println("Платеж по кредитеу равен " + middleMonthPayment);
        double middleMonthPaymentLess23 = middleMonthPayment + middleMonthPayment / 100 * 1;
        double middleMonthPaymentLess30 = middleMonthPayment + middleMonthPayment / 100 * 0.5;
        if (maxMonthPayment > middleMonthPaymentLess23 && salary > 80_000) {
            System.out.println("Кредит одобрен - 0.7%");
        } else if (maxMonthPayment > middleMonthPayment && salary < 80_000) {
            System.out.println("Кредит одобрен");
        } else if (maxMonthPayment < middleMonthPayment) {
            System.out.println("В кредите отказано");
        }


    }
}