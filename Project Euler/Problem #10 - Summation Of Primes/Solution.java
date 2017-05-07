package problem10;

import java.util.*;

public class Solution {

    static boolean isPrime(int num){
        int temp = num;
        for(int i=2 ; i <= Math.sqrt(temp) ; i++){
            if(temp % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Map<Integer,Long> map = new HashMap<Integer,Long>();
        
        long sum = 2;
        for(int i=3 ;i<=1000000; i++){
            
            if(i%2!=0){
                if(isPrime(i)){
                    sum +=i;
                }                
            }
            
            map.put(i,sum);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();
        
        while(noOfTestCases != 0){
            int n = scanner.nextInt();
            System.out.println(map.get(n));
            noOfTestCases--;
        }
        
        scanner.close();
    }
}
