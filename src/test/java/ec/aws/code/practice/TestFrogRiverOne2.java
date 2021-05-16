package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFrogRiverOne2 {
	FrogRiverOne2 frogRiverOne = new FrogRiverOne2();

	@Test
	public void test1() {
		int A[] = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int result = frogRiverOne.solution(5, A);
		assertEquals(6, result);
	}

	@Test
	public void test2() {
		int A[] = { 1, 3, 1, 4, 2, 3, 2, 4 };
		int result = frogRiverOne.solution(5, A);
		assertEquals(-1, result);
	}

	@Test
	public void test3() {
		int A[] = { 2, 3, 1, 4, 2, 3, 2, 4 };
		int result = frogRiverOne.solution(2, A);
		assertEquals(2, result);
	}

	@Test
	public void test4() {
		int A[] = { 8, 7, 8, 6, 7, 8, 9, 4 };
		int result = frogRiverOne.solution(2, A);
		assertEquals(-1, result);
	}

	@Test
	public void test6() {
		int A[] = { 1, 1, 2, 2, 1, 1, 1, 4 };
		int result = frogRiverOne.solution(-1, A);
		assertEquals(-1, result);
	}

	@Test
	public void test7() {
		int A[] = { 1, 1, 2, 5, 3, 2, 1, 1, 1, 4, 1, 1, 2, };
		int result = frogRiverOne.solution(8, A);
		assertEquals(-1, result);
	}

	@Test
	public void test5() {
		int A[] = { 1, 2, 3, 6, 7, 8, 9, 3 };
		int result = frogRiverOne.solution(7, A);
		assertEquals(-1, result);
	}
}
