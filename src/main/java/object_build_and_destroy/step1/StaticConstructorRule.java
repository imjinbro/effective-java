package object_build_and_destroy.step1;

public class StaticConstructorRule {
	/*
		룰은 아니고 어느정도의 컨센서스
	 */

	// 매개변수 1개
	public static Object from(String oneParam) {
		return new Object();
	}

	// 매개변수 2개 이상
	public static Object of(String multiParam1, Integer multiParam2, Long multiParam3, String multiParam4) {
		return new Object();
	}

	// 매번 새로운 인스턴스 반환 보장
	public static Object create() {
		return new Object();
	}

	// 매번 새로운 인스턴스 반환 보장
	public static Object newInstance() {
		return new Object();
	}
}

class Car {
	// 해당 타입의 인스턴스를 반환
	static Car getInstance() {
		return null;
	}
}