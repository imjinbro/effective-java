package object_class;

import lombok.EqualsAndHashCode;

class EqualsAndHashCodeClass {

	/*
		equals를 재정의 하려면 hashcode도 재정의해야함
		-> 그냥 재정의 하는게 맞는지 한번 따져보라..
		-> equals로는 동일한데, hashcode(객체 주민번호 같은거지)로는 다르면 ㅎ..
		  -> Map, Set 정상동작 x
		-> 할거면 lombok 같이 손쉽게 재정의할 수 있는 방법이 있음
	 */
	@EqualsAndHashCode(exclude = "number")
	static class ValueWrapper {

		String name;
		Integer number;
	}
}