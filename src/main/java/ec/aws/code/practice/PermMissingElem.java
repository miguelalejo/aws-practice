package ec.aws.code.practice;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class PermMissingElem {
	public int solution(int[] A) {
		SortedSet sortedSet = new TreeSet();
		for (int i = 0; i < A.length; i++) {
			sortedSet.add(A[i]);
		}
		Iterator iterator = sortedSet.iterator();
		int k = 1;
		boolean hasMissing=false;
		while (iterator.hasNext()) {
			int element = (int) iterator.next();
			if (k != element) {
				break;
			}
			k++;
		}
		return k;

	}

}
