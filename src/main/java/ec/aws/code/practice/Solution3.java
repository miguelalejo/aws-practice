package ec.aws.code.practice;

import java.util.Arrays;
import java.util.Comparator;

//you can also use imports, for example:

//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution3 {
	public int solution(int[] A) {
		int[] sortedArray = Arrays.stream(A).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue)
				.toArray();
		for (int i = 1; i <= 1000000; i++) {
			boolean existNumber = false;
			int index = 0;
			for (int k = index; k < sortedArray.length; k++) {
				if (sortedArray[k] <= 0) {
					continue;
				}
				if (sortedArray[k] == i) {		
					existNumber = true;
					continue;
				}else {
					index = k;					
				}
			}
			if (!existNumber) {
				return i;
			}

		}
		return 1;
	}

}
