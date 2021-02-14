package Lab10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задача 1");
        Zadacha1();
        System.out.println("Задача 2");
        Zadacha2();
        System.out.println("Задача 3");
        Zadacha3();
    }

    static void Zadacha3()
    {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(recursion(a));

    }

    static void Zadacha2()
    {
        System.out.println("a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("b: ");
        int b = scanner.nextInt();
        System.out.println(recursion(a, b));

    }


    static void Zadacha1()
    {
        int s = 0, k = 0, d = 0;

        System.out.println("K: ");
        Scanner scanner = new Scanner(System.in);

        k = scanner.nextInt();
        System.out.println("Summ: ");
        s = scanner.nextInt();

        int i = (int) Math.pow(10, k - 1);
        while (i < Math.pow(10, k)) {
            int ssum = 0, num = i;

            while (num>0) {
                ssum += num % 10;
                num /= 10;
            }

            if (ssum == s) {
                System.out.println(i + " ");
                d++;
            }
            i++;
        }
        System.out.println("\nЧисло номеров: " + d);
    }

    public static int recursion(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return recursion(a, b - 1) + recursion(a - 1, b - 1);
    }

    public static String recursion(int n) {
        if (n < 10) {
            return Integer.toString(n);
        }
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
}