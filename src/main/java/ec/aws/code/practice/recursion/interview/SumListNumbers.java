package ec.aws.code.practice.recursion.interview;

public class SumListNumbers {
	public int sumNumbers(int[] array) {
		return sum(array, array.length-1);
	}

	public int sum(int[] array, int n) {
		if (n < 0) {
			return 0;
		}
		return sum(array, n - 1) + array[n];

	}

}
