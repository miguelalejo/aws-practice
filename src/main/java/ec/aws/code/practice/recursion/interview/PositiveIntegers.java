package ec.aws.code.practice.recursion.interview;
/*
 * f(1)==1
 * f(2)=2+1==3
 * f(3)=3+2+1=3+f(2)=4
 * f(4)=4+3+2+1=4+f(3)=4
 * f(n-1)+n n>1
 * */
public class PositiveIntegers {
	public int sum(int n) {
		if(n==1) {
			return 1;
		}		
		return sum(n-1)+n;
	}
	
	public int sumInt(int n) {
		if(n==1) {
			return 1;
		}	
		if(n==2) {
			return 3;
		}
		if (n%2==0){
			return 3*sumInt(n/2)+sumInt((n/2)-1);		
		} else {
			return 3*sumInt((n-1)/2)+sumInt((n+1)/2);
		}
		
	}

}
