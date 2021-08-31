package object_build_and_destroy.step9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class AsisResourceCloseCode {

	/*
		todo : gradle java 실행되게끔 build.gradle 수정, classPath 지정 / resource 디렉토리 지정 방법으로 파일 읽기도 해보기
	 */
	public static void main(String[] args) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("...."));

		} catch (Exception e) {

		} finally {
			/*
				성공이든 실패든 상관없이 실행됨 - 자원을 닫아주는 역할
				- 닫다가 예외발생하는 경우에 대한 try / catch;;
			 */
			if (Objects.nonNull(bufferedReader)) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
