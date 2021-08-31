package object_build_and_destroy.step7;

import org.junit.jupiter.api.Test;

class ObjectMemoryManage {

	/*
		자바에서는 가비지컬렉터가 메모리 관리(참조X 객체 메모리 회수)를 해주지만 코드로 인해서 참조가 끊기진 않았으나 사용되지 않은 객체에 대해서는 관리X
		-> 스프링빈(전역)으로 생성되어있고, 내부 데이터가 쌓이지만, 실제로는 사용되지 않는 데이터가 쌓이면 -> OOM?
		-> 사용되지않을 때에는 null 명시를 해주자 정도
		-> 스코프를 작게 유지해주면 알아서 참조 X -> 메모리 회수 : 불필요하게 전역 설정하지말자
		-> https://d2.naver.com/helloworld/1230 (클래스로드)
		-> https://d2.naver.com/helloworld/329631
	 */
	@Test
	void dfjlmhpss() {
		aaa();
	}

	static void aaa() {
		// 아래 객체는 aaa() 메소드 내에서만 사용 -> 메소드 종료 -> 가비지 오브젝트로 판단(외부에서 참조X) -> 메모리 회수
		String a = "a";
	}
}
