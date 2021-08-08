package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NonegativeIntergersTest {
	NonegativeIntergers solution = new NonegativeIntergers();

	@Test
	public void test1() {
		// solution [1, 2, 3], the function should return 4.
		int A = 3;
		int result = solution.solution(A);
		assertEquals(2, result);

	}

	@Test
	public void test2() {
		// solution [1, 2, 3], the function should return 4.
		int A = 0;
		int result = solution.solution(A);
		assertEquals(1, result);

	}
	
	@Test
	public void test3() {
		// solution [1, 2, 3], the function should return 4.
		int A = 1;
		int result = solution.solution(A);
		assertEquals(2, result);

	}
	
	@Test
	public void test4() {
		// solution [1, 2, 3], the function should return 4.
		int A = 4;
		int result = solution.solution(A);
		assertEquals(2, result);

	}
	

	@Test
	public void test5() {
		// solution [1, 2, 3], the function should return 4.
		int A = 7;
		int result = solution.solution(A);
		assertEquals(3, result);

	}
	
	@Test
	public void test6() {
		// solution [1, 2, 3], the function should return 4.
		int A = 9;
		int result = solution.solution(A);
		assertEquals(1, result);	
	}
	
	@Test
	public void test7() {
		// solution [1, 2, 3], the function should return 4.
		int A = 10;
		int result = solution.solution(A);
		assertEquals(1, result);

	}
	
	@Test
	public void test9() {
		// solution [1, 2, 3], the function should return 4.
		int A = 1000;
		int result = solution.solution(A);
		assertEquals(105, result);

	}
	
	

}
