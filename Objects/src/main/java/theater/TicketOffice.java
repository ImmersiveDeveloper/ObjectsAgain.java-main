package theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    private Long amount;  // 매표소는 티켓 판매 금액을 보유한다.
    private List<Ticket> tickets = new ArrayList<>(); // 첫번째 위치에 저장된 theater.Ticket 반환하는 getTicket메서드 사용

    public TicketOffice(Long amount, Ticket tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTicketTo(Audience audience){
        plusAmount(audience.buy(getTicket()));
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
