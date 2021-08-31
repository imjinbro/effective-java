package object_build_and_destroy.step9;

import java.io.BufferedReader;
import java.io.FileReader;
import org.junit.jupiter.api.Test;

class TobeResourceCloseCode {

	@Test
	void test() {
		/*
		    AutoCloseable을 구현한 클래스
		    리소스 사용 후 자동 close
		 */
		try (FileReader fileReader = new FileReader("......");
			BufferedReader bufferedReader = new BufferedReader(fileReader)) {

		} catch (Exception e) {
		}
	}
}
