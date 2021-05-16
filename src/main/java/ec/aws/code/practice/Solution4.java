package ec.aws.code.practice;

//you can also use imports, for example:

//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution4 {
	public int solution(int[] A) {
		boolean hasPositives = false;
		boolean[] B = new boolean[1000000];
		for (int k = 0; k < A.length; k++) {
			if (A[k] <= 0) {
				continue;
			} else {
				hasPositives = true;
				B[A[k]-1] = true;
			}
		}
		int k = 1;
		for (boolean existe : B) {
			if (!existe) {
				return k;
			}
			k = k + 1;
		}
		if (hasPositives) {
			return 1;
		}
		return k;
	}

}
