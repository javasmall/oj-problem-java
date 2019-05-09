package 甲;
/*
 * 模拟入栈出栈的过程
 * 栈不能超标
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class pat40 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int max=(int)in.nval;
		in.nextToken();int number=(int)in.nval;
		in.nextToken();int count=(int)in.nval;
		//int a[]=new int[number];
		for(int i=0;i<count;i++)
		{
			boolean b=true;Stack<Integer> q1=new Stack<Integer>();int indexbig=1;q1.push(1);int indexsmall=0;			
			for(int j=0;j<number;j++)
			{
				in.nextToken();int q=(int)in.nval;
				if(q>indexbig)
				{
					
					for(int qq=indexbig+1;qq<=q;qq++)
					{
						q1.push(qq);//之前的已经入栈
						if(q1.size()>max) {b=false;}
					}
					indexbig=q;
					q1.pop();//弹出q1
					
				}
				else if(q<=indexbig)
				{
					int cc=q1.pop();
					if(cc!=q)
					{
						b=false;
					}
				}								
			}
			if(!b) out.println("NO");
			else out.println("YES");
			b=true;
			out.flush();
		}
	}
}
