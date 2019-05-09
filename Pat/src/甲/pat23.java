package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import java.math.BigInteger;

public class pat23 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n=Integer.parseInt(in.readLine());
		for(int i=0;i<n;i++) {
			String cc[]=in.readLine().split(" ");
		BigInteger a=new BigInteger(cc[0]);
		BigInteger b=new BigInteger(cc[1]);
		BigInteger c=new BigInteger(cc[2]);
		out.println("Case #"+(i+1)+": "+((a.add(b)).compareTo(c)==1?"true":"false"));
	}
      out.flush();
	}
}
