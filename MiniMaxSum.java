import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        
        long total=0;
        long minimalSum;
        long maximalSum;
        for (int j=0;j<arr.length;j++){
            total=total+arr[j];
        }
        maximalSum=total-arr[0];
        minimalSum=total-arr[4];
        System.out.println(minimalSum+" "+maximalSum);
        
    }
}
