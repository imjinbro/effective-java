package object.step5;

import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/*
	유연한 구조
	- 여러 종류의 객체를 생성할 수 있고, 테스트에도 용이한 구조
	- Spring에서 빈을 생성할 때 많이 사용하는 방식
	- 자원을 사용하는 쪽에서 생성하면 고정적인 방식이 되며, 생성 방식에 변경이 생겼을 때에 대한 유지보수 포인트가 됨
 */
public class DependencyObject {

	public static void main(String[] args) {
		SpellChecker koreanChecker = new SpellChecker(KoreanDictionary.getInstance());
		SpellChecker englishChecker = new SpellChecker(KoreanDictionary.getInstance());
	}

	/*
		다양한 언어의 스펠체커를 만들 수 있게됨
	 */
	static class SpellChecker {

		private final Dictionary dictionary;

		public SpellChecker(Dictionary dictionary) {
			this.dictionary = Objects.requireNonNull(dictionary);
		}

		public void check(String word) {
			if (StringUtils.isEmpty(word)) {
				throw new IllegalArgumentException("ㅎㅇ");
			}

			dictionary.valid(word);
		}
	}

	interface Dictionary {

		boolean valid(String word);
	}

	/*
		언어에 맞게 구현을 달리 가져갈 수 있음
	 */
	static class KoreanDictionary implements Dictionary {

		private static final KoreanDictionary DICTIONARY = new KoreanDictionary();

		private KoreanDictionary() {
		}

		@Override
		public boolean valid(String word) {
			return false;
		}

		public static KoreanDictionary getInstance() {
			return DICTIONARY;
		}
	}

	static class EnglishDictionary implements Dictionary {

		private static final EnglishDictionary DICTIONARY = new EnglishDictionary();

		private EnglishDictionary() {
		}

		@Override
		public boolean valid(String word) {
			return false;
		}

		public static EnglishDictionary getInstance() {
			return DICTIONARY;
		}
	}
}