package study;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import string.StringCalculator;

public class StringCalcTest {

	@BeforeEach
	public void setUp() {
		String polynomial = "2 / 2 * 4 - 100 + 207";
		System.setIn(new ByteArrayInputStream(polynomial.getBytes()));
	}

	@Test
	@DisplayName("문자열 계산기")
	public void stringCalcTest() {
		String output = inputString();
		String[] values = output.split(" ");
		StringCalculator stringCalculator = new StringCalculator(values);
		int result = stringCalculator.calculate();

		assertThat(result).isEqualTo(111);
	}

	private String inputString() {
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}
