package class_and_inteface.step20;

/*
	implements는 해당 기능을 구현하겠다는 것
	- 상속과 같이 상/하 관계가 아닌 단지 그 기능을 구현하겠다는 것
	- 그래서 여러 기능(interface)을 구현할 수 있음
 */
public class InterfaceImpl {

	class CustomThread extends MyThread implements Runnable, Cloneable {

		@Override
		public void run() {

		}

		@Override
		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}

	/*
		상위 클래스를 추상 클래스로 만들어도 되고 아니어도 되고.. 인스턴스 생성 제한에 대해서 생각해보고 그때마다 다르게 설정하면 됨
	 */
	abstract class MyThread {

	}


	interface Testable {

		/*
			해당 기능을 구현하는 클래스들이 기본적으로 동작해야할 부분들이 있으면 아래와 같이 default 메소드를 생성해둘 수 있음
		 */
		default void test() {
			System.out.println("ㅎㅇ");
		}
	}
}
