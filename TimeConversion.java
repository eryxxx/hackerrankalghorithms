import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        
        int len=s.length();
        String first=s.substring(0, s.length()-2);
        String second=s.substring(s.length()-2, s.length());;
        if(second.equals("PM")){
            String ch1=first.substring(0, 2);
            String ch2=first.substring(2,first.length());
            int y = Integer.parseInt(ch1);
           // System.out.println(y);
            y=y+12;
          //  System.out.println(y);
            String last=Integer.toString(y);
            s=last+ch2;
            return s;
        }else{
            s=first;
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
