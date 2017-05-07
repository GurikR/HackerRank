package problem5;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        while(noOfTestCases != 0){
            int max = scanner.nextInt();
            
            for(int i = 1 ;;i++){
                int count = 0;
                for(int j = 1 ; j <=max ;j++){
                    if(i%j == 0){
                        count++;                        
                    }
                }
                
                if(max == count){
                    System.out.println(i);
                    break;
                }
            }
            noOfTestCases--;
        }
        
        scanner.close();
    }
} 