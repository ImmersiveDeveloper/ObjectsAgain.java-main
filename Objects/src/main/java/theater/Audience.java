package theater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) { // 관객은 소지품 보유
        this.bag = bag;
    }

    /**
     * public theater.Bag getBag() {
     * return bag;  // getBag 호출로 bag 인스턴스에 직접 접근했던 의존성을 제거, 캡슐화 개선
     * }
     */

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
