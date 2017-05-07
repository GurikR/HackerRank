package problem8;

import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        String testCases = scanner.nextLine();
        int noOfTestCases = Integer.parseInt(testCases);
        
        while(noOfTestCases != 0){
            String first = scanner.nextLine();
            
            String[] firstR = first.split(" ");
            
            int noOfDigits = Integer.parseInt(firstR[0]);
            int k = Integer.parseInt(firstR[1]);
            
            String number = scanner.nextLine();
            BigInteger maxprod = BigInteger.ZERO;
            for(int i =0 ; i < number.length() ; i++){
            	if(i+k <= noOfDigits){
            		BigInteger prod = BigInteger.ONE;
            		for(int n = 1 , m = i; n <= k ; n++,m++){
           				prod = prod.multiply(new BigInteger(number.substring(m, i+n)));
            		}
            		
           			maxprod = prod.max(maxprod);
            	}else{
            		break;
            	}
            }
           
            
            System.out.println(maxprod);
            noOfTestCases--;
        }
        
        scanner.close();
    }
}
