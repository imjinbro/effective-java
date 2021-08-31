package object_build_and_destroy.step1;

class StaticConstructorAdvantage1 {

	static class Beverage {
		private boolean iced;

		/*
			메소드명으로 역할을 명확하게 구분하는 것이 가능하다
		 */
		static Beverage makeIceBeverage() {
			Beverage beverage = new Beverage();
			beverage.iced = true;
			return beverage;
		}

		static Beverage makeHotBeverage() {
			Beverage beverage = new Beverage();
			beverage.iced = false;
			return beverage;
		}
	}
}
