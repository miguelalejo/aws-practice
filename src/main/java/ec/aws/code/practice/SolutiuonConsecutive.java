package ec.aws.code.practice;

public class SolutiuonConsecutive {

	public void solution(int N) {
		// write your code in Java SE 8
		// Codility 2
		// Test 3
		// Coders 5
		// Restriction from i=1..N

		for (int i = 1; i <= N; i++) {
			String cad = "";
			boolean isDivisible = false;
			if (i % 2 == 0) {
				cad += "Codility";
				isDivisible = true;
			}
			if (i % 3 == 0) {
				cad += "Test";
				isDivisible = true;
			}
			if (i % 5 == 0) {
				cad += "Coders";
				isDivisible = true;
			}
			if (!isDivisible) {
				System.out.println(i);
			}
			else{
				System.out.println(cad);
			}
		}
	}

}
