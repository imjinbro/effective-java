package step1;

public class StaticConstructorAdvantage1 {

	static class Beverage {
		private boolean iced;

		/*
			메소드명으로 역할을 명확하게 구분하는 것이 가능하다
		 */
		public static Beverage makeIceBeverage() {
			Beverage beverage = new Beverage();
			beverage.iced = true;
			return beverage;
		}

		public static Beverage makeHotBeverage() {
			Beverage beverage = new Beverage();
			beverage.iced = false;
			return beverage;
		}
	}
}
