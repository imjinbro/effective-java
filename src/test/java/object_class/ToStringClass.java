package object_class;

import lombok.ToString;
import org.junit.jupiter.api.Test;


class ToStringClass {

	/*
		클래스 toString은 재정의 해주는게 좋음
		-> 아니면 객체 출력 시 이상한 값이 나옴
		-> 단, 엔티티 재정의 시에는 연관관계는 제외 시킬 것 : 양방향에 재정의된 경우 서로 참조 참조 참조 참조 하다가 스택오버플로우 발생
	 */
	@Test
	void test() {
		Person p1 = new Person("test", 10);
		System.out.println(p1);
	}

	@ToString(exclude = "age") // 제외 지정 가능
	static class Person {

		String name;
		Integer age;

		Person(String name, Integer age) {
			this.name = name;
			this.age = age;
		}
	}
}
