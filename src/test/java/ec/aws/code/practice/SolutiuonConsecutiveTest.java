package ec.aws.code.practice;

import org.junit.jupiter.api.Test;

public class SolutiuonConsecutiveTest {
	SolutiuonConsecutive solutiuonConsecutive =new SolutiuonConsecutive();
	@Test
	public void test1() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 3;
		solutiuonConsecutive.solution(A);		
	}
	
	@Test
	public void test2() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 5;
		solutiuonConsecutive.solution(A);		
	}

	
	@Test
	public void test3() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 11;
		solutiuonConsecutive.solution(A);		
	}
	
	@Test
	public void test4() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 24;
		solutiuonConsecutive.solution(A);		
	}
	
	@Test
	public void test6() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 30;
		solutiuonConsecutive.solution(A);		
	}
	
	@Test
	public void test7() {
		// Given A = 1, 3, 6, 4, 1, 2, the function should return 5.
		int A = 1000;
		solutiuonConsecutive.solution(A);		
	}

}
