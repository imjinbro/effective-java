package object_build_and_destroy.step2;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class BuilderPatternAdvantage1 {

	/*
		여러 케이스에 대한 생성자를 만들지 않아도 됨
		- 이런 생성자를 점층적 생성자 패턴이라고 한다(그렇다함..)
	 */
	@Test
	void test() {
		Menu menu = new Menu.Builder()
			.nutrient("ㅎㅇ")
			.price(300)
			.build();
	}

	static class Menu {
		private String name;
		private String nutrient;
		private Integer price;
		private LocalDateTime restockedAt;
		private String createdBy;
		private String brand;

		private Menu(Builder builder) {
			this.name = builder.name;
			this.nutrient = builder.nutrient;
			this.price = builder.price;
			this.restockedAt = builder.restockedAt;
			this.createdBy = builder.createdBy;
			this.brand = builder.brand;
		}

		// 아래와 같이 생성자를 만드는 것을 점층적 생성자 패턴이라고 한다
		Menu(String name) {
			this(name, "", 0);
		}

		Menu(String name, String nutrient) {
			this(name, nutrient, 0);
		}

		Menu(String name, String nutrient, Integer price) {
			this.name = name;
			this.nutrient = nutrient;
			this.price = price;
		}

		// 롬복을 통해 쉽게 만들어낼 수 있다.
		static class Builder {
			// 필수값만 초기화
			private final String name = "";
			private String nutrient = "";
			private Integer price = 0;
			private LocalDateTime restockedAt = null;
			private String createdBy = "";
			private String brand = "";

			Menu build() {
				return new Menu(this);
			}

			Builder nutrient(String val) {
				this.nutrient = val;
				return this;
			}

			Builder price(Integer val) {
				this.price = val;
				return this;
			}
		}
	}
}