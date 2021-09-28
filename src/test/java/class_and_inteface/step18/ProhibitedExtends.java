package class_and_inteface.step18;

public class ProhibitedExtends {


	/*
		가끔 라이브러리를 사용하다가 공개되어있지않은 메소드인데, 필요한 기능이라 public으로 열기위해서 해당 클래스를 상속하는 경우가 있음
		-> 위와 같이 상속을 할 때 상위에서는 의도치 않은 버그가 발생할 수 있음
		-> 공개화 하지 않은 이유가 있다 : 상속이 꼭 필요한 상황인지 신중하게 판단해야한다
		-> 리플렉션 api 사용도 신중해야함 : 상위 구현이 달라질 경우 정상동작 하던 것이 에러 발생할 수 있고, 컴파일 실패까지 날 수 있음(대규모 버전 변경 후 시그니처 변경 및 deprecated 메소드 정리 한다면...)

		-> 역할에 맡기는 방향으로 구현이 되는게 좋을 듯 하다
			-> 컴포지션이라고 하네
			-> 아래처럼 담당 포지션에게 맡겨버리는 방식
			-> 추가적인 기능은 위임을 해주는 클래스에서 구현하고, 핵심 기능은 위임 받는 클래스에서 담당하게 하면 버그는 나지 않되 필요한 기능을 완성 시킬 수 있을 것
				-> 데코레이터 패턴이라고 하네

		필요한 기능이 있다고 상속을 받지말고 위임하기
		- 상속은 관계가 맞을 때만 상속하자
	 */

	class MovieTheater {
		private TicketMachine ticketMachine;

		public void sellTicket(String movieName) {
			ticketMachine.sell(movieName);
		}
	}

	class TicketMachine {

		public void sell(String movieName) {
			System.out.println(movieName);
		}
	}
}