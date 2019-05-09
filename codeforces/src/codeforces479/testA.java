package codeforces479;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testA {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int number=(int)in.nval;
		in.nextToken();int k=(int)in.nval;
		while(k-->0)
		{
			if(number%10!=0) {number--;}
			else
				number/=10;
		}
		out.println(number);out.flush();

	}

}
