package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestCounterConsecutive {
	CounterConsecutive counterConsecutive = new CounterConsecutive();

	@Test
	public void test1() {
		int[] A = new int[] { 3, 4, 4, 6, 1, 4, 4 };
		int[] result = counterConsecutive.solution(5, A);
		assertArrayEquals(new int[] { 3, 2, 2, 4, 2 }, result);
	}

	@Test
	public void test2() {
		int[] A = new int[] { 3, 2, 1 };
		int[] result = counterConsecutive.solution(2, A);
		assertArrayEquals(new int[] { 1, 1 }, result);
	}

}
