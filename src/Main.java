import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("домашка 4-2");
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int goal = 2459000;
        int sum = 0;
        int monthDeposin = 15000;
        int i = 0;
        while (sum < goal) {
            sum += monthDeposin;
            i++;
        }
        String msg = String.format("Месяц %s сумма накоплений равна %s рублей", i, sum);
        System.out.println(msg);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.printf(j + " ");

        }
        System.out.println();

    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int fertility = 17;
        int mortality = 8;
        int term = 10;
        int year = 0;
        while (year < term) {
            population = population + population * (fertility - mortality) / 1000;
            year++;
            System.out.println(" Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int procent = 7;
        double sum = 15000;
        double goal = 12000000;
        int month = 1;
        while (sum < goal) {
            sum += sum * procent / 100;
            System.out.println(String.format(" Месяц %s, сумма накоплений составляет %s", month, sum));
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int procent = 7;
        double sum = 15000;
        double goal = 12000000;
        int month = 1;
        while (sum < goal) {
            sum += sum * procent / 100;
            if (month % 6 == 0) {
                System.out.println(String.format(" Месяц %s, сумма накоплений составляет %s", month, sum));
            }
            month++;
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int procent = 7;
        double sum = 15000;
        int yearCount = 9;
        int month = 1;
        while (month <= yearCount * 12) {
            sum += sum * procent / 100;
            if (month % 6 == 0) {
                System.out.println(String.format(" Месяц %s, сумма накоплений составляет %s", month, sum));
            }
            month++;
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int friday = 1;
        int dayMonth = 31;
        int dayWeek = 7;
        for (int i = friday; i <= dayMonth; i += dayWeek) {
            System.out.println(String.format("Сегодня пятница, %s -е число. Необходимо подготовить отчет", i));
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int commet = 79;
        int prevTerm = 200;
        int nextTerm = 100;
        int currentYear = 2023;
        for (int i = currentYear - prevTerm; i < currentYear + nextTerm; i++) {
            if (i % commet == 0) {
                System.out.println(i);
            }
        }
    }
}









