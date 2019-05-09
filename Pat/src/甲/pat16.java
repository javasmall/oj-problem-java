package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class pat16 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int np=(int)in.nval;
		in.nextToken();int ng=(int)in.nval;
		int a[]=new int[np];
		int b[]=new int[np];
		int c[]=new int[np];
		for(int i=0;i<np;i++)
		{
			in.nextToken();a[i]=(int)in.nval;
		}
		List<Integer> list=new ArrayList();
		for(int j=0;j<np;j++)
		{
			in.nextToken();b[j]=(int)in.nval;list.add(b[j]);
		}
		int number=np;
		while(number>1)
		{
			List remove=new ArrayList();//记录要删除的那个
			int a2=(number-1)/ng+1;
			for(int i=0;i<list.size();i+=ng)
			{
				int index=0;int value=0;
				for(int j=0;j<ng&&(i+j)<list.size();j++)
				{
					if(a[list.get(i+j)]>value) {value=a[list.get(i+j)];index=i+j;}
				}
				remove.add(list.get(index));
				for(int j=0;j<ng&&(i+j)<list.size();j++)
				{
					if(a[list.get(i+j)]!=value) {c[list.get(i+j)]=a2+1;}
				}
				if(a2==1)c[list.get(index)]=1;
			}
			list.clear();
			list=remove;number=a2;
		}
		for(int i=0;i<np;i++)
		{
			out.print(c[i]+" ");
		}
		out.flush();
	}
}
