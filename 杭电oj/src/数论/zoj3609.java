package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

/*
 * 拓展欧几里得
 */
public class zoj3609 {
      static long x=0;static long y=0;
    public static void main(String[] args) throws IOException {
        // TODO 自动生成的方法存根
        StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
      in.nextToken();  int t =(int)in.nval;
       for(int i=0;i<t;i++)
        {
    	   in.nextToken();
            long a=(long)in.nval;
            in.nextToken();
            long b=(long)in.nval;
            
            long q=tgcd(a,b);
           // long x1=x;
            if(1%q!=0) {out.println("Not Exist");}//gcd要和要求相等（这里等于1）
            else {
                while(x<=0){//x*a+y*b=1  要求x>0这样并且要求x最小，那么这样操作就相当于+ab-ab操作。刚开始还没明白
                    x+=b;
                    y-=a;
                }
                out.println(x);}//
            out.flush();
        }       
    }
    static long tgcd(long a,long b)
    {
        if(b==0) {x=1;y=0;return a;}
        long ans=tgcd(b,a%b);
        long team=x;
        x=y;
        y=team-a/b*y;
       // System.out.println(x);
        return ans;

    }
}