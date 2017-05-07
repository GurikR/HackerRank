package problem13;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = Integer.parseInt(scanner.nextLine());
        
        BigInteger sum = BigInteger.ZERO;
        while(noOfTestCases != 0){
            String num = scanner.nextLine();
            BigInteger big = new BigInteger(num);
            sum = sum.add(big);
            noOfTestCases--;
        }
        
        String ans =  sum.toString().substring(0,10);
        System.out.println(ans);
        scanner.close();        
        
    }
}