package problem2;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while(noOfTestCases != 0){
            
            long num = scanner.nextLong();
            
            long firstTerm  = 1;
            long secondTerm = 2;
            long result = 3;
            long sum = 2;
            while(true){
                result = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm  = result;
                if( result < num ){
                    if(result % 2 == 0){
                    sum += result;
                }
                }else{
                    break;
                }
            }

            System.out.println(sum);
            
            noOfTestCases--;
        }
        
        scanner.close();
    }
}