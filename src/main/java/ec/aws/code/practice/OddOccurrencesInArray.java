package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {
	public int solution(int[] A) {
		List<Integer> liskChekedNumbers = new ArrayList<>();
		
		for (int i = 0; i < A.length; i++) {
			int val = A[i];
			if (!liskChekedNumbers.contains(val)) {
				boolean exist = false;
				int timesApear = 1;
				for (int j = i + 1; j < A.length; j++) {
					if (val == A[j]) {
						exist = true;
						timesApear++;
					}
				}
				if (exist && timesApear % 2 != 0) {
					return val;
				}
				if (exist) {
					liskChekedNumbers.add(val);
				} else {
					return val;
				}
			}

		}
		return -1;
	}

}
