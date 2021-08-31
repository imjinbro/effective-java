package object_build_and_destroy.step2;

import java.util.EnumSet;
import org.junit.jupiter.api.Test;

class BuilderPatternDisAdvantage {

	@Test
	void test() {
		Pizza pizza = new NyPizza.Builder().build();
	}

	/*
		아래와 같이 빌더 패턴을 사용하기 위한 세팅이 복잡, 길다
		- 다만 롬복을 사용하면 간단하게 이용할 수 있다 : 라이브러리를 쓰는 만큼 잘 알고 쓰긴 해야한다
	 */
	enum Topping {
		HAM, SAUSAGE, CHEESE
	}

	abstract static class Pizza {

		private final EnumSet<Topping> toppings;

		private Pizza(Builder<?> builder) {
			this.toppings = builder.toppings;
		}

		abstract static class Builder<T extends Builder<T>> {

			private EnumSet<Topping> toppings;

			abstract Pizza build();

			protected abstract T self();
		}
	}

	enum Size {
		LARGE, SMALL
	}

	static class NyPizza extends Pizza {

		private final Size size;

		private NyPizza(Builder builder) {
			super(builder);
			this.size = builder.size;
		}

		static class Builder extends Pizza.Builder {

			private Size size;

			@Override
			Pizza build() {
				return new NyPizza(this);
			}

			@Override
			protected Pizza.Builder self() {
				return this;
			}
		}
	}
}
