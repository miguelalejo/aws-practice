package ec.aws.code.practice;

//you can also use imports, for example:

//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution2 {
	public int solution(int[] A) {		
		for (int i = 1; i <= 1000000; i++) {
			boolean existNumber = false;
			for (int k = 0; k < A.length; k++) {				
				if (A[k] <= 0) {
					continue;
				}				
				if (A[k] == i) {					
					existNumber = true;
					break;
				}
			}
			if (!existNumber) {
				return i;
			}

		}
		return 1;
	}

}
