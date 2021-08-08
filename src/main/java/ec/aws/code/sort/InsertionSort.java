package ec.aws.code.sort;

public class InsertionSort {
	public int[]sort(int[]numbers){		
		for(int i=1;i<numbers.length;i++) {
			int val = numbers[i];
			for(int j=i-1,k=i;j>=0;j--) {
				if(val<numbers[j]) {
					int valTemp = numbers[j];
					numbers[j] = val;
					numbers[k] = valTemp;
					k = j;
				}
			}						
		}
		return numbers;
		
	}

}
