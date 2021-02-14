package Lab1;

import java.util.Scanner;

public class Prac_3 {
    public static int factorial(int x){
        int res = 1;
        for (int i =1 ;i<=x;i++){
            res=res*i;
        }
        return res;
    }
    Prac_3(){
        System.out.println("Задание 3");
        Scanner fact = new Scanner(System.in);
        System.out.println("Введите число: ");
        int x = fact.nextInt();
        System.out.println(factorial(x));
    }
}