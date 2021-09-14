package class_and_inteface.step16;

public class DataAccessModifier {


	/*
		열어줄 필요없다면 private, package-private(default, protected)로 변경하기
		-> 대신 수정 가능성이 있는 오픈 API를 만들어주면 됨 : 제어는 Point 객체가 할 수 있도록 권한을 가지고 다른 역할의 객체는 수정할 수 있는 가능성을 가지도록.. 범위를 좁혀놓는거지
	 */
	class Point {
		public int x;
		public int y;
	}

}
