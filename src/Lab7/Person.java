package Lab7;

import java.util.ArrayList;
import java.util.Scanner;


public class Person
{

    private static  String color;
    private static String material;
    private static double height;
    private static int person_id;
    ArrayList<Furniture> bag = new ArrayList<>();

    Person(int person_id)
    {
        this.person_id=person_id;

    }

    public void shopping(Furniture f)
    {
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<bag.size();i++)
        {
            System.out.println("Какой атрибут мебели вы хотите добавить в корзину?");
            System.out.println("Введите [1] - добавить стол");
            System.out.println("Введите [2] - добавить гардероб");
            System.out.println("Введите [3] - добавить диван");
            System.out.println("Введите [4] - добавить стул");
            System.out.println("Введите [5] - добавить кресло");
            int t = scanner.nextInt();
            do {
                switch (t) {
                    case 1:
                        bag.set(i, new Table("Cтол", color, material, height));
                        System.out.println("Товар добавлен в корзину!");
                        break;
                    case 2:
                        bag.set(i, new Wardrobe("Гардероб", color, material, height));
                        System.out.println("Товар добавлен в корзину!");
                        break;
                    case 3:
                        bag.set(i, new Sofa("Диван", color, material, height));
                        System.out.println("Товар добавлен в корзину!");
                        break;
                    case 4:
                        bag.set(i, new Chair("Стул", color, material, height));
                        System.out.println("Товар добавлен в корзину!");
                        break;
                    case 5:
                        bag.set(i, new Armchair("Кресло", color, material, height));
                        System.out.println("Товар добавлен в корзину!");
                        break;

                    default:
                        System.out.println("Введено неверное значение!");
                        System.out.println("Повторите попытку!");
                        break;

                }
            } while ((t<1)||(t>5));

        }
        System.out.println("Ваша корзина полная!");
        Output_bag();

    }
    public void Output_bag()
    {
        System.out.println("Ваша корзина:");
        for(int i=0;i< bag.size();i++)
        {
            System.out.println("Корзина "+ person_id+"-ого человка: ");
            System.out.println(i+1 + "-ый атрибут: " + bag.get(i).toString());

        }
    }





}
