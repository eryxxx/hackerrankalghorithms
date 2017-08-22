import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    
  
    

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        double zero=0;
        double plus=0;
        double minus=0;
        double total;
        for (int j=0;j<arr.length;j++){
            
            if (arr[j]==0){
                zero++;
            }
           if (arr[j]<0){
                minus++;
            }
            if (arr[j]>0){
                plus++;
            }
            
           
          
        }
            total=zero+minus+plus;
            System.out.println(plus/total);
            System.out.println(minus/total);
            System.out.println(zero/total);
    }
}
