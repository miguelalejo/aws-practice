package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class CyclicRotationTest {
	CyclicRotation cyclicRotation = new CyclicRotation();

	@Test
	public void deberiaRotarAk3() {
		int[] A = new int[] { 3, 8, 9, 7, 6 };
		int[] result = cyclicRotation.solution(A, 3);
		assertArrayEquals(new int[] { 9, 7, 6, 3, 8 }, result);
	}
	
	@Test
	public void deberiaRotarAk1() {
		int[] A = new int[] {0, 0, 0};
		int[] result = cyclicRotation.solution(A, 1);
		assertArrayEquals(new int[] { 0, 0, 0 }, result);
	}
	
	@Test
	public void deberiaRotarAk4() {
		int[] A = new int[] {1, 2, 3, 4};
		int[] result = cyclicRotation.solution(A, 4);
		assertArrayEquals(new int[] { 1, 2, 3, 4 }, result);
	}
	
	@Test
	public void deberiaRotarAk6() {
		int[] A = new int[] {1, 2, 3, 4};
		int[] result = cyclicRotation.solution(A, 6);
		assertArrayEquals(new int[] { 3, 4, 1, 2 }, result);
	}
	
	@Test
	public void deberiaRotarAkL1() {
		int[] A = new int[] {1, 2, 3, 4, 5, 6, 7};
		int[] result = cyclicRotation.solution(A, 1);
		assertArrayEquals(new int[] { 7, 1, 2, 3, 4, 5, 6 }, result);
	}
}
