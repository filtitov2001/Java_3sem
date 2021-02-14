package Lab13_14_22p2;

public class Student implements Data
{
    int id;
    String name;
    int GPA;
    String sum;
    Student(int id, String name, int GPA){
        this.id=id;
        this.GPA = GPA;
        this.name = name;
        sum = Integer.toString(Math.round(GPA));
    }

    public String getSum() {
        return sum;
    }


    @Override
    public String toString() {
        return "\t\tID = " + id +":\n"+
                "\t\tИмя = " + name  +
                "\n\t\tЗНО = "+sum+"\n\n";
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public int getGPA() {
        return GPA;
    }
}
