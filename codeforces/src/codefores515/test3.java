package codefores515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class test3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		int n=Integer.parseInt(in.readLine());
		Map<Long, Integer>lmap=new HashMap<>();
		Map<Long, Integer>rmap=new HashMap<>();
		int left=0;int right=0;int num=0;
		for(int i=0;i<n;i++)
		{
			String input[]=in.readLine().split(" ");
			String s=input[0];
			long id=Long.parseLong(input[1]);
			if(s.equals("L"))
			{
				 lmap.put(id, ++left);
				num++;
			}
			else if(s.equals("R"))
			{
				 num++;
				rmap.put(id, ++right);
			}
			else if(s.equals("?")){
				if(lmap.containsKey(id))
				{
					long a1=left-lmap.get(id);
					long a2=num-a1-1;
					long min=a1<=a2?a1:a2;
					out.println(min);
				}
				else {
					long a1=right-rmap.get(id);
					long a2=num-a1-1;
					long min=a1<=a2?a1:a2;
					out.println(min);
				}
				
			}
		}out.flush();
	}
}
