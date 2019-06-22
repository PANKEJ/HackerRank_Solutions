import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int surfaceArea(int[][] ar,int h,int w) 
    {
        int max=0;
        for(int ctr=1;ctr<=h;ctr++)
        {
            for(int temp=1;temp<=w;temp++)
            {
                int sum=2;
                if(ar[ctr][temp]>ar[ctr-1][temp])
                {
                    sum+=ar[ctr][temp]-ar[ctr-1][temp];
                }
                if(ar[ctr][temp]>ar[ctr][temp-1])
                {
                    sum+=ar[ctr][temp]-ar[ctr][temp-1];
                }
                if(ar[ctr][temp]>ar[ctr+1][temp])
                {
                    sum+=ar[ctr][temp]-ar[ctr+1][temp];
                }
                if(ar[ctr][temp]>ar[ctr][temp+1])
                {
                    sum+=ar[ctr][temp]-ar[ctr][temp+1];
                }
                max+=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int W = in.nextInt();
        int[][] A = new int[H+2][W+2];
        for(int A_i = 1; A_i <=H; A_i++){
            for(int A_j = 1; A_j <= W; A_j++){
                A[A_i][A_j] = in.nextInt();
            }
        }
        int result = surfaceArea(A,H,W);
        System.out.println(result);
        in.close();
    }
}
