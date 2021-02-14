package Lab13_14_22p2;

public class Exception extends Throwable{
    private String message;

    public Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
