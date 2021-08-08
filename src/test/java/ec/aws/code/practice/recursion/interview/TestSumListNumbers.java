package ec.aws.code.practice.recursion.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestSumListNumbers {
	SumListNumbers sumListNumbers = new SumListNumbers();
	@Test
	public void test1() {		
		int actual = sumListNumbers.sumNumbers(new int[] {1});
		assertEquals(1, actual);
	}
	
	@Test
	public void test2() {		
		int actual = sumListNumbers.sumNumbers(new int[] {1,2,3});
		assertEquals(6, actual);
	}
}
