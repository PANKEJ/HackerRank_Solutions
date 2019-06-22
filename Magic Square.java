import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a1 = {4, 9, 2, 3, 5, 7, 8, 1, 6};
        int[] a2 = {2, 9, 4, 7, 5, 3, 6, 1, 8};
        int[] a3 = {6, 1, 8, 7, 5, 3, 2, 9, 4};
        int[] a4 = {8, 3, 4, 1, 5, 9, 6, 7, 2};
        int[] a5 = {2, 7, 6, 9, 5, 1, 4, 3, 8};
        int[] a6 = {6, 7, 2, 1, 5, 9, 8, 3, 4};
        int[] a7 = {8, 1, 6, 3, 5, 7, 4, 9, 2};
        int[] a8 = {4, 3, 8, 9, 5, 1, 2, 7, 6};
        int result = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0;
        for (int i = 0; i < 9; i++){
            int current = scanner.nextInt();
            c1 += (int) Math.abs(current-a1[i]);
            c2 += (int) Math.abs(current-a2[i]);
            c3 += (int) Math.abs(current-a3[i]);
            c4 += (int) Math.abs(current-a4[i]);
            c5 += (int) Math.abs(current-a5[i]);
            c6 += (int) Math.abs(current-a6[i]);
            c7 += (int) Math.abs(current-a7[i]);
            c8 += (int) Math.abs(current-a8[i]);
        }
        List<Integer> list = new ArrayList<>();
            list.add(c1);
            list.add(c2);
            list.add(c3);
            list.add(c4);
            list.add(c5);
            list.add(c6);
            list.add(c7);
            list.add(c8);
        Collections.sort(list);
        System.out.print(list.get(0));
    }
}
