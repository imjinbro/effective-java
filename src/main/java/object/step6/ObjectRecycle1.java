package object.step6;

public class ObjectRecycle1 {

	public static void main(String[] args) {
		/*
			위와 아래의 결과는 다르다
			1번째(생성자를 통해 String 생성)는 동일한값을 가지고 있으나 객체를 새롭게 생성함
			2번째(리터럴)는 동일한 객체, 동일한값 -> 재활용

			-> 같은 값을 가진다면 불필요하게 생성자 호출하여 문자열 생성X

			-> 스코프가 한정되어있고(메소드) 작은 객체라면 크게 성능상 문제는 없겠지만 그런 습관은 들여야지
		 */
		String str1 = new String("str1");
		String str11 = new String("str1");

		String str2 = "str2";
		String str22 = "str2";

		Boolean falseObj = new Boolean("false");
		falseObj = Boolean.FALSE; // static으로 생성되어있는 객체 활용
	}
}