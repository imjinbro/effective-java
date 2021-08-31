package object_build_and_destroy.step1;

public class StaticConstructorAdvantage2 {

	static class Beverage {
		private static final Beverage ICE_BEVERAGE = new Beverage(true);
		private static final Beverage HOT_BEVERAGE = new Beverage(false);

		private boolean iced;

		private Beverage(boolean iced) {
			this.iced = iced;
		}

		/*
			정적 인스턴스를 리턴 가능하다
			- 매번 생성하지않아도 됨 : 캐싱
		 */
		public static Beverage makeIceBeverage() {
			return ICE_BEVERAGE;
		}

		public static Beverage makeHotBeverage() {
			return HOT_BEVERAGE;
		}
	}
}
