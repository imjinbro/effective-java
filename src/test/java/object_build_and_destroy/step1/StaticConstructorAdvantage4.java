package object_build_and_destroy.step1;

class StaticConstructorAdvantage4 {

	/*
		하위 타입 반환 가능
		- 굳이?
	 */
	static class SalesMan {

		CarSalesMan from(Long a) {
			return new CarSalesMan();
		}

	}

	static class CarSalesMan extends SalesMan {

	}
}
