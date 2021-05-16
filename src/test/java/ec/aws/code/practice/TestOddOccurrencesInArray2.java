package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestOddOccurrencesInArray2 {
	OddOccurrencesInArray2 oddOccurrencesInArray = new OddOccurrencesInArray2();

	@Test
	public void deberiaDevolver7() {
		// A[0] = 9 A[1] = 3 A[2] = 9
		// A[3] = 3 A[4] = 9 A[5] = 7
		// A[6] = 9
		int A[] = { 9, 3, 9, 3, 9, 7, 9 };
		int result = oddOccurrencesInArray.solution(A);
		assertEquals(7, result);
	}

	@Test
	public void deberiaDevolver11() {
		// A[0] = 9 A[1] = 3 A[2] = 9
		// A[3] = 3 A[4] = 9 A[5] = 7
		// A[6] = 9
		int A[] = { 1, 3, 1, 3, 9, 1, 9, 7, 1, 5, 5, 7, 11 };
		int result = oddOccurrencesInArray.solution(A);
		assertEquals(11, result);
	}

	@Test
	public void deberiaDevolver12() {
		// A[0] = 9 A[1] = 3 A[2] = 9
		// A[3] = 3 A[4] = 9 A[5] = 7
		// A[6] = 9
		int A[] = { 1, 3, 1, 3, 9, 1, 9, 7, 1, 5, 5, 7, 12, 12, 12 };
		int result = oddOccurrencesInArray.solution(A);
		assertEquals(12, result);
	}
}
