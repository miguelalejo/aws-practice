package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BinaryGapTest2 {
	BinaryGap2 binaryGap = new BinaryGap2();

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
	public void deberiaDevolverCinco() {
		int N = 1041;
		int result = binaryGap.solution(N);
		assertEquals(5, result);
	}
	
	@Test
	public void deberiaDevolver72Cero() {
		int N = 72;
		int result = binaryGap.solution(N);
		assertEquals(2, result);
	}
	
	@Test
	public void deberiaDevolver529Gap4() {
		int N = 529;
		int result = binaryGap.solution(N);
		assertEquals(4, result);
	}
	
	
	@Test
	public void deberiaDevolver4080Gap0() {
		int N = 4080;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}
	
	@Test
	public void deberiaDevolver345099Gap6() {
		int N = 345099;
		int result = binaryGap.solution(N);
		assertEquals(6, result);
	}
	
	


 
	@Test
	public void deberiaDevolverCero32() {
		int N = 32;
		int result = binaryGap.solution(N);
		assertEquals(0, result);
	}

}
