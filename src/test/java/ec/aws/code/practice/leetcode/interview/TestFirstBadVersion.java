package ec.aws.code.practice.leetcode.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFirstBadVersion {

	@Test
	public void test0() {
		System.out.print(5 / 2);
	}

	@Test
	public void test1() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(4);
		int result = firstBadVersion.firstBadVersion(5);
		assertEquals(4, result);
	}

	@Test
	public void test2() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(1);
		int result = firstBadVersion.firstBadVersion(5);
		assertEquals(1, result);
	}

	@Test
	public void test3() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(1);
		int result = firstBadVersion.firstBadVersion(1);
		assertEquals(1, result);
	}

	@Test
	public void test4() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(1000000);
		int result = firstBadVersion.firstBadVersion(10000001);
		assertEquals(1000000, result);
	}

	@Test
	public void test5() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(1048547);
		int result = firstBadVersion.firstBadVersion(1048575);
		assertEquals(1048547, result);
	}

	@Test
	public void test7() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(11);
		int result = firstBadVersion.firstBadVersion(47);
		assertEquals(11, result);
	}

	@Test
	public void test6() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(2147483610);
		int result = firstBadVersion.firstBadVersionO(2147483647);
		assertEquals(2147483610, result);
	}

	@Test
	public void test8() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(11);
		int result = firstBadVersion.firstBadVersion(17);
		assertEquals(11, result);
	}

	@Test
	public void test9() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(12);
		int result = firstBadVersion.firstBadVersion(19);
		assertEquals(12, result);
	}

	@Test
	public void test10() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(13);
		int result = firstBadVersion.firstBadVersion(15);
		assertEquals(13, result);
	}
	
	@Test
	public void test10A() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(13);
		int result = firstBadVersion.firstBadVersionOri(15);
		assertEquals(13, result);
	}

	@Test
	public void test11() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(14);
		int result = firstBadVersion.firstBadVersion(17);
		assertEquals(14, result);
	}

	@Test
	public void test12() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(2147483610);
		int result = firstBadVersion.firstBadVersion(2147483647);
		assertEquals(2147483610, result);
	}

	@Test
	public void test13() {
		FirstBadVersion firstBadVersion = new FirstBadVersion(2147483610);
		int result = firstBadVersion.firstBadVersionOri(2147483647);
		assertEquals(2147483610, result);
	}

}
