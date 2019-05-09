package 甲;
/*
 * hash
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class pat13 {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int max=(int)in.nval;
		while(!jud(max)) {max++;}
		in.nextToken();
		int n=(int)in.nval;
		boolean b[]=new boolean[10004];
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			int a=(int)in.nval;int j;
			int t=a%max;
			for( j=0;j<max;j++)
			{
				int key=(t+j*j)%max;
				if(!b[key]) {b[key]=true;out.print(key+(i==n-1?"":" "));break;}
			}
			
			if(j==max) out.print("-"+(i==n-1?"":" "));
			out.flush();
		}
		out.flush();
	}
	private static boolean jud(int max) {
		// TODO 自动生成的方法存根
		if(max==1)return false;
		
		for(int i=2;i*i<=max;i++)
		{
			
			if(max%i==0) {return false;}
		}
		return true;
	}

}
