package step3;

/*
	enum을 통해서 더 간결하고 확실하게 싱글톤 유지 가능함
	- 다만 상속을 할 순 없음 : enum이 인터페이스를 구현할 수 있는 것은 가능함
 */
public class SingletonObjectBuilder2 {

	public static void main(String[] args) {
		Obj obj = Obj.getInstance();
		obj.greet();
	}

	enum Obj implements Speakable {
		INSTANCE;

		public static Obj getInstance() {
			return INSTANCE;
		}

		public void greet() {
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