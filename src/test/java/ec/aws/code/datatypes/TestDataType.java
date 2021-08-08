package ec.aws.code.datatypes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestDataType {

	@Test
	public void validateArray() {
		int[] valor = new int[] { 2, 3 };
		for (int i = 0; i < valor.length; i++) {
			System.out.println(valor[i]);
		}
		int[][] matrix = new int[][] { { 2, 3 }, { 2, 4, 5 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int val = matrix[i][j];
				System.out.println(val);
			}
		}
	}

	@Test
	public void selectionSort() {
		int[] A = new int[] { 64, 25, 12, 22, 11 };
		int[] actual = selectionSort(A);
		assertArrayEquals(new int[] { 11, 12, 22, 25, 64 }, actual);
	}

	@Test
	public void radixSort() {
		int[] A = new int[] { 64, 25, 12, 22, 11 };
		int[] actual = radixSort(A);
		assertArrayEquals(new int[] { 11, 12, 22, 25, 64 }, actual);
	}

	private int[] radixSort(int[] A) {
		int maxDigit = 0;
		int digitPosition = 1;
		for (int i = 0; i < A.length; i++) {
			String cad = String.valueOf(A[i]);
			if (cad.length() > maxDigit) {
				maxDigit = cad.length();
			}
		}
		while (digitPosition < maxDigit) {
			for (int i = 0; i < A.length; i++) {
				String cad = String.valueOf(A[i]);				
				int number  = Integer.valueOf(cad);
				if(cad.length()<digitPosition) {
					number = Character.getNumericValue(cad.charAt(digitPosition));
				}	
				int val = number;
				int valMin= number;
				int index = 0;
				for (int j = i + 1; j < A.length; j++) {
					String cadComp = String.valueOf(A[j]);					
					int numberComp  = Integer.valueOf(cadComp);
					if(cadComp.length()<digitPosition) {
						numberComp = Character.getNumericValue(cadComp.charAt(digitPosition));
					}
					if(numberComp<valMin) {
						valMin = A[j];
						index = j;
					}					
				}
				A[i]=valMin;
				A[index] = val;
			}
			digitPosition++;
		}
		return A;
	}

	private int[] selectionSort(int[] A) {
		int[] B = A;
		// 64, 25, 12, 22, 11
		for (int i = 0; i < B.length; i++) {
			// B[0] -> 64
			int val = B[i];
			// val <- 64
			int minVal = B[i];
			// minVal <- 64
			int index = i;
			for (int j = i + 1; j < B.length; j++) {
				// B[1] -> 25
				// 25<64
				// B[2] -> 12
				// 12<25
				// B[2]-> 22
				// 22<12
				// B[3]->11
				// 11<12
				if (B[j] < minVal) {
					minVal = B[j];
					// minVal <- 25
					// minVal <- 12
					// minVal <- 11
					index = j;
					// index<-1
					// index<-2
					// index<-3
				}
			}
			B[i] = minVal;
			// B[0]<-11
			B[index] = val;
			// B[3]<-64
		}
		return B;
	}

}
