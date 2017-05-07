package problem7;

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
        
        Scanner scanner = new Scanner(System.in);
        
        int noOfTestCases = scanner.nextInt();

        Map<Integer,Integer> cases = new HashMap<Integer,Integer>();
        int x = 0;
        while(noOfTestCases != 0){
            int n = scanner.nextInt();
            cases.put(x,n);
            x++;
            noOfTestCases--;
        }
        
        int max  = Collections.max(cases.values());
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count = 0;
        for(int i=2 ;; i++){
                
            if(!map.containsValue(i)){
                if(isPrime(i)){
                    count++;
                    map.put(count,i);
                 }
                if(count == max){
                	break;
                }
            }
        }
        
        for(int i =0  ; i < cases.size() ; i++){
            System.out.println(map.get(cases.get(i)));
        }
        scanner.close();
    }
}
