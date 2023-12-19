package study;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Set Collection에 대한 학습테스트")
public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@DisplayName("요구사항 1")
	@Test
	public void request1() {
		int setSize = numbers.size();
		assertThat(setSize).isEqualTo(3);
	}

	@DisplayName("요구사항 2")
	@ParameterizedTest
	@ValueSource(ints = {1, 2, 3})
	public void request2(int num) {
		assertThat(numbers.contains(num)).isTrue();
	}

	@DisplayName("요구사항 3")
	@ParameterizedTest
	@CsvSource(value = {"1:true", "2:true", "3:true", "4:false", "5:false"}, delimiter = ':')
	public void request3(int num, boolean expected) {
		assertEquals(expected, numbers.contains(num));
	}

	@ParameterizedTest
	@CsvSource(value = {"test:test", "tEst:test", "Java:java"}, delimiter = ':')
	void toLowerCase_ShouldGenerateTheExpectedLowercaseValue(String input, String expected) {
		String actualValue = input.toLowerCase();
		assertEquals(expected, actualValue);
	}
}
