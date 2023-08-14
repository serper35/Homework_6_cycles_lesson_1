public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задача №1");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task2() {
        System.out.println("\nЗадача №2");

        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task3() {
        System.out.println("\nЗадача №3");

        for (int i = 0; i < 18; i += 2) {
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task4() {
        System.out.println("\nЗадача №4");

        for (int i = 10; i >= -10; i--) {
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task5() {
        System.out.println("\nЗадача №5");

        for (int i = 1904; i <= 2096; i += 4) {
            if (i % 100 != 0) {
                System.out.println(i + " год является високосным.");
            }
        }
    }

    public static void task6() {
        System.out.println("\nЗадача №6");

        for (int i = 7; i <= 98; i+= 7) {
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task7() {
        System.out.println("\nЗадача №7");

        for (int i = 1; i <=512; i*= 2){
            System.out.println("Итерация цикла - " + i + ".");
        }
    }

    public static void task8() {
        System.out.println("\nЗадача №8");
        int accumulationPerMonth = 29000;
        int totalAccumulation = 0;

        for (int i = 1; i <= 12; i++) {
            totalAccumulation = totalAccumulation + accumulationPerMonth;
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + totalAccumulation +" рублей.");
        }
        System.out.println("Общая сумма накоплений равна " + totalAccumulation + ".");
    }

    public static void task9() {
        System.out.println("\nЗадача №9");
        double accumulationPerMonth = 29000;
        double totalAccumulation = 0;
        double percentPerMonth = 1.01;

        for (int i = 1; i <= 12; i++) {
            totalAccumulation = totalAccumulation * percentPerMonth + accumulationPerMonth;
            String result = String.format("%.3f",totalAccumulation);
            System.out.println("Месяц - " + i + ", сумма накоплений равна " + result +" рублей.");
        }
        String result = String.format("%.3f",totalAccumulation);
        System.out.println("Общая сумма накоплений равна " + result + " рублей.");
    }

    public static void task10() {
        System.out.println("\nЗадача №10");
        int number = 2;

        for (int i = 1; i <= 10; i++) {
            int sum = number * i;
            System.out.println(number +" * " + i + " = " + sum);
        }
    }
}