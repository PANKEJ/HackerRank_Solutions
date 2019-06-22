
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws IOException {

        String s = getNextToken().replaceAll(" ", "");
        double sqrt = Math.sqrt(s.length());
        int column;
        if (sqrt % 10 == 0) {
            column = (int) sqrt;
        } else {
            column = (int) Math.ceil(sqrt);
        }

        for (int i = 0; i < column; i++) {
            for (int j = 0; i + j < s.length(); j+=column) {
                System.out.print(s.charAt(i + j));
            }
            if(i != column - 1)
                System.out.print(" ");
        }
    }

    
    static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));
    static StringTokenizer sc;

    private static String getNextToken() throws IOException {
        return in.readLine();
    }

}
