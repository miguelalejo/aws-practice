package ec.aws.code.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestInsertionSort {
	InsertionSort insertionSort = new InsertionSort();
	
	@Test
	public void test1() {
		int[]numbers = new int[] {2,1};
		int[]result = insertionSort.sort(numbers);
		assertArrayEquals(new int[]{1,2}, result);
	}
	
	@Test
	public void test2() {
		int[]numbers = new int[] {2,1,3,5,4};
		int[]result = insertionSort.sort(numbers);
		assertArrayEquals(new int[]{1,2,3,4,5}, result);
	}
	
	@Test
	public void test3() {
		int[]numbers = new int[] {2,1,3,5,4,7,1,1,2,10,2,3};
		int[]result = insertionSort.sort(numbers);
		assertArrayEquals(new int[]{1,1,1,2,2,2,3,3,4,5,7,10}, result);
	}

}
