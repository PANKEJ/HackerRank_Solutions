import java.io.*;
import java.util.*;
public class abs_perm
{
    static MyScanner sc=new MyScanner(new BufferedReader(new InputStreamReader(System.in)));
    static PrintWriter out=new PrintWriter(System.out);
    
    public static void main(String args[]) throws Exception
    {
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt(),m=sc.nextInt();
            if(m==0)
            {
                for(int i=1;i<=n;i++)
                {
                    out.print(i+" ");
                }
                out.println("");
            }
            else if(n%m!=0 || (n%m==0 && (n/m)%2!=0))
            {
                out.println("-1");
            }
            else
            {
                int[] a=new int[n+1];
                boolean add=true;
                for(int i=1;i<=n;i+=m)
                {
                    for(int j=i;j<=i+m-1;j++)
                    {
                        if(add)
                        {
                            a[j]=j+m;
                        }
                        else
                        {
                            a[j]=j-m;
                        }
                    }
                    add=!add;
                }
                for(int i=1;i<=n;i++)
                {
                    out.print(a[i]+" ");
                }
                out.println("");
            }
        }
        out.close();
    }
}
class MyScanner
{
    BufferedReader in;
    StringTokenizer st;

    public MyScanner(BufferedReader in) {
        this.in = in;
    }
    
    public String nextToken() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
        }
        return st.nextToken();
    }
    
    public String next() throws Exception {
        return nextToken().toString();
    }
    
    public int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    public double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}
