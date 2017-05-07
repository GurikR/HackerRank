package problem3;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while(noOfTestCases != 0){
            
            long num = scanner.nextLong();
            long temp  = num;
            for(int i = 2 ; i <= Math.sqrt(temp) ; i++){
                if(temp % i == 0){
                    temp /= i;
                    i--;
                }
            }
            
            System.out.println(temp);
            noOfTestCases--;
        }
        
        scanner.close();
    }
}
