package ec.aws.code.practice;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {
	public int solution(int N) {
		int preVal = N % 2;
		List<Boolean> listChange = new ArrayList<>();
		int gapMax = 0;
		N = N / 2;
		while (N > 0) {
			int val = N % 2;
			N = N / 2;
			if (preVal != val) {
				listChange.add(true);
				int gap = 0;
				while (preVal != val) {
					val = N % 2;
					N = N / 2;
					gap++;
				}
				listChange.add(true);
				preVal = val;
				if (gap > gapMax) {
					gapMax = gap;
				}
			}
		}
		
		if (listChange.size() >= 2) {
			return gapMax;
		}
		return 0;
	}

}
