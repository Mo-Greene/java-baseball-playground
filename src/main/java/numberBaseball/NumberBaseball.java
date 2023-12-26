package numberBaseball;

import java.util.Random;

public class NumberBaseball {

	private int answer;

	public NumberBaseball() {
		Random random = new Random();
		this.answer = random.nextInt(900) + 100;
	}

	public void validateNumber(int inputNumber) {
		System.out.println("answer = " + answer);
		System.out.println("inputNumber = " + inputNumber);

		//비교 로직 후 반환

		//게임종료 시 재시작 여부확인
	}
}
