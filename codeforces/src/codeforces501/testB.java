package codeforces501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class testB {
  static int min;
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		 int n=Integer.parseInt(in.readLine());
		 String s=in.readLine();
		 String t=in.readLine();
//		 Map<String,Integer>map=new HashMap();
//		 for(int i=0;i<n;i++)
//		 {		 
//			 String team=String.valueOf(t.charAt(i));
//			 map.put(team, i);
//			
//		 }
		 char a[]=s.toCharArray();
		 char b[]=t.toCharArray();
//		 for(int i=0;i<n;i++)
//		 {
//			 if(map.containsKey(String.valueOf(s.charAt(i))))
//			 a[i]=map.get(String.valueOf(s.charAt(i)));
//		 }
		 List list=new ArrayList();
	
		for(int i=0;i<n;i++)
		 {
			if(a[i]!=b[i])
			{
				 min=-1;
				for(int j=i+1;j<n;j++)
				{
					if(a[j]==b[i]) {
						min=i;
						for(int q=j-1;q>=i;q--)
						{
							char team=a[q];
							a[q]=a[q+1];a[q+1]=team;
							list.add(q+1);
						}
						break;
					}
				}
				if(min==-1) {break;}
			}
		 }
		 if(min==-1) {out.println(-1);}
		 else {
		 out.println(list.size());
		 for(int i=0;i<list.size();i++)
		 {
			 if(i==list.size()-1)out.println(list.get(i));
			 else out.print(list.get(i)+" ");
			 
		 }}
         out.flush();
	}
}
