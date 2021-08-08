package ec.aws.code;

import java.util.Set;
import java.util.TreeSet;

public class Fish {
	public int solution(int[] A, int[] B) {
        // write your code in Java SE 8			
		Set<Integer> fishAlive = new TreeSet<>();
		
        for(int p=0,  q=p+1;p<B.length-1;p++,q++){
        	if(B[p]==1 &&B[q]==0) {        		
        		if(A[p]>A[q]) {
        			A[q]=A[p];
        			B[q]=1;
        		}else if(A[q]>A[p]) {
        			B[q]=0;
        		}
        	} else {
        		fishAlive.add(A[p]);
        	}            
        }
        return fishAlive.size()+1;
    }

}
