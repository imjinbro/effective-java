package class_and_inteface.step15.access.test;

import com.google.common.collect.Lists;
import java.util.List;
import lombok.ToString;
import org.junit.jupiter.api.Test;

class MutableList {

	public static final List<Student> STUDENTS = Lists.newArrayList(
		Student.of("test", 10),
		Student.of("test2", 20)
	);

	@Test
	void asdasdas() {
		/*
			리스트를 구성하고 있는 요소는 final이 아니다
			-> 그래서 함부로 공개해서는 안된다
			-> 리스트 내에 있는 요소를 참조할 수 있게 되는 순간...... 으악
		 */
		Student s1 = STUDENTS.get(0);
		s1.setName("jinbro");

		System.out.println(s1);
	}

	@ToString
	static class Student {

		private String name;
		private Integer age; // primitive type 선언 시 default 0살이 되므로 Integer

		Student(String name, Integer age) {
			this.name = name;
			this.age = age;
		}

		static Student of(String name, Integer age) {
			return new Student(name, age);
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}
