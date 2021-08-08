package ec.aws.code.practice.recursion.interview;
/*
 * f(1)==1
 * f(2)==2
 * f(n-1)+f(n-2) n>2
 * */
public class Fibonnaci {
	public int calcularFibonnaci(int n) {
		if(n==1) {
			return 1;
		}
		if(n==2) {
			return 1;
		}
		return calcularFibonnaci(n-1)+calcularFibonnaci(n-2);
	}

}
