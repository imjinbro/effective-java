package object_build_and_destroy.step4;

/*
	static class를 운영한다면, 불필요한 객체 생성을 막기 위해 private 기본 생성자를 만들어줌
	- private 기본생성자를 명시해주지 않으면 컴파일러가 public 기본생성자를 만들어버리므로 명시해주는 것이 좋음
		-> 그럴 경우는 없겠지만 빌더 클래스 내부에서 관리하고 변경할 수 있는 값들을 멀티쓰레드 환경에서 변경해버려서 예기치 않은 장애가 날 수 있음 ㅎ
 */
public class StaticClass {

	public static void main(String[] args) {
		System.out.println(AnyHelper.trim("  a  "));
		AnyHelper anyHelper = new AnyHelper();
	}

	static class AnyHelper {

		private AnyHelper() {
			throw new RuntimeException("객체 생성하지마!");
		}

		static String trim(String arg) {
			return arg.trim();
		}
	}
}