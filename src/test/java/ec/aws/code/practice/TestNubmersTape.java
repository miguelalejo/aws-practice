package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestNubmersTape {
	NumbersTape numbersTape = new NumbersTape();

	@Test
	public void test1() {
		int A[] = { 3, 3 };
		int result = numbersTape.solution(A);
		assertEquals(0, result);
	}

	@Test
	public void test2() {
		int A[] = { 3, 2 };
		int result = numbersTape.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void test3() {
		int A[] = { 3, 2, 1 };
		int result = numbersTape.solution(A);
		assertEquals(0, result);
	}

	@Test
	public void test4() {
		int A[] = { 5, 0, 1 };
		int result = numbersTape.solution(A);
		assertEquals(4, result);
	}

	@Test
	public void test5() {
		int A[] = { 3, 1, 2, 4, 3 };
		int result = numbersTape.solution(A);
		assertEquals(1, result);
	}

	@Test
	public void test6() {
		int A[] = { 5, 20, 1, 2, 40, 13, 18 };
		int result = numbersTape.solution(A);
		assertEquals(37, result);
	}
	
	@Test
	public void test8() {
		int A[] = { -1000, 1000};
		int result = numbersTape.solution(A);
		assertEquals(2000, result);
	}

}
