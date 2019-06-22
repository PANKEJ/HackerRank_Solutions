import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static String[] numbers={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"};
    
    public static String convertTime(int h,int mm)
        {
        
        
        if(mm==0)
            return numbers[h]+" o' clock";
        
        if(mm<30)
            {
            if(mm==15)
                return "quarter past "+numbers[h];
            if(mm==1)
            return numbers[mm] + " minute past "+numbers[h];
            else
            return numbers[mm] + " minutes past "+numbers[h];
        }
            
        if(mm==30)
            return "half past "+ numbers[h];
        if(mm>30)
            {
            if(h==12)
                h=0;
            if(mm==45)
                return "quarter to "+numbers[h+1];
            mm=60-mm;
            if(mm==1)
                return numbers[mm] + " minute to "+numbers[h+1];
            else
                return numbers[mm] + " minutes to "+numbers[h+1];
        }
        return "";
        
        
                   
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println(convertTime(in.nextInt(),in.nextInt()));
        
    }
}
