public class UnrecognisedRowException extends Exception {
    private String message;

    UnrecognisedRowException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
