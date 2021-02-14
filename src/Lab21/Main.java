package Lab21;

public class Main {
    public static void main(String[] args) {
        Exception1 exception1=new Exception1();
        exception1.exceptionDemo();

        Exception2 exception2 = new Exception2();
        try {
            exception2.exceptionDemo();
        }
        catch (Exception e){
            System.out.println("Infinity");
        }
        finally {
            System.out.println("Конец");
        }
    }
}
// №3
//метод exceptionDemo() в блоке try поймал исключение ,java.lang.ArithmeticException: / by zero at Exception1.exceptionDemo(Exception1.java:12)
// затем блок catch,  обработал исключение и вывел сообщение  "Infinity"

// №4
// блок finally выполняется вне зависимости , сработало ли исключение,
// если программа сработала как надо, или обработала исключение, выведется сообщение из блока finally "Конец"