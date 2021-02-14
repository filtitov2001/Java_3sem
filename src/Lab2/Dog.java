package Lab2;

public class Dog {
    private String breed;
    private String name;
    private int age;

    Dog(int age,String name,String breed){
        this.age=age;
        this.name=name;
        this.breed=breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return (age*7);
    }
    public String toString(){
        return "Имя: "+ name + " Порода: " + breed + " Возраст: "+ age+ " Человеческий возраст " + getAge();
    }
}