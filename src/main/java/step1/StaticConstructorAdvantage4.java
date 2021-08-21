package step1;

public class StaticConstructorAdvantage4 {

	/*
		하위 타입 반환 가능
		- 굳이?
	 */
	static class SalesMan {

		public CarSalesMan from(Long a) {
			return new CarSalesMan();
		}

	}

	static class CarSalesMan extends SalesMan {

	}
}
