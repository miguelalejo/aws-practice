package ec.aws.code.sort;

public class SelectionSort {

	public int[] sort(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int valmin = numbers[i];
			int index = i;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[j] < valmin) {
					valmin = numbers[j];
					index = j;
				}
			}
			int val = numbers[i];
			numbers[i] = valmin;
			numbers[index] = val;
		}
		return numbers;
	}

}
