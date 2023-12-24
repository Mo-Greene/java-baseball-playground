package string;

public class StringCalculator {
	private String[] values;

	public StringCalculator(String[] values) {
		this.values = values;
	}

	/**
	 * 문자열 계산
	 * @return int
	 */
	public int calculate() {
		int result = Integer.parseInt(values[0]);
		for (int i = 1; i < values.length; i += 2) {
			int nextNum = Integer.parseInt(values[i + 1]);
			result = switchCalculation(values[i], result, nextNum);
		}
		return result;
	}

	/**
	 * 계산식
	 * @param value 기호
	 * @param result 결과
	 * @param nextNum 뒤에 번호
	 * @return int
	 */
	private int switchCalculation(String value, int result, int nextNum) {
		switch (value) {
			case "+" : return add(result, nextNum);
			case "-" : return subtract(result, nextNum);
			case "*" : return multiply(result, nextNum);
			case "/" : return divide(result, nextNum);
			default: throw new RuntimeException("잘못된 기호를 적었습니다.");
		}
	}

	/**
	 * 덧셈
	 * @param num 기존 값
	 * @param plusNum 더할 값
	 * @return int
	 */
	private int add(int num, int plusNum) {
		return num + plusNum;
	}

	/**
	 * 뺄셈
	 * @param num 기존 값
	 * @param minusNum 뺄 값
	 * @return int
	 */
	private int subtract(int num, int minusNum) {
		return num - minusNum;
	}

	/**
	 * 곱셈
	 * @param num 기존 값
	 * @param multiplyNum 곱할 값
	 * @return int
	 */
	private int multiply(int num, int multiplyNum) {
		return num * multiplyNum;
	}

	/**
	 * 자바 나눗셈
	 * @param num 기존 값
	 * @param divideNum 나눌 값
	 * @return int
	 */
	private int divide(int num, int divideNum) {
		return num / divideNum;
	}
}
