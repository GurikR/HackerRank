package problem6;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while(noOfTestCases != 0){
            long num = scanner.nextLong();
            
            long sumOfSquares = (num * (num + 1) * (2*num+1) )/6;
            
            long sumOfNums = (num*(num+1))/2 ;

            long squareOfSumOfNums = sumOfNums * sumOfNums;
                             
            System.out.println(squareOfSumOfNums - sumOfSquares);
            noOfTestCases--;
        }
        
        scanner.close();
    }
}
