package ec.aws.code;

import java.util.Stack;

public class Brackers {

	public int solution(String S) {
		// write your code in Java SE 8
		Stack<Character> stacksimbols = new Stack<Character>();		
		for (int i = 0; i < S.length(); i++) {
			if (isOppeningCharacter(S.charAt(i))) {
				stacksimbols.add(S.charAt(i));
			} else {
				if(stacksimbols.isEmpty()) {
					return 0;
				}
				Character lastChar = stacksimbols.peek();
				Character openningSimbol = finOppeningSimbol(S.charAt(i));
				if (lastChar == openningSimbol) {
					stacksimbols.pop();
				}else {
					return 0;
				}
			}
		}
		if (stacksimbols.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public boolean isOppeningCharacter(Character c) {
		if(c=='(' || c=='[' || c=='{') {
			return true;
		}
		return false;
		
	}
	
	public Character finOppeningSimbol(Character c) {
		if(c==')') {
			return '(';
		}		
		if(c==']') {
			return '[';
		}
		if(c=='}') {
			return '{';
		}
		return '-';
	}
}
