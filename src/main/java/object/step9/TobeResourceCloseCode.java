package object.step9;

import java.io.BufferedReader;
import java.io.FileReader;

public class TobeResourceCloseCode {

	public static void main(String[] args) {
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
