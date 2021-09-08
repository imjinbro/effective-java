package object_class.step14;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.common.collect.Lists;
import java.util.Comparator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.junit.jupiter.api.Test;

public class OrderComparableObject {

	@Test
	void asdqoqo() {
		Student s1 = new Student("s1", 100);
		Student s2 = new Student("s2", 90);

		assertEquals(1, s1.compareTo(s2));

		// java8 - Comparator로 구현
		System.out.println(
			Lists.newArrayList(s1, s2)
				.stream()
				.sorted(Comparator.comparingInt(Student::getHeight)) // .reversed()로 역순도 가능, .thenComparing() 으로 N차 순서비교가능
				.map(Student::getName)
				.collect(joining(", "))
		);

		Comparator<Student> studentComparator = Comparator.comparingInt(Student::getHeight);
		assertEquals(1, studentComparator.compare(s1, s2));
	}

	@Getter
	@AllArgsConstructor
	class Student implements Comparable<Student> {

		private String name;
		private int height;

		@Override
		public int compareTo(Student compareStudent) {
			// 키로만 ^_^ 정렬 - 규약(this가 compareObj보다 크면 양의정수, 같으면 0, 작으면 음의정수)
			// 직접 비교보다는 각 박싱 클래스에 있는 static compare 메소드를 사용하여 비교(직접 부등식을 만들어서 작성할 경우 뭐 실수가 있을 수 있으니깐..) - 그럼 연쇄는? java8부터 Comparator가 추가됨(chain 가능)
			return Integer.compare(this.height, compareStudent.height);
		}
	}
}
