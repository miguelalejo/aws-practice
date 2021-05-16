package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.List;

public class NumbersTape {
	public int solution(int[] A) {
		// write your code in Java SE 8
		List<Integer> sumsByLeft = new ArrayList<>();
		int sum = A[0];
		sumsByLeft.add(sum);
		for (int i = 1; i < A.length - 1; i++) {
			sum += A[i];
			sumsByLeft.add(sum);
		}
		List<Integer> sumsByRight = new ArrayList<>();
		int sumOp = A[A.length - 1];
		sumsByRight.add(sumOp);
		for (int i = A.length - 2; i > 0; i--) {
			sumOp += A[i];
			sumsByRight.add(sumOp);
		}
		int min = 100000;
		for (int i = 0, k = sumsByRight.size() - 1; i < sumsByLeft.size(); i++, k--) {
			int diff = Math.abs(sumsByLeft.get(i) - sumsByRight.get(k));
			if (diff < min) {
				min = diff;
			}
		}
		return min;

	}
}
