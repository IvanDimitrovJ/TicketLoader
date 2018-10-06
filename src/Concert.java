public class Concert extends Event {
    protected String starName;

    Concert(String starName, String place, String date, String hour, int tickets, double price) {
        super(place, date, hour, tickets, price);
        this.starName = starName;
    }

    public  boolean sellTicket(int num) throws  NoMoreTicketsException{
        if (num > this.numberOfTickets || this.numberOfTickets == 0) {
            throw new NoMoreTicketsException(this.starName + "'s concert.");
        } else {
            this.numberOfTickets = this.numberOfTickets - num;
            System.out.println(num + " tickets saled!");
            System.out.println("All free tickets are: " + this.numberOfTickets);
            return true;
        }
    }
}
