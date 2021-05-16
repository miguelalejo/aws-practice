package ec.aws.code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OddOccurrencesInArray2 {
	public int solution(int[] A) {
		Map<Integer, Integer> liskChekedNumbers = new HashMap<>();
		for (int i = 0; i < A.length; i++) {
			int val = A[i];
			if (liskChekedNumbers.containsKey(val)) {
				int count = liskChekedNumbers.get(val);
				count++;
				liskChekedNumbers.put(val, count);
			} else {
				liskChekedNumbers.put(val, 1);
			}
		}
		for (Entry<Integer, Integer> val : liskChekedNumbers.entrySet()) {
			if (val.getValue() % 2 != 0) {
				return val.getKey();
			}
		}
		return -1;
	}

}
