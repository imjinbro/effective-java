package object.step6;

public class ObjectRecycle3 {


	public static void main(String[] args) {
		/*
			불필요한 박싱객체 사용하지말자
		 */

		Integer num1 = 1;
		int num2 = 2;

		System.out.println(num1 + num2); // primitive로 선언되어도 되는데 굳이..
	}

	/*
		아래의 경우는 외부로부터 받은 요청을 매핑하는 클래스이므로 Object로 선언할 필요가 있다
		- 요청자가 요청 중 일부를 누락해서 보낼 수 있기 때문 : primitive 타입 선언할 경우 기본값이 채워져 예기치않은 장애 발생할 수 있으므로
	 */
	class Request {
		Integer id;
		Boolean soldOut;
	}

	/*
		외부와 통신하는 객체는 위와 같이 선언하고, 내부적으로 사용되는 객체는 primitive 타입으로 매핑해서 사용할 수 있음
		- 특히 boolean 타입의 경우 : Boolean과 boolean의 차이는 자동으로 메소드 생성할 때 이름부터 다름 : getXXX or isXXX
	 */
}