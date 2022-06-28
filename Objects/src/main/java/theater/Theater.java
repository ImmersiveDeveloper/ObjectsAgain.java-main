package theater;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {

        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience){ // 간단히 sellTo 메서드를 호출하는 메서드로 바뀜, ticketOffice에 접근 x
        /**
         * 객체를 인터페이스와 구현으로 분리하고,
         * 인터페이스만을 공개하는 것
         * 객체 사이의 결합도를 낮추고 변경하기 쉬운 코드를 작성하기 위해 따라야 하는 가장 기본적인 설계 원칙
         * */

        ticketSeller.sellTo(audience);
    }
}
