import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigDecimal bd = new BigDecimal("1");
        for(int i=2;i<=N;i++)
            bd = bd.multiply(new BigDecimal(i));
        System.out.println(bd.toString());
    }
}
