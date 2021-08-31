package object_class;

import lombok.ToString;


public class ToStringClass {

	/*
		클래스 toString은 재정의 해주는게 좋음
		-> 아니면 객체 출력 시 이상한 값이 나옴
		-> 단, 엔티티 재정의 시에는 연관관계는 제외 시킬 것 : 양방향에 재정의된 경우 서로 참조 참조 참조 참조 하다가 스택오버플로우 발생
	 */

	public static void main(String[] args) {


	}

	@ToString(exclude = {}) // 제외 지정 가능
	class ValueWrapper {

	}

}
