package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testI {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		double c=0.57721566490153286060651209;
		double value[]=new double[1000000];
		{
			value[0]=0;
			for(int i=1;i<1000000;i++)
			{
				value[i]=value[i-1]+1/(double)i;
			}
		}
		in.nextToken();int t=(int)in.nval;
		for(int i=0;i<t;i++)
		{
			in.nextToken();
			int a=(int)in.nval;
			double num=0.0;
			if(a<100000) {num=value[a];}
			else num=Math.log(a)+c+1/(double)(2*a);
			//String str=String.valueOf(num).split(".")[1];
			//if(str.length()>8)
			out.println("Case "+(i+1)+": "+num);
		}
		out.flush();
	}
}
