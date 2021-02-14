package Lab1;

import java.util.Random;
import java.util.Scanner;

public class Prac_2 {
    Prac_2() {
        System.out.println("Задание 2");
        Random rnd = new Random();
        int number = rnd.nextInt(7) + 1;
        int[] a = new int[number];
        for(int i=0;i<number;i++){
            a[i]= (int) ((int) 2+Math.random()*10);
        }
        System.out.print("Элементы массива: ");
        for(int i=0;i<number;i++)
        {
            System.out.print(a[i]+ " ");

        }
        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( a[j] > a[j+1] ){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        System.out.print("Отсортированные Элементы массива: ");
        for(int i=0;i<number;i++)
        {
            System.out.print(a[i]+ " ");

        }

    }


}