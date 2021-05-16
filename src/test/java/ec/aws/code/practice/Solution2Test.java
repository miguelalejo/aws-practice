package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * AWordsTest
 */
public class Solution2Test {
	Solution2 solution = new Solution2();

	
	@Test
	public void deberiaDevolverCuatro() {
		// solution [1, 2, 3], the function should return 4.
		int A[] = { 1, 2, 3 };
		int result = solution.solution(A);
		assertEquals(4, result);

	}

	@Test
	public void deberiaDevolverUno() {
		// Given A = [−1, −3], the function should return 1.
		int A[] = { -1, -3 };
		int result = solution.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void deberiaDevolverCinco() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A[] = { 1, 3, 6, 4, 1, 2 };
		int result = solution.solution(A);
		assertEquals(5, result);
	}

	@Test
	public void deberiaDevolver6() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A[] = { 1, 3, -1000000, 4, 1, 2 };
		int result = solution.solution(A);
		assertEquals(5, result);
	}

	@Test
	public void deberiaDevolver9() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A[] = { 1, 3, 8, -1000000, 4, 1, 2, 3, 5, 3, 7, 7, 1000000, 5, 6 };
		int result = solution.solution(A);
		assertEquals(9, result);
	}

}