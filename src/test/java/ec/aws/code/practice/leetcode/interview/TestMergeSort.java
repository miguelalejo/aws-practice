package ec.aws.code.practice.leetcode.interview;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestMergeSort {
	MergeSort mergeSort = new MergeSort();

	@Test
	public void test1() {
		int [] nums1 = new int[] {1,2,3,0,0,0};
		int m = 3;
		int []nums2 =new int[]  {2,5,6};
		int n = 3;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1,2,2,3,5,6}, result);
	}
	
	@Test
	public void test2() {
		int [] nums1 = new int[] {2,2,5,0,0,0};
		int m = 3;
		int []nums2 =new int[]  {1,2,3};
		int n = 3;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1,2,2,2,3,5}, result);
	}
	
	@Test
	public void test3() {
		int [] nums1 = new int[] {2};
		int m = 1;
		int []nums2 =new int[]  {};
		int n = 0;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{2}, result);
	}
	
	@Test
	public void test4() {
		int [] nums1 = new int[] {0};
		int m = 0;
		int []nums2 =new int[]  {5};
		int n = 1;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{5}, result);
	}
	
	@Test
	public void test5() {
		int [] nums1 = new int[] {2,2,2,0};
		int m = 3;
		int []nums2 =new int[]  {1};
		int n = 1;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1,2,2,2}, result);
	}
	
	@Test
	public void test6() {
		int [] nums1 = new int[] {2,3,0,0};
		int m = 2;
		int []nums2 =new int[]  {1,4};
		int n = 2;
		int[] result = mergeSort.merge2(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1,2,3,4}, result);
	}
	
	@Test
	public void test7() {
		int [] nums1 = new int[] {2,3,0,0};
		int m = 2;
		int []nums2 =new int[]  {1,4};
		int n = 2;
		int[] result = mergeSort.merge3(nums1, m, nums2, n);
		assertArrayEquals(new int[]{1,2,3,4}, result);
	}
}
