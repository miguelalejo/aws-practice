package ec.aws.code.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ec.aws.code.Fish;

public class FishTest {
	Fish fish = new Fish();
	@Test
	public void test1() {
		int A[] = { 2, 1, 5 };
		int B[] = { 0, 0, 0 };
		int result = fish.solution(A,B);
		assertEquals(3, result);
	}
	
	@Test
	public void test2() {
		int A[] = { 2, 1 };
		int B[] = { 1, 0 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test3() {
		int A[] = { 2 };
		int B[] = { 1 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test4() {
		int A[] = { 0 };
		int B[] = { 1 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test5() {
		int A[] = { 2, 2 };
		int B[] = { 1, 0 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test6() {
		int A[] = { 2, 1, 3 };
		int B[] = { 1, 0, 0 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test7() {
		int A[] = { 2, 1, 1 };
		int B[] = { 1, 0, 0 };
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test8() {
		int A[] = { 100, 1, 2, 3 };
		int B[] = { 1, 0, 0 , 0};
		int result = fish.solution(A,B);
		assertEquals(1, result);
	}
	
	@Test
	public void test9() {
		int A[] = { 2, 1, 7, 1000 };
		int B[] = { 0, 0, 0 , 1};
		int result = fish.solution(A,B);
		assertEquals(4, result);
	}
	
	
	@Test
	public void test10() {
		int A[] = { 4, 3, 2, 1, 5};
		int B[] = { 0, 1, 0, 0, 0};
		int result = fish.solution(A,B);
		assertEquals(2, result);
	}
	
	

}
