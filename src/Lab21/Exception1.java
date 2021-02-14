package Lab21;

public class Exception1 {
    void exceptionDemo(){
        double n = 2.0/0.0;
        System.out.println(n);
    }
}

// при типе данных double выводится Infinity
//java.lang.ArithmeticException: / by zero at Exception1.exceptionDemo(Exception1.java:12) выводится,
// если использовать целочисленный тип
