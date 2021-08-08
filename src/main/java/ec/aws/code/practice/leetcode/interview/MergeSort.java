package ec.aws.code.practice.leetcode.interview;

import java.util.LinkedList;

/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.*/
public class MergeSort {
	public void merge(int[] nums1, int m, int[] nums2, int n) {		
		int position = 0;
		int temp[]=nums1;
		int index1[] = new int[m];
		int index2[] = new int[n];
		boolean hasChange1 = false;
		boolean hasChange2 = false;
		for(int i=0,k=0,l=0;i<m+n;i++) {
			int val1 = nums1[k];
			int val2 = nums2[l];
			if(val2<val1) {
				if(l>n) {
					continue;
				}
				hasChange2 = true;
				index2[l] = position;
				l++;
			}
			if(val1<val2) {
				if(k>m) {
					continue;
				}
				hasChange1 = true;
				index1[k] = position;
				k++;
			}			
			position++;			
		}
		if(!hasChange1&!hasChange2) {
			for(int i=n;i<m+n;i++) {
				temp[i]=nums2[i-n];
			}
		}
		if(hasChange2&!hasChange1) {
			for(int i=0;i<n;i++) {
				temp[i]=nums2[index2[i]];
			}
			for(int i=m;i<m+n;i++) {
				temp[i]=nums1[i-m];
			}
		}if(hasChange2&hasChange1) {
			for(int i=0;i<n;i++) {
				temp[i]=nums2[index2[i]];
			}
			for(int i=m;i<m+n;i++) {
				temp[i]=nums1[index1[i]];
			}
		}
		
	}
	
	public int[] merge2(int[] nums1, int m, int[] nums2, int n) {
		LinkedList<Integer> listNumbers = new LinkedList<Integer>();
		int k =0;
		for(int i=0;i<m;i++) {
			int val1 = nums1[i];
			for(int j=k;j<n;j++) {
				int val2 = nums2[j];
				if(val2<val1) {
					listNumbers.add(val2);
					k++;
				}
			}
			listNumbers.add(val1);
		}
		if(k<n) {
			for(int i=k;i<n;i++) {
				listNumbers.add(nums2[i]);
			}
		}
		int []result = listNumbers.stream().mapToInt(i->i).toArray();
		return result;
	}
	
	public int[] merge3(int[] nums1, int m, int[] nums2, int n) {
		int []temp = new int[m+n];
		int k =0;
		int c=0;
		for(int i=0;i<m;i++) {
			int val1 = nums1[i];
			for(int j=k;j<n;j++) {
				int val2 = nums2[j];
				if(val2<val1) {
					temp[c]=val2;
					c++;
					k++;
				}
			}
			temp[c]=val1;
			c++;
		}
		if(k<n) {
			for(int i=k;i<n;i++) {
				temp[c]=nums2[i];
				c++;
			}
		}
		return temp;
	}
}