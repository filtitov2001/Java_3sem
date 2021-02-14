package Lab13_14_22p2;

import java.util.Comparator;

public class Search implements Comparator<Student> {

    int Lin_search(Data[] data,int key) throws java.lang.Exception
    {
        long time;
        long startTime = System.nanoTime();
        int c = 0,pos = -1;
        for (int i = 0; i < data.length; i++) {
            c++;
            if(data[i].getID()==key ){
                long endTime = System.nanoTime();
                time = endTime-startTime;
                System.out.println("Поиск студента с ID " + key+"  Количество операций сравнения: " + c +"  Элемент находится на позицици: " + pos);
                System.out.println("Время работы: " + time);
                return i;
            }
        }
        throw new java.lang.Exception("Студент не найден");
    }

    int Lin_search_name(Data[] data,String name) throws java.lang.Exception
    {
        long time;
        long startTime = System.nanoTime();
        int c = 0,pos = -1;
        for (int i = 0; i < data.length; i++) {
            c++;
            if(data[i].getName().equals(name)){
                long endTime = System.nanoTime();
                time = endTime-startTime;
                System.out.println("Поиск студента с именем  " + name+"  Количество операций сравнения: " + c +"  Элемент находится на позицици: " + pos);
                System.out.println("Время работы: " + time);
                return i;
            }
        }
        throw new java.lang.Exception("Студент не найден");
    }



    int Binary_search(Data[] data, int key, int low, int high) throws java.lang.Exception {
        long time;
        int c=0;
        long startTime = System.nanoTime();
        int mid=(high-low)/2+low;
        c+=2;
        if((mid==low)||(mid==high)){
            if(data[mid].getGPA()==key){
                long timeEnd =  System.nanoTime();
                time = timeEnd - startTime;
                System.out.println("Поиск студента с ID " + key+"  Количество операций сравнения: " + c);
                System.out.println("Время работы: " + time);
                return mid;}
            else throw new java.lang.Exception("Студент не найден");
        }
        else{
            c++;
            if(key<=data[mid].getGPA()){
                c++;
            return Binary_search(data,key,mid,high);}
        else{
            c++;
            return Binary_search(data,key,low,mid);}}

    }


    public int compare(Student o1) {
        return o1.getID();
    }

    @Override
    public int compare(Student o1, Student o2) {
        return 0;
    }

}
