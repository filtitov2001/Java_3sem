package Lab23;

public class Exception2 extends Throwable {
    private String message;

    public Exception2(String directory) {
        message = "Файл \"" + directory + "\" не найден";
    }

    public String getMessage() {
        return message;
    }
}