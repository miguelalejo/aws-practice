package ec.aws.code.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
	SelectionSort selectionSort = new SelectionSort();
	@Test
	public void test1() {
		int []numbers=new int[]{2,1};
		int []result=selectionSort.sort(numbers);
		assertArrayEquals(new int[]{1,2}, result);
	}
	
	@Test
	public void test2() {
		int []numbers=new int[]{4,5,6,1,2,8,7,1};
		int []result=selectionSort.sort(numbers);
		assertArrayEquals(new int[]{1,1,2,4,5,6,7,8}, result);
	}
}