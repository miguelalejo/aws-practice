package ec.aws.code.practice;

public class CyclicRotation {
	public int[] solution(int[] A, int K) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			int newIndex = (i + K) % A.length;
			B[newIndex] = A[i];
		}
		return B;
	}
}
