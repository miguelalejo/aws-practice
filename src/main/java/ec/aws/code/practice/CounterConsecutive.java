package ec.aws.code.practice;

public class CounterConsecutive {
	public int[] solution(int N, int[] A) {
		// write your code in Java SE 8
		int[] B = new int[N];
		int maxValue = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == N + 1) {				
				for (int j = 0; j < B.length; j++) {
					B[j] = maxValue;
				}
			} else {
				int valTemp = B[A[i]-1] + 1;
				B[A[i]-1] = valTemp;
				
				if (valTemp > maxValue) {
					maxValue = valTemp;
				}
			}

		}
		return B;
	}

}
