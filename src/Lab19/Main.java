package Lab19;

import java.io.*;
import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int x;
    public static void main(String[] args) throws Exception {

        do {
            System.out.println("[1] - Запись в файл");
            System.out.println("[2] - Чтение из файла");
            System.out.println("[3] - Заменить информацию в файле");
            System.out.println("[4] - Добавить информацию в файл");
            System.out.println("[0] - Выход");
            System.out.print("Выберите команду: ");
            x = scanner.nextInt();
            switch (x) {
                case 1:
                    Zadacha();
                    break;
                case 2:
                    Zadacha2();
                    break;
                case 3:
                    Zadacha();
                    break;
                case 4:
                    Zadacha4();
                case 0:
                    break;
                default:
                    System.out.println("Введена неверная команда! Повторите попытку!");
            }
        }while (x!=0);





    }

    public static void Zadacha() throws Exception{
        try  {
            Scanner scanner = new Scanner(System.in);
            FileWriter file=new FileWriter("pr19.txt",false);
            file.write(scanner.nextLine());
            if(x==3)
                file.flush();
            file.close();
            System.out.println();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void Zadacha2() throws Exception{
        try {
            FileReader file = new FileReader("pr19.txt");
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
            file.close();
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void Zadacha4() throws Exception
    {
        try{
            PrintWriter file = new PrintWriter(new BufferedWriter(new FileWriter("pr19.txt", true)));
            Scanner sc = new Scanner(System.in);
            file.println(sc.nextLine());
            file.close();
            System.out.println();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}