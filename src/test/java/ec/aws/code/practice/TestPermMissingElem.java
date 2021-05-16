package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPermMissingElem {
	PermMissingElem per = new PermMissingElem();

	@Test
	public void deberiaDevolver4() {

		int A[] = { 2, 3, 1, 5 };
		int result = per.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void deberiaDevolver9() {
		int A[] = { 2, 3, 1, 5, 7, 6, 8, 4, 11, 10 };
		int result = per.solution(A);
		assertEquals(9, result);
	}

	@Test
	public void deberiaDevolver1() {
		int A[] = { 2, 3, 15, 5, 7, 6, 8, 4, 9, 11, 10 };
		int result = per.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void deberiaDevolver12() {
		int A[] = { 1, 2, 3, 5, 7, 6, 8, 4, 9, 11, 10, 1000000 };
		int result = per.solution(A);
		assertEquals(12, result);
	}

	@Test
	public void deberiaDevolver1SinMasElekento() {
		int A[] = { 1 };
		int result = per.solution(A);
		assertEquals(2, result);
	}
	
	@Test
	public void deberiaDevolver1SinMasElekentoD() {
		int A[] = { 2 };
		int result = per.solution(A);
		assertEquals(1, result);
	}
}
