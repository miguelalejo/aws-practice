package ec.aws.code.practice.recursion.interview;
/*
 * f(0)==1
 * f(1)==1
 * f(n-1)*n n>1
 * */
public class Factorial {
	public int calcular(int n) {
		if(n==0) {
			return 1;
		}if(n==1) {
			return 1;
		}
		return calcular(n-1)*n;
	}

}
