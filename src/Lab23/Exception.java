package Lab23;

public class Exception extends Throwable {
    private String message;
    public Exception(int ind){
        message = "Неправильный индекс";
    }

    public String getMessage() {
        return message;
    }
}
