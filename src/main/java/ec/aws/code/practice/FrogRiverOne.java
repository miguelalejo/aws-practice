package ec.aws.code.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrogRiverOne {
	public int solution(int X, int[] A) {
		// write your code in Java SE 8

		Map<Integer, Boolean> mapLeafs = new HashMap<>();
		for (int i = 1; i <= X; i++) {
			mapLeafs.put(i, false);
		}
		for (int i = 0; i < A.length; i++) {
			if (mapLeafs.containsKey(A[i])) {
				mapLeafs.put(A[i], true);
			}
			int index = 0;
			for (Entry<Integer, Boolean> entry : mapLeafs.entrySet()) {
				if (entry.getKey() <= X && entry.getValue()) {
					index++;
				}
			}
			if (index == X) {
				return i;
			}

		}
		return -1;
	}
}
