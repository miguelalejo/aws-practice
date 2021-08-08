package ec.aws.code.practice.recursion.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFibonnaci {
	@Test
	public void test1() {
		Fibonnaci fibonnaci = new Fibonnaci();
		int actual = fibonnaci.calcularFibonnaci(5);
		assertEquals(5, actual);
	}
	
	@Test
	public void test2() {
		Fibonnaci fibonnaci = new Fibonnaci();
		int actual = fibonnaci.calcularFibonnaci(7);
		assertEquals(13, actual);
	}
}