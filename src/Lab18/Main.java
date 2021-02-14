package Lab18;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void Zadanie1()
    {
        System.out.println("Задание 1");
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.print(x + " = ");
        recursionZ1(x, 2);
        System.out.print("1\n");
    }
    public static void Zadanie2()
    {
        System.out.println("Задание 2");
        System.out.print("Введите слово: ");
        String str = scanner.next();
        System.out.println(recursionZ2(str));

    }
    public static void Zadanie3()
    {
        System.out.println("Задание 3");
        System.out.println("Максимум: " + recursionZ3());

    }

    public static String recursionZ2(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursionZ2(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void recursionZ1(int n, int k) {

        if (k > n / 2) {
            System.out.print(n + " * ");
            return;
        }

        if (n % k == 0) {
            System.out.print(k+ " * ");
            recursionZ1(n / k, k);
        }
        else {
            recursionZ1(n, ++k);
        }
    }

    public static int recursionZ3() {
        int n = scanner.nextInt();
        if (n == 0) {
            return 0;
        }
        else {
            return Math.max(n, recursionZ3());
        }
    }
    public static void main(String[] args) {

        Zadanie1();
        Zadanie2();
        Zadanie3();


    }
}