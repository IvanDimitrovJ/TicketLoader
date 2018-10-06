public class VolleyballMatch extends Event {
    protected String firstTeam;
    protected String secondTeam;

    VolleyballMatch(String fTeam, String sTeam, String place, String date, String hour, int tickets, double price) {
        super(place, date, hour, tickets, price);
        this.firstTeam = fTeam;
        this.secondTeam = sTeam;
    }

    public  boolean sellTicket(int num) throws  NoMoreTicketsException{
        if (num > this.numberOfTickets || this.numberOfTickets == 0) {
            throw new NoMoreTicketsException(this.firstTeam + " : " + this.secondTeam);
        } else {
            this.numberOfTickets = this.numberOfTickets - num;
            System.out.println(num + " tickets saled!");
            System.out.println("All free tickets are: " + this.numberOfTickets);
            return true;
        }
    }

}
