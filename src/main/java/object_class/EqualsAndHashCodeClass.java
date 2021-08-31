package object_class;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

public class EqualsAndHashCodeClass {

	/*
		equals를 재정의 하려면 hashcode도 재정의해야함
		-> 그냥 재정의 하는게 맞는지 한번 따져보라..
		-> equals로는 동일한데, hashcode(객체 주민번호 같은거지)로는 다르면 ㅎ..
		  -> Map, Set 정상동작 x
		-> 할거면 lombok 같이 손쉽게 재정의할 수 있는 방법이 있음
	 */
	public static void main(String[] args) {
		ValueWrapper wrapper = new ValueWrapper("test", 1);
		System.out.println(wrapper);
	}

	@EqualsAndHashCode(exclude = "number")
	@AllArgsConstructor
	static class ValueWrapper {

		String name;
		Integer number;
	}
}