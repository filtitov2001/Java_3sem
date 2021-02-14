package Lab15;

import java.util.Scanner;

public class MyCollection
{
    private static int[] array;
    private static int size;

    public static int getSize(){
        return size;
    }

    public  MyCollection(){
        array = new int[0];
    }

    static Scanner scanner = new Scanner(System.in);


    public static void addElem() {
        System.out.print("Введите значение элемента: ");
        int item = scanner.nextInt();
        if (array.length == 0)
            array = new int[1];
        else {
            int[] buffArray = new int[array.length + 1];
            System.arraycopy(array, 0, buffArray, 0, buffArray.length - 1);
            array = new int[array.length + 1];
            System.arraycopy(buffArray, 0, array, 0, array.length);
        }
        array[array.length - 1] = item;
        size++;
    }
    public static void removeElem(){
        System.out.print("Введите индекс элемента: ");
        int ind = scanner.nextInt();
        if (array.length == 0 || ind >= array.length || ind < 0)
            return;
        boolean check = false;
        array[ind] = Integer.MIN_VALUE;
        int[] buffArray = new int[array.length - 1];
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == Integer.MIN_VALUE)
                check = true;
            if (!check)
                buffArray[i] = array[i];
            else
                buffArray[i] = array[i + 1];
        }
        array = new int[array.length - 1];
        System.arraycopy(buffArray, 0, array, 0, array.length);
        size--;
    }

    public static int searchEl()
    {
        System.out.print("Введите значение элемента: ");
        int item = scanner.nextInt();
        for (int i = 0; i < array.length; i++)
            if (array[i] == item)
                return i;
        return Integer.MIN_VALUE;
    }

    public static int searchEl_onInd()
    {
        System.out.print("Введите индекс элемента: ");
        int ind = scanner.nextInt();
        return (ind < array.length && ind >= 0) ? array[ind] : Integer.MIN_VALUE;
    }

    public static int maxValue()
    {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }

    public static int minValue()
    {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++)
            if (array[i] < min)
                min = array[i];
        return min;
    }
    public static void printList(){
        System.out.print("[");
        for (int i = 0; i < getSize(); i++)
            System.out.print(array[i] + " ");
        System.out.print("]");
    }

    public static double getAverage() {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return array.length > 0 ? (double)(sum / array.length) : 0;


    }


}