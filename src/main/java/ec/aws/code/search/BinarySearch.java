package ec.aws.code.search;

public class BinarySearch {
	
	public int search(int[]numbers,int x) {
		int l = 0;
		int r = numbers.length-1;		
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(numbers[mid]==x) {
				return mid;
			}
			if(numbers[mid]<x) {
				l = mid+1;
			}
			else {
				r=mid-1;
			}
		}
		return -1;
	}
	
	public int binarySearch(int[] numbers,int l,int r, int x) {
		if(l<=r) {
			int mid = l+(r-l)/2;
			if(numbers[mid]==x) {
				return mid;
			}
			if(numbers[mid]<x) {
				return binarySearch(numbers,mid+1,r,x);
			}else {
				return binarySearch(numbers, l, mid-1, x);
			}
		}
		return -1;
	}

}
