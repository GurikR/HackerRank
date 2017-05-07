package problem11;

import java.util.*;

public class Solution {

    static int getUpProd(int[][] array,int m,int n){
        int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m--;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;                
    }
    
    static int getDownProd(int[][] array,int m,int n){
        int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m++;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getLeftProd(int[][] array,int m,int n){
        int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                n--;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getRightProd(int[][] array,int m,int n){
        int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                n++;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getDiagonalProd(int[][] array,int m,int n){
         int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m++;
                n++;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getAntiDiagonalProd(int[][] array,int m,int n){
         int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m--;
                n--;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getUpRightDiagonalProd(int[][] array,int m,int n){
         int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m++;
                n--;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    static int getUpLeftDiagonalProd(int[][] array,int m,int n){
         int prod = 1;
        try{
            for(int cnt = 0 ; cnt< 4;cnt++){
                prod *= array[m][n];
                m--;
                n++;
            }    
        }catch(Exception e){
            return -1;
        }
        return prod;
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int[][] array = new int[20][20];
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                array[i][j]=scanner.nextInt();
            }
        }
        
        int maxProd = 0;
        for(int i=0;i<20;i++){
            for(int j=0;j<20;j++){
                int upProd = getUpProd(array,i,j);
                if( upProd >= 0 && upProd > maxProd ){
                    maxProd = upProd;
                }
                
                int downProd = getDownProd(array,i,j);
                if( downProd >= 0 && downProd > maxProd ){
                    maxProd = downProd;
                }
                
                int leftProd = getLeftProd(array,i,j);
                if( leftProd >= 0 && leftProd > maxProd ){
                    maxProd = leftProd;
                }
                
                int rightProd = getRightProd(array,i,j);
                if( rightProd >= 0 && rightProd > maxProd ){
                    maxProd = rightProd;
                }
                
                int diagonalProd = getDiagonalProd(array,i,j);
                if( diagonalProd >= 0 && diagonalProd > maxProd ){
                    maxProd = diagonalProd;
                }
                
                int antiDiagonalProd = getAntiDiagonalProd(array,i,j);
                if( antiDiagonalProd >= 0 && antiDiagonalProd > maxProd ){
                    maxProd = antiDiagonalProd;
                }
                
                int upRightDiagonalProd = getUpRightDiagonalProd(array,i,j);
                if( upRightDiagonalProd >= 0 && upRightDiagonalProd > maxProd ){
                    maxProd = upRightDiagonalProd;
                }
                
                int upLeftDiagonalProd = getUpLeftDiagonalProd(array,i,j);
                if( upLeftDiagonalProd >= 0 && upLeftDiagonalProd > maxProd ){
                    maxProd = upLeftDiagonalProd;
                }
            }
        }
        
        System.out.println(maxProd);
        
        scanner.close();
    }
}