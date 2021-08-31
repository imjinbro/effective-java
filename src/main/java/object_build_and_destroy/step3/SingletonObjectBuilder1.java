package object_build_and_destroy.step3;

/*
	싱글톤으로 유지하기 위해서는 철저하게 생성을 막을 수 있어야함
	- 싱글톤 ``stateless`` 객체여야한다, 혹은 멀티쓰레드 환경에서 상태값 제어를 완벽하게 할 수 있어야하지만 굳이 그래야한다면 싱글톤을 사용할 이유가 있나?
 */
public class SingletonObjectBuilder1 {

	static class Obj {
		private static final Obj SINGLETON_OBJ = new Obj();

		// private int state; (X - 상태값을 가질 경우 멀티쓰레드 환경에서 싱글톤 운영이 어려워짐, 예측 불가능해지며 장애 상황 시 대응이 어려움)

		private Obj() {
			throw new RuntimeException("Reflect API를 활용한 객체 생성 막는 방법");
		}

		public static Obj getInstance() {
			return SINGLETON_OBJ;
		}
	}
}