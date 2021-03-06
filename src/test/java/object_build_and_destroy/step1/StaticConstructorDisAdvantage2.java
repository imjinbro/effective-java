package object_build_and_destroy.step1;

class StaticConstructorDisAdvantage2 {

	/*
		정적 메소드에 대한 숙지가 필요하다
		- 크게 문제될건 없다고 봄, 다만 팩토리 메소드가 우후죽순 생겨있으면 그때부턴 문제가 되겠지
	 */
	static class SalesMan {

		CarSalesMan get(Long a) {
			return new CarSalesMan();
		}

		JuiceSalesMan get(String a, String b, Integer c) {
			return new JuiceSalesMan();
		}
	}

	static class CarSalesMan extends SalesMan {

	}

	static class JuiceSalesMan extends SalesMan {

	}
}
