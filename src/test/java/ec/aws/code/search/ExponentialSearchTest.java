package ec.aws.code.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExponentialSearchTest {
	ExponentialSearch exponentialSearch = new ExponentialSearch();
	
	@Test
	public void test1() {
		int[] numbers = new int[] {1,3,4,6,8,11};
		int result = exponentialSearch.search(numbers, 6);
		assertEquals(3,result);
	}
	
	@Test
	public void test2() {
		int[] numbers = new int[] {1,3,4,6,8,11};
		int result = exponentialSearch.search(numbers, 8);
		assertEquals(4,result);
	}
	
	@Test
	public void test3() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.search(numbers, 207);
		assertEquals(8,result);
	}
	
	@Test
	public void test4() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.search(numbers, 3);
		assertEquals(1,result);
	}
	
	@Test
	public void test5() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.search(numbers, 111);
		assertEquals(-1,result);
	}
	
	@Test
	public void test6() {
		int[] numbers = new int[] {1,3,4,6,8,11};
		int result = exponentialSearch.exponentialSearch(numbers, 6);
		assertEquals(3,result);
	}
	
	@Test
	public void test7() {
		int[] numbers = new int[] {1,3,4,6,8,11};
		int result = exponentialSearch.exponentialSearch(numbers, 8);
		assertEquals(4,result);
	}
	
	@Test
	public void test8() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.exponentialSearch(numbers, 207);
		assertEquals(8,result);
	}
	
	@Test
	public void test9() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.exponentialSearch(numbers, 3);
		assertEquals(1,result);
	}
	
	@Test
	public void test10() {
		int[] numbers = new int[] {1,3,4,6,8,11,15,150,207,1050};
		int result = exponentialSearch.exponentialSearch(numbers, 111);
		assertEquals(-1,result);
	}

}
