package study;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

	@BeforeEach
	public void setUp() {
		String polynomial = "2 / 2 * 100 - 50 + 20";
		System.setIn(new ByteArrayInputStream(polynomial.getBytes()));
	}

	@Test
	@DisplayName("문자열 계산기")
	public void stringCalcTest() {
		String output = setString();
		String[] values = output.split(" ");
		int result = Integer.parseInt(values[0]);
		for (int i = 1; i <= values.length; i++) {

		}
	}

	private String setString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
