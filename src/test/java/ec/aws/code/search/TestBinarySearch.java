package ec.aws.code.search;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestBinarySearch {
	BinarySearch binarySearch = new BinarySearch();

	@Test
	public void test1() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int result = binarySearch.search(numbers, 4);
		assertEquals(3, result);
	}
	
	@Test
	public void test2() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.search(numbers, 4);
		assertEquals(3, result);
	}
	
	@Test
	public void test3() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.search(numbers, 7);
		assertEquals(6, result);
	}
	
	@Test
	public void test4() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.search(numbers, 2);
		assertEquals(1, result);
	}
	
	@Test
	public void test5() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.search(numbers, 11);
		assertEquals(-1, result);
	}
	
	@Test
	public void test6() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		int result = binarySearch.binarySearch(numbers, 0,numbers.length-1,4);
		assertEquals(3, result);
	}
	
	@Test
	public void test7() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.binarySearch(numbers, 0,numbers.length-1, 4);
		assertEquals(3, result);
	}
	
	@Test
	public void test8() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.binarySearch(numbers, 0,numbers.length-1, 7);
		assertEquals(6, result);
	}
	
	@Test
	public void test9() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.binarySearch(numbers, 0,numbers.length-1, 2);
		assertEquals(1, result);
	}
	
	@Test
	public void test10() {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int result = binarySearch.binarySearch(numbers, 0,numbers.length-1,11);
		assertEquals(-1, result);
	}

}
