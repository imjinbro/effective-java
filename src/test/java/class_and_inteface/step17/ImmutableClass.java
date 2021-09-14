package class_and_inteface.step17;

import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.apache.commons.lang3.StringUtils;

public class ImmutableClass {

	/*
		정리해보자면 불필요한 공개 API(객체, 메소드 등등등)을 만들지 말자
		공개를 하기 시작하면 닫기 힘들거나 못할 수 있다는 점을 생각하고 클래스 디자인 할 것
	 */
	class GameCharacter {

		/*
			생성자에서 호출 뒤 변경 불가하도록 final 지정
		 */
		private final String nickName;
		private final GameJob job;

		public GameCharacter(String nickName, String jobName) {
			Preconditions.checkArgument(StringUtils.isNotEmpty(nickName), "nickName not be null");
			Preconditions.checkNotNull(jobName, "job not be null");

			this.nickName = nickName;
			this.job = GameJob.findByName(jobName).orElseThrow(RuntimeException::new);
		}

		/*
			public api를 통해서 닉 변경 시 새로운 객체가 만들어지도록 함
			- 닉변 시 캐릭터 초기화.....ㄷㄷ;;
			- 객체가 지속적으로 생성되고 참조되는 곳이 존재한다면 큰일(누수) -> 불변 중 자주 쓰이는건 미리 생성하여 캐싱 해두고 리턴만 해줄 수 있음
			 -> 그래도 불변성이 유지가 되면 어디에 공유가 되더라도 불변이 보장되기 때문에 안전하다는 장점이 있음
		*/
		public GameCharacter updateNickName(String nickName) {
			return new GameCharacter(nickName, job.name());
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) {
				return true;
			}
			if (o == null || getClass() != o.getClass()) {
				return false;
			}
			GameCharacter that = (GameCharacter) o;
			return nickName.equals(that.nickName);
		}

		@Override
		public int hashCode() {
			return Objects.hash(nickName);
		}

		@Override
		public String toString() {
			return "GameCharacter{" +
				"nickName='" + nickName + '\'' +
				", job=" + job.name() +
				'}';
		}
	}

	enum GameJob {
		WIZARD,
		WARRIOR;

		public static Optional<GameJob> findByName(String name) {
			Preconditions.checkArgument(StringUtils.isNotEmpty(name), "job name param is invalid");
			return Arrays.stream(GameJob.values())
				.filter(job -> job.name().equals(name))
				.findFirst();
		}
	}
}