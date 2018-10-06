import java.io.IOException;

public class EventProcessing {

    public static Concert[] arrayOfConcerts = null;
    public static VolleyballMatch[] arrayOfVolleyball = null;
    private final static int SIZE_OF_OBJECT_BUFFER = 100;

    public static void main(String[] args) {
        System.out.println("Only for testing:");
        try {
            processTickets();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        Concert c = arrayOfConcerts[0];
        try {
            c.sellTicket(500);
            c.sellTicket(20000);
        } catch (NoMoreTicketsException e) {

            System.out.println(e.getMessage());
        }

    }

    /**
     * This static method will be invoked every day to fill the static arrays of
     * objects of type Concert and VolleyBallMatch with data from file. The last
     * imported information from previous day will be deleted from the buffers.
     * The buffers will be created with default size of 100 elements.
     *
     * @throws IOException
     *             - if IO problems occur.
     */
    public static void processTickets() throws IOException {
        System.out.println("Processing...");
        arrayOfConcerts = new Concert[SIZE_OF_OBJECT_BUFFER];
        arrayOfVolleyball = new VolleyballMatch[SIZE_OF_OBJECT_BUFFER];
        TicketLoader t = new TicketLoader();
        Event[] arrayOfEvents = (Event[]) t.importDataFromFile();
        int i = 0;
        int j = 0;
        for (Event e : arrayOfEvents) {
            if (e instanceof Concert) {
                arrayOfConcerts[i++] = (Concert) e;
            } else if (e instanceof VolleyballMatch) {
                arrayOfVolleyball[j++] = (VolleyballMatch) e;
            }
        }
        System.out.println("Process of importing finished.");
        System.out.println("Num loaded concerts: " + i);
        System.out.println("Num loaded volleyballs: " + j);
    }

}