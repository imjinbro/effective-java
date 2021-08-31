package object_build_and_destroy.step1;

class StaticConstructorDisAdvantage1 {

}

class A {

	private A() {
	}
}

/*
    정적 팩토리 메소드만 지원하면 하위 클래스를 만들 수 없음
 */
/*class B extends A {

}*/
