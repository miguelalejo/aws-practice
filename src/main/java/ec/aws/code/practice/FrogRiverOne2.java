package ec.aws.code.practice;

import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class FrogRiverOne2 {
	public int solution(int X, int[] A) {
		// write your code in Java SE 8

		SortedMap<Integer, Integer> sortedSet = new TreeMap<>();

		for (int i = 0; i < A.length; i++) {
			if (!sortedSet.containsKey(A[i])) {
				sortedSet.put(A[i], i);
			}

		}
		int leaf = 0;
		int minLeafIndex = 0;
		for (Entry<Integer, Integer> entry : sortedSet.entrySet()) {
			int value = entry.getKey();
			if (value <= X) {
				leaf++;
			}
			if (value > X) {
				break;
			}
			if (entry.getValue() > minLeafIndex) {
				minLeafIndex = entry.getValue();
			}
		}
		if (leaf == X) {
			return minLeafIndex;
		}
		return -1;
	}
}
