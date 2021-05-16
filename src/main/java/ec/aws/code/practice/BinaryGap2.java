package ec.aws.code.practice;

public class BinaryGap2 {
	public int solution(int N) {
		String cadbinary = "";
		if (N == 0) {
			return 0;
		}
		while (N > 0) {
			int val = N % 2;
			N = N / 2;
			cadbinary = val + cadbinary;
		}
		char preVal = cadbinary.charAt(0);
		char val = cadbinary.charAt(0);
		int gapMax = 0;
		boolean hasEnd = false;
		for (int i = 1; i < cadbinary.length(); i++) {
			val = cadbinary.charAt(i);
			if (preVal == '1' && val == '0') {				
				int gap = 0;
				while (val == '0') {					
					gap++;
					i++;
					if (i >= cadbinary.length()) {
						hasEnd = true;
						break;
					}
					val = cadbinary.charAt(i);
				}
				if(hasEnd) {
					break;
				}
				preVal = val;
				if (gap > gapMax) {
					gapMax = gap;
				}
			}
		}
		return gapMax;

	}

}
