package problem1;

import java.util.*;

public class Solution {

    static long getSumOfNDigitsDivisibleByNum(long n,long num){
        long sum = (num * (n*(n+1))/2);
        return sum;
    }
    
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner scanner = new Scanner(System.in);
		
		int noOfTestCases = scanner.nextInt();
		
		while(noOfTestCases != 0){
			long limit = scanner.nextLong();
			long sum = 0;
		
            long lastDigitDivisibleBy5 = 0;
            long lastDigitDivisibleBy3 = 0;
            long lastDigitDivisibleBy3And5 = 0;
            
			for(long i = limit-1 ; i > 0 ; i--){
                if(i % 3 == 0){
					lastDigitDivisibleBy3 = i/3;
                    break;
				}
			}
			
            for(long i = limit-1 ; i > 0 ; i--){
                if(i % 5 == 0){
					lastDigitDivisibleBy5 = i/5;
                    break;
				}
			}
            
            for(long i = limit-1 ; i > 0 ; i--){
                if((i % 3 == 0) && (i % 5 == 0)){
					lastDigitDivisibleBy3And5 = i/15;
                    break;
				}
			}
            
            sum = getSumOfNDigitsDivisibleByNum(lastDigitDivisibleBy3,3) + getSumOfNDigitsDivisibleByNum(lastDigitDivisibleBy5,5)-getSumOfNDigitsDivisibleByNum(lastDigitDivisibleBy3And5,15);
			System.out.println(sum);
			noOfTestCases--;
		}
		
		scanner.close();
	}
}