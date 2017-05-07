package problem9;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while(noOfTestCases != 0){
            int num = scanner.nextInt();
            
            int maxprod = 0;
            boolean found = false;
            for (int a = 1; a < num; a++) {
                if((num *(num - 2 * a))%(2*(num-a)) == 0){
                    int b = (num *(num - 2 * a))/(2*(num-a));
                    
                    int prod = a * b * (num - (a+b));
                    if(prod > 0 && b > 0 && (b > a)){
                        found = true;
                        if(prod > maxprod){
                            maxprod = prod;
                        }
                    }
                }
                
            }
            
            if(found){
                System.out.println(maxprod);                
            }else{
                System.out.println(-1);               
            }
            noOfTestCases--;
        }
        
        scanner.close();
    }
}