package theater;

import java.util.ArrayList;
import java.util.List;

public class TicketOffice {

    private long amount;
    private List<Ticket> tickets = new ArrayList<>();


    public TicketOffice(long amount, List<Ticket> tickets) {
        this.amount = amount;
        this.tickets = tickets;
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount){
        this.amount -= amount;
    }

    public void plusAmount(Long amount){
        this.amount += amount;
    }

}
