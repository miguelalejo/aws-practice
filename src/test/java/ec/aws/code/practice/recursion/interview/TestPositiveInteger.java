package ec.aws.code.practice.recursion.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPositiveInteger {
	PositiveIntegers positiveIntegers = new PositiveIntegers(); 
	@Test
	public void test1() {		
		int actual = positiveIntegers.sum(1);
		assertEquals(1, actual);
	}
	
	@Test
	public void test2() {		
		int actual = positiveIntegers.sum(5);
		assertEquals(15, actual);
	}
	
	@Test
	public void test3() {		
		int actual = positiveIntegers.sum(100);
		assertEquals(5050, actual);
	}
	
	@Test
	public void test4() {		
		int actual = positiveIntegers.sum(500);
		assertEquals(125250, actual);
	}
	
	@Test
	public void test5() {		
		int actual = positiveIntegers.sumInt(1);
		assertEquals(1, actual);
	}
	
	@Test
	public void test6() {		
		int actual = positiveIntegers.sumInt(5);
		assertEquals(15, actual);
	}
	
	@Test
	public void test7() {		
		int actual = positiveIntegers.sumInt(100);
		assertEquals(5050, actual);
	}
	
	@Test
	public void test8() {		
		int actual = positiveIntegers.sumInt(500);
		assertEquals(125250, actual);
	}
	
	
	
}