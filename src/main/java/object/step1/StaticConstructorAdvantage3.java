package com.effective.step1;

public class StaticConstructorAdvantage3 {

	/*
		매개변수에 따라 여러 타입 인스턴스를 리턴할 수 있음
		- 이름을 가질 수 있는 것과 마찬가지의 장점
	 */
	static class SalesMan {

		public CarSalesMan get(Long a) {
			return new CarSalesMan();
		}

		public JuiceSalesMan get(String a, String b, Integer c) {
			return new JuiceSalesMan();
		}
	}

	static class CarSalesMan extends SalesMan {

	}

	static class JuiceSalesMan extends SalesMan {

	}
}
