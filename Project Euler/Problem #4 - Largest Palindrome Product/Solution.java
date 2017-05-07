package problem4;

import java.util.*;

public class Solution {

    static boolean isPalindrame(long number){
        long temp = number;
        long builtNumber = 0;
        while(temp != 0){
            builtNumber = (builtNumber * 10) + temp%10;
            temp /= 10;
        }
        return (number == builtNumber) ? true : false;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while( noOfTestCases != 0){
            long maxNumber = scanner.nextLong();
            long ans = -1;
            
            for(long i=100; i < 999 ; i++){
                for(long j=100; j < 999 ; j++){
                    long prod = i * j;
                    if(prod < maxNumber){
                        if(isPalindrame(prod)){
                            if(prod > ans){
                                ans = prod;
                            }
                        }
                    }
                }
            }
            
            System.out.println(ans);
            noOfTestCases--;
        }
        
        scanner.close();
    }
}