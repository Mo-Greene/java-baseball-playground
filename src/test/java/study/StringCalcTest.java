package study;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringCalcTest {

	@BeforeEach
	public void setUp() {
		String polynomial = "2 / 2 * 100 / 50";
		System.setIn(new ByteArrayInputStream(polynomial.getBytes()));
	}

	@Test
	@DisplayName("문자열 계산기")
	public void stringCalcTest() {
		Scanner sc = new Scanner(System.in);
		String out = sc.nextLine();
		String[] values = out.split(" ");
	}
}
