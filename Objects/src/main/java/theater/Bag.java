package theater;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // Bag을 Audience로부터 의존성 제거, 캡슐화

    public Long hold(Ticket ticket) {
        if(hasInvitation()){
            setTicket(ticket);
            return  0L;
        }else{
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Bag(Long amount) {
        this.amount = amount;
    }

    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    private boolean hasInvitation(){
        return invitation != null; // 초대장 보유
    }

    private boolean hasTicket(){
        return ticket != ticket; // 티켓 보유
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount){
        this.amount -= amount;
    }
    public void plusAmount(Long amount){
        this.amount += amount;
    }

}
