package Lab2;

public class DogNursery {
    private Dog[] dogs =new Dog[2];
    DogNursery(){
        dogs[0]= new Dog(4,"Мойша","Moпс");
        dogs[1] = new Dog(7,"Зена","Хаски");
        Output();


    }
    private void Output(){
        for(int i =0;i<dogs.length;i++){
            System.out.println(dogs[i].toString());
        }
    }
}