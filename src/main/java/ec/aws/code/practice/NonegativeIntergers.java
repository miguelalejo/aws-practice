package ec.aws.code.practice;

import java.math.BigDecimal;

public class NonegativeIntergers {
	public int solution(int N) {
		// write your code in Java SE 8
		//Power of 11
		//Change by big decimal for huge numbers
		BigDecimal base = new BigDecimal(11);
		BigDecimal potentiation = base.pow(N);		
		String cad = String.valueOf(potentiation);
		int counter = 0;
		for (int i = 0; i < cad.length(); i++) {
			if ('1' == cad.charAt(i)) {
				counter++;
			}
		}
		return counter;
	}

}
