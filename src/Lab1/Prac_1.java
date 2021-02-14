package Lab1;

public class Prac_1 {
    Prac_1(){
        System.out.println("Задание 1");
        int[] b = new int [10];
        for(int i=0;i<10;i++)
        {
            b[i]= (int) ((int) 2+Math.random()*10);

        }
        System.out.print("Элементы массива: ");
        for(int i=0;i<10;i++)
        {
            System.out.print(b[i]+ " ");

        }
        int s =0 ;
        System.out.print("Сумма элементов массива: ");
        for(int i=0;i<10;i++)
        {
            s=s+b[i];
        }
        System.out.println(s);
        int i = 0;
        s=0;
        while( i<10){
            s=s+b[i];
            i++;
        }
        System.out.println(s);
        i = 0;
        s=0;
        do{
            s=s+b[i];
            i++;

        }while(i<10);
        System.out.println(s);

    }

}