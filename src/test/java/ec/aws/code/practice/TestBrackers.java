package ec.aws.code.practice;

import org.junit.jupiter.api.Test;

import ec.aws.code.Brackers;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBrackers {

	Brackers brackers = new Brackers();

	@Test
	public void test1() {
		int result = brackers.solution("()");
		assertEquals(1, result);
	}
	
	@Test
	public void test2() {
		int result = brackers.solution("((");
		assertEquals(0, result);
	}
	
	@Test
	public void test3() {
		int result = brackers.solution("()()");
		assertEquals(1, result);
	}
	
	@Test
	public void test4() {
		int result = brackers.solution("(){}");
		assertEquals(1, result);
	}
	
	@Test
	public void test5() {
		int result = brackers.solution("([]){}");
		assertEquals(1, result);
	}
	
	@Test
	public void test6() {
		int result = brackers.solution("(]){}");
		assertEquals(0, result);
	}
	
	@Test
	public void test7() {
		int result = brackers.solution("(){}({}[])");
		assertEquals(1, result);
	}
	
	@Test
	public void test8() {
		int result = brackers.solution("(){}({}[])[((({})))]([]){([])}");
		assertEquals(1, result);
	}
	
	@Test
	public void test9() {
		int result = brackers.solution("(){}({}[])[((({})))]([]){([)}");
		assertEquals(0, result);
	}
	
	@Test
	public void test10() {
		int result = brackers.solution("[((({})))");
		assertEquals(0, result);
	}
	
	@Test
	public void test11() {
		int result = brackers.solution("{[()()]}");
		assertEquals(1, result);
	}
	
	@Test
	public void test12() {
		int result = brackers.solution("([)()]");
		assertEquals(0, result);
	}
	
	@Test
	public void test13() {
		int result = brackers.solution("]]]]]]");
		assertEquals(0, result);
	}
	
	@Test
	public void test14() {
		int result = brackers.solution("{{{{{");
		assertEquals(0, result);
	}
	
	
	@Test
	public void test15() {
		int result = brackers.solution("))){{}}");
		assertEquals(0, result);
	}
	
	
	
	

}
