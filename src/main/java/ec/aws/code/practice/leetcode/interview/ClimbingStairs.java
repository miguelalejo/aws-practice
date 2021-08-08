package ec.aws.code.practice.leetcode.interview;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int totalSteps = 1;
        int sum2Sep = 0;
        for(int i=0;i<n;){
            sum2Sep+=2; 
            i = i+2;
        }
        if(sum2Sep==n){
            totalSteps++;
            
        }
        int tempTotal = 0;
        int val = 2;
        int k = 1 ;
        boolean hasSum = false;
        for(int i=0;i<n;i++){            
            int sumComSep = val;
            hasSum = false;
            for(int j=i+2;j<n;j++){
                sumComSep=sumComSep+1;    
                hasSum = true;
            }
            if(sumComSep==n && hasSum){
                tempTotal += (n-k);
                k++;
            }
            val += 2;
                          
        }
        return totalSteps+tempTotal;
    }
}
