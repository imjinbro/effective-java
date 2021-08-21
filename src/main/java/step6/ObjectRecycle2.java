package step6;

import java.util.regex.Pattern;

public class ObjectRecycle2 {

	private static final Pattern XXX_PATTERN = Pattern.compile(".\\[1-9+\\]");

	public static void main(String[] args) {
		/*
			비용이 많이 들고, 상태가 없는 객체 운영 가능하다면 싱글톤/static을 고려하자 - 캐시
			1번째는 Pattern 객체를 매칭할 때 마다 생성한다
			2번째는 Pattern을 미리 생성해두고 재활용

			-> 불필요한 객체는 생성하지말자
			-> 다만 Pattern 객체 내부를 들여다봐도 값비싼지 구분이 어렵다.... 복잡한 정규표현식 -> StopWatch 측정
		 */

		boolean result = "a[123][123".matches(".\\[1-9+\\]");

		result = XXX_PATTERN.matcher("a[123][123").matches();
	}
}
