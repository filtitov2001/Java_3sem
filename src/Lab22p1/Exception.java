package Lab22p1;

public class Exception extends Throwable {
    private String exception;
    public Exception(String exception) {
        this.exception = exception;
    }
    public String getMessage() {
        return exception;
    }
}