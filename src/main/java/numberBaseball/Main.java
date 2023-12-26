package numberBaseball;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int number = scanNumber();
		NumberBaseball numberBaseball = new NumberBaseball();
		numberBaseball.validateNumber(number);
	}

	//input (test x)
	public static int scanNumber() {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if (number > 999) {
			System.out.println("3자리 이하로 적어주세요.");
			return scanNumber();
		}
		return number;
	}
}
