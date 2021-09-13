package class_and_inteface.step15.access.test;

import org.junit.platform.commons.util.StringUtils;

public class User {
	/*
		public으로 두면 누구나 수정 가능하게 된다 -> 영향 범위 파악 불가, 사용하는 곳이 늘면 늘수록 코드 수정 시 변경포인트가 됨, 객체는 자기자신만 상태 변경을 할 수 있어야함
	 */
	private String name;
	private String id;

	/*
		자기 결정권을 가질 수 있게 해줘야함
	 */
	public void updateName(String name) {
		if (StringUtils.isBlank(name)) {
			// throw!
		}

		// 이름 관련 규칙을 한군데에서 관리 가능하다, 마음대로 상태를 변경 불가함(리플렉션 API 제외)
	}
}
