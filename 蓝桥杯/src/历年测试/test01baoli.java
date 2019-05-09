package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test01baoli {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int a=(int)in.nval;
		in.nextToken(); int b=(int)in.nval;
		in.nextToken();int c=(int)in.nval;
		int max=a>b?a:b;
		max=max>c?max:c;
		for(int q=max;q<=a*b*c;q++)
		{
			if(q%a==0&&q%b==0&&q%c==0)
			{
				out.println(q);out.flush();break;
			}
		}		
	}

}
