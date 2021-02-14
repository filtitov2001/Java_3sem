package Lab23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception2 {

        System.out.println("Задача 1");
        Zadacha1();
        System.out.println("Задача 2");
        Zadacha2();
        System.out.println("Задача 3");
        Zadacha3();
        System.out.println("Задача 4");
        Zadacha4();
        System.out.println("Задача 5");
        Zadacha5();

    }
    public static void Zadacha1()
    {
        ArrayList<Integer> integerArrayList = new Convertation().toList(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(integerArrayList);

        ArrayList<String> stringArrayList = new Convertation().toList(new String[]{"Hello", "world",  "matter"});
        System.out.println(stringArrayList);
    }

    public static void Zadacha2()
    {
        String[] strings = {"Hello", "world",  "matter"};
        Integer[] integers = {1, 2, 3, 4,5};

        Array2<String> stringArray = new Array2<>(strings);
        Array2<Integer> integerArray = new Array2<>(integers);

        System.out.println(Arrays.toString(stringArray.getArray()));
        System.out.println(Arrays.toString(integerArray.getArray()));

    }

    public static void Zadacha3()
    {
        String[] strings = {"Hello", "world",  "matter"};
        Integer[] integers = {1, 2, 3, 4,5};

        Array2<String> stringArray = new Array2<>(strings);
        Array2<Integer> integerArray = new Array2<>(integers);

        System.out.println(Arrays.toString(stringArray.getArray()));
        System.out.println(Arrays.toString(integerArray.getArray()));

        int ind = 1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringArray.at(ind));
        }
        catch (java.lang.Exception | Exception e) {
            System.out.println(e.getMessage());
        }

        ind = -1;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringArray.at(ind));
        }
        catch (java.lang.Exception | Exception e) {
            System.out.println(e.getMessage());
        }

        ind = 10;
        try {
            System.out.println("Элемент массива по индексу " + ind + ": " + stringArray.at(ind));
        }
        catch (java.lang.Exception | Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void Zadacha4() throws Exception2 {
        String path = ".idea";
        ArrayList<String> files = new Files(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));

        path = "src//Lab23";
        files = new Files(path).getDirectoryContent();
        System.out.println(path + ":");
        for (int i = 0; i < 5 && i < files.size(); i++)
            System.out.println(files.get(i));


    }

    public static void Zadacha5()
    {
        String[] strings = {"Hello", "world",  "matter"};
        Integer[] integers = {1, 2, 3, 4};

        Collections[] pairs = new Collections[Math.min(strings.length, integers.length)];
        for (int i = 0; i < strings.length && i < integers.length; i++)
            pairs[i] = new Collections(strings[i], integers[i]);

        ArrayList<String> stringArrayList = new Solution().newArrayList(strings);
        HashSet<Integer> integerHashSet = new Solution().newHashSet(integers);
        HashMap<String, Integer> stringIntegerHashMap = new Solution().newHashMap(pairs);

        System.out.println(stringArrayList);
        System.out.println(integerHashSet);
        System.out.println(stringIntegerHashMap);
    }

}
