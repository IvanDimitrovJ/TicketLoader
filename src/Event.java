public abstract  class Event {
    protected String place;
    protected String date;
    protected String startHour;
    protected int numberOfTickets;
    protected double priceOfTicket;

    Event(String place, String date, String hour, int tickets, double price) {
        this.place = place;
        this.date = date;
        this.startHour = hour;
        this.numberOfTickets = tickets;
        this.priceOfTicket = price;
    }

    public abstract boolean sellTicket(int num) throws  NoMoreTicketsException;
}
