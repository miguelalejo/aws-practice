package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryGapTest {
	BinaryGap binaryGap = new BinaryGap();

	@Test
	public void deberiaDevolverCero() {
		int N = 0;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}
	
	@Test
	public void deberiaDevolverZero() {
		int N = 1;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}
	
	@Test
	public void deberiaDevolverUno() {
		int N = 2;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}
	
	@Test
	public void deberiaDevolverDos() {
		int N = 9;
		int result = binaryGap.solution(N);
		assertEquals(2, result);
	}
	
	@Test
	public void deberiaDevolverCero32() {
		int N = 32;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}

}
