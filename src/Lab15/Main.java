package Lab15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int x;
        MyCollection myCollection = new MyCollection();
        do {
            System.out.println("[1] - добавить элемент \n" +
                    "[2] - удалить элемент \n" +
                    "[3] - поиск элемента по значению\n" +
                    "[4] - поиск элемента по индексу \n" +
                    "[5] - поиск максимального элемента \n" +
                    "[6] - поиск минимального элемента \n" +
                    "[7] - поиск среднего арифметического всех элементов\n"+
                    "[8] - Вывести колеекцию чисел на экран\n"+
                    "[0] - Выход");
            System.out.print("Выберете команду: ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    myCollection.addElem();
                    System.out.print("Элемент добавлен!");
                    System.out.println();
                    break;
                case 2:
                    myCollection.removeElem();
                    System.out.print("Элемент удален!");
                    System.out.println();
                    break;
                case 3:
                    int result = myCollection.searchEl();
                    if (result != Integer.MIN_VALUE)
                        System.out.println(result);
                    else
                        System.out.println("Элемент отсутствует!");
                    System.out.println();
                    break;
                case 4:
                    int result1 = myCollection.searchEl_onInd();
                    if (result1 != Integer.MIN_VALUE)
                        System.out.println("На введенной позиции находится элемент: " + result1);
                    else
                        System.out.println("Элемент отсутствует!");
                    System.out.println();
                    break;
                case 5:
                    int result3 = myCollection.maxValue();
                    if (result3 != Integer.MIN_VALUE)
                        System.out.println("Значение максимального элемента: " + result3);
                    else
                        System.out.println("Элемент отсутствует!");
                    System.out.println();
                    break;
                case 6:
                    int result4 = myCollection.minValue();
                    if (result4 != Integer.MIN_VALUE)
                        System.out.println("Значение максимального элемента: " + result4);
                    else
                        System.out.println("Элемент отсутствует!");
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Среднее арифметическое элментов: " + myCollection.getAverage()+"\n");
                    System.out.println();
                    break;
                case 8:
                    System.out.print("Список коллекции: ");
                    myCollection.printList();
                    System.out.println();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Введено неверное значение! Повторите попытку!");
                    break;
            }


        }while(choice!=0);


    }
}