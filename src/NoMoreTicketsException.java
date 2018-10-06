public class NoMoreTicketsException extends Exception {
    private String nameOfEvent;

    public NoMoreTicketsException(String nameOfEvent) {
        super();
        this.nameOfEvent = nameOfEvent;
    }

    public String getMessage() {
        return "There is no more tickets for: " + nameOfEvent;
    }
}
