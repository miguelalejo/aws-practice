package ec.aws.code.practice.leetcode.interview;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestClimbingStairs {
	@Test
	public void test1() {
		ClimbingStairs climbingStairs = new ClimbingStairs();
		int result = climbingStairs.climbStairs(4);
		assertEquals(5, result);
	}
	
	@Test
	public void test2() {
		ClimbingStairs climbingStairs = new ClimbingStairs();
		int result = climbingStairs.climbStairs(5);
		assertEquals(8, result);
	}
}
