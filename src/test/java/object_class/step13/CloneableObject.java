package object_class.step13;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import lombok.ToString;
import org.junit.jupiter.api.Test;

class CloneableObject {

	@Test
	void gzmblpvhj() throws Exception {
		GameCharacter character1 = new GameCharacter("test", 10);
		// protected 메소드로 해당 메소드를 오버라이드하여 public화 해줄 수 있음
		GameCharacter character2 = character1.clone();

		// 깊은 복사로 값만 복사 - 다른 객체
		assertNotEquals(character1, character2);

		int initYPosition = character1.getCurrentYPosition();
		int distance = 10;
		int finalYPosition = initYPosition + distance;

		character1.goUp(distance);

		// clone의 위험성 : 참조객체의 경우 얕은복사를 함 - clone 메소드 오버라이드 부분에서 참조객체는 새롭게 생성하여 참조하도록 수정 필요
		assertEquals(finalYPosition, character1.getCurrentYPosition());
		assertEquals(finalYPosition, character2.getCurrentYPosition());

		// 이렇게까지 할거면 유틸을 하나 만드는게..
	}

	@ToString
	class GameCharacter implements Cloneable {

		private String name;
		private Integer age;
		private Position position;

		public GameCharacter(String name, Integer age) {
			this.name = name;
			this.age = age;
			this.position = new Position();
		}

		public void goUp(int distance) {
			this.position.goUp(distance);
		}

		public int getCurrentYPosition() {
			return position.y;
		}

		@Override
		public GameCharacter clone() throws CloneNotSupportedException {
			GameCharacter cloneCharacter = (GameCharacter) super.clone();
			//cloneCharacter.position = position.clone(); // 해당 주석을 제거하면 새로운 Position 객체를 참조함
			return cloneCharacter;
		}
	}

	class Position implements Cloneable {

		private int x;
		private int y;

		public void goUp(int distance) {
			if (distance > 0) {
				this.y += distance;
			}
		}

		@Override
		public Position clone() throws CloneNotSupportedException {
			return (Position) super.clone();
		}
	}
}