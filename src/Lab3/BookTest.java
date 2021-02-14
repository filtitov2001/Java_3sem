package Lab3;

public class BookTest {
    BookTest() {
        Book book1 = new Book("Преступление и наказние", "Достоевский Ф.М.", 1865);
        Book book2 = new Book("Капитанска дочка", "Пушкин А.С.", 1836);
        System.out.println("Произведение: "+ book1.getName()+" автора " + book1.getAutor()+ " "+ book1.getYear()+ " года");
        System.out.println("Произведение: "+ book2.getName()+" автора " + book2.getAutor()+ " "+ book2.getYear()+ " года");
    }
}
