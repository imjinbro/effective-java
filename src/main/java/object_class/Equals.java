package object_class;

import java.util.Objects;

public class Equals {

	/*
		대부분 이미 구현되어있는 equals를 사용하면 된다.
		추가적으로 일부의 값이 같거나를 검사하기위해서 equals를 재정의하는 것보단 별도의 메소드를 구현하는 것이 좋다
		-> 당장은 하나의 value만으로 구분할 수 있겠지만, 이후에는 해당 프로그래밍이 발목 잡을 수 있음
	 */
	public static void main(String[] args) {
		// 완전 동일 해야함
		WrongEquals a1 = new WrongEquals("hi");
		String hi = "hi";

		a1.equals(hi); // true
		//hi.equals(a1) -> false
	}

	static class WrongEquals {
		String value;

		public WrongEquals(String value) {
			this.value = value;
		}

		@Override
		public boolean equals(Object o) {
			if (o instanceof WrongEquals) {
				return this.value.equalsIgnoreCase((((WrongEquals) o).value));
			}

			if (o instanceof String) {
				return this.value.equals(((String) o));
			}

			return false;

			/*if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			WrongEquals wrapper = (WrongEquals) o;
			return Objects.equals(value, wrapper.value);*/

		}

		@Override
		public int hashCode() {
			return Objects.hash(value);
		}
	}


}
