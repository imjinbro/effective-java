package class_and_inteface.step15.access.modifier;

public class ProtectedAccessModifier {

	/*
		default 처럼 패키지 프라이빗하지만 protected 접근제어자를 가진 클래스를 상속한다면 접근 가능
	 */
	protected void hello() {
		System.out.println("hello");
	}
}
