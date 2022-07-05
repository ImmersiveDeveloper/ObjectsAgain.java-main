package movieTicketing;

public class Reservation {
    private Customer customer; // 코드 다시 살펴보기
    private Screening screening;
    private Money fee;
    private int audienceCount

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
