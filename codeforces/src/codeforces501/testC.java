package codeforces501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class testC {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
		 
         in.nextToken();int n=(int)in.nval;
         in.nextToken();int m=(int)in.nval;
        long max=0;long min=0;
         Queue <node>q1=new PriorityQueue(com);
         for(int i=0;i<n;i++)
         {
        	 in.nextToken();int a1=(int)in.nval;max+=a1;
        	 in.nextToken();int a2=(int)in.nval;min+=a2;
        	 int a3=a1-a2;
        	 q1.add(new node(a1,a2,a3));
         }
         if(min>m) {out.println(-1);}
         else if(max<=m) {out.println(0);}
       //  out.println(Long.MAX_VALUE);
         else
         {
        	 int number=0;
        	 while(!q1.isEmpty())
        	 {
        		 node no=q1.poll();
        		 number++;max-=no.add;//out.println(max+" "+number);
        		 if(max<=m) {break;}
        	 }
        	 out.println(number);
         }
         out.flush();
         
	}
	static Comparator <node>com=new Comparator<node>() {
		public int compare(node a, node b) {
	
				return b.add-a.add;
		
		}};
 static class node
 {
	 int big;
	 int small;
	 int add;
	 public node(int big,int small,int add)
	 {
		 this.big=big;
		 this.small=small;
		 this.add=add;
	 }
 }
}
