package theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }
/**
 * 제거에 주목 !!
    public theater.TicketOffice getTicketOffice() { ticketOffice는 theater.TicketSeller 안에만 존재,
 TicketSeller는 ticketOffice와 연관된 역할을 스스로 수행할 수 밖에 없음.
 즉, Theater는 ticketOffice에 접근 불가, theater.TicketSeller 내부에 존재한다는 사실 알지 못함.
 오직 sellTo 메시지만 이해, 응답!!
       return ticketOffice;
  }
 """캡슐화""" - 개념적이나 물리적으로 객체 내부의 세부적 사항을 감추는 것, 변경하기 쉬운 객체를 만들기 위한 목적
 객체 내부로의 접근을 제한하여 객체간 결합도를 낮추고 결과적으로 쉽게 변경할 수 있는 설계가 가능해진다.
 */

    public void sellTo(Audience audience){
//        ticketOffice.plusAmount(audience.buy(ticketOffice.getTicket())); // theater.TicketSeller, theater.Audience 사이 결합도 낮추기 성공 !!
        ticketOffice.sellTicketTo(audience);
    }

    /**
     * 캡슐화 개선 -> theater.Audience, TicketSeller가 내부 구현을 외부에 노출하지 않고 자신의 문제를 스스로 책임지고 해결하게 됨 !!, 자율적인 존재
     */

    /**
     * 무엇이 개선됐는가? -> 필요한 기능 오류없이 수행, 변경 용이성, 코드를 읽는 사람과 의사소통 개선
     */

    /**
     * 어떻게 개선됐는가? -> TicketSeller가 티켓 판매를 위해 TicketOffice를 사용하는 모든 부분을 theater.TicketSeller 내부로 옮기고,
     * Audience가 티켓 구매 위해 Bag을 사용하는 부분을 theater.Audience 내부로 옮김
     * 즉, 객체가 자신의 문제를 스스로 해결하도록 코드를 변경
     */

    /**
     * 핵심
     * 캡슐화 - 객체 내부 상태 캡슐화를 통해 객체는 오직 메시지를 통해서만 상호작용하도록 만든 것
     * 자신의 데이터를 스스로 처리하도록 연관된 작업만 수행, 연관성 없는 작업은 위임하여 응집도 높임
     * 객체는 스스로 자신의 데이터를 책임져야 한다.
     * 자신이 소유하고 있지 않은 데이터를 이용하는 객체는 연관성 높은 작업 할당이 어렵다
     * 객체는 자신의 데이터를 스스로 처리하는 자율적인 존재여야 한다. 객체 응집도 높이는 첫 걸음
     */
}
