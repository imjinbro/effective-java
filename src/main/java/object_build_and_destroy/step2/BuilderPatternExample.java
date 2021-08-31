package object_build_and_destroy.step2;

import java.util.EnumSet;

public class BuilderPatternExample {

	public static void main(String[] args) {
		Pizza pizza = new NyPizza.Builder().build();
	}

	enum Topping {
		HAM, SAUSAGE, CHEESE
	}

	abstract static class Pizza {

		private final EnumSet<Topping> toppings;

		private Pizza(Builder<?> builder) {
			this.toppings = builder.toppings;
		}

		public abstract static class Builder<T extends Builder<T>> {

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
