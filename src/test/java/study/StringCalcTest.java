package study;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

	@Test
	@DisplayName("문자열 계산기")
	public void stringCalcTest() {
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		String[] values = value.split(" ");
		System.out.println("values = " + Arrays.toString(values));
	}
}
