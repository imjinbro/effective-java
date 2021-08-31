package object_build_and_destroy.step3;

import org.junit.jupiter.api.Test;

/*
	enum을 통해서 더 간결하고 확실하게 싱글톤 유지 가능함
	- 다만 상속을 할 순 없음 : enum이 인터페이스를 구현할 수 있는 것은 가능함
 */
class SingletonObjectBuilder2 {

	@Test
	void test() {
		Obj obj = Obj.getInstance();
		obj.greet();
	}

	enum Obj implements Speakable {
		INSTANCE;

		static Obj getInstance() {
			return INSTANCE;
		}

		void greet() {
			System.out.println("Hello!");
		}

		@Override
		public void sayHi() {
			greet();
		}
	}

	interface Speakable {
		void sayHi();
	}
}