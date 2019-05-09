package codeforcetest18;

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
		
		
		  in.nextToken();
		  long a=(long)in.nval;
		  long time=0,value=0;
		  while(value<=a)
		  {
			  time++;value+=time+value;
		  }
		  out.println(time);
		
         out.flush();
	}

}
