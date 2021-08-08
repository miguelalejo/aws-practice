package ec.aws.code.practice.recursion.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFactorial {
	Factorial factorial = new Factorial();
	
	@Test
	public void test1() {
		int actual = factorial.calcular(1);
		assertEquals(1, actual);
	}
	
	@Test
	public void test2() {
		int actual = factorial.calcular(3);
		assertEquals(6, actual);		
	}
	
	@Test
	public void test3() {
		int actual = factorial.calcular(5);		
		assertEquals(120, actual);
	}
	
	@Test
	public void test4() {
		int actual = factorial.calcular(9);		
		assertEquals(362880, actual);
	}
	
	
	
}