package Lab3;


public class Book {
    private String autor;
    private String name;
    private int year;

    Book(String name, String autor, int year){
        this.autor=autor;
        this.name=name;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAutor() {
        return autor;
    }
}
