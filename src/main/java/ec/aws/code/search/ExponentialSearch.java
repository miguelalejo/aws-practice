package ec.aws.code.search;

public class ExponentialSearch {
	
	public int search(int[]numbers,int x) {
		if(numbers[0]==x) {
			return 0;
		}
		int index = 1;
		int n = numbers.length;
		while(index<n&&numbers[index]<x) {
			index = index * 2;
		}
		int l = index/2;
		int r = numbers.length - 1;
		if(index<r) {
			r = index;
		}		
		while(l<=r) {
			int mid = l+(r-l)/2;
			if(numbers[mid]==x) {
				return mid;
			}
			if(numbers[mid]<x) {
				l = mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
	}
	
	public int exponentialSearch(int[] numbers,int x) {
		if(numbers[0]==x) {
			return 0;
		}
		int index = 1;
		int n = numbers.length -1;
		while(index<n&&numbers[index]<x) {
			index = index * 2;			
		} 
		int l = index/2;
		int r = n - 1;
		if(index < r) {
			r = index;
		}
		return binarySearch(numbers,l,r,x);
		
	}
	
	public int binarySearch(int[]numbers, int l, int r,int x) {
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
