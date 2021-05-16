package ec.aws.code.practice;
//you can also use imports, for example:

//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8		
		A = orderList(A);		
		int maxVal = A[A.length - 1];
		if (maxVal <= 0) {
			return 1;
		}
		int val = 0;
		int index = 0;
		for (int i = 1; i <= maxVal; i++) {			
			boolean existVal = false;			
			for (int k = index; k < A.length; k++) {
				val = A[k];
				if(val<=0) {
					continue;
				}
				if (i == val) {
					existVal = true;
					continue;
				} else {
					index = k;
					break;
				}
			}
			if(!existVal) {
				return i; 
			}
		}
		return val+1;

	}

	public int[] orderList(int[] A) {
		int maxSize = A.length;		 
		for (int i = 0; i < A.length; i++) {			
			for (int j = 0; j < maxSize-1; j++) {
				int tempA = A[j];				
				int tempB = A[j+1];
				if (tempA > tempB) {
					A[j] = tempB;
					A[j+1] = tempA;					
				}
			}
			maxSize--;
		}
		return A;
	}
}
