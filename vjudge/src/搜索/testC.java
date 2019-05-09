package 搜索;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;



public class testC {

	/**
	 * @param args
	 * @throws IOException 
	 */
	static int min=Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           
           StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
           PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
           in.nextToken();
           int n=(int)in.nval;
           in.nextToken();int k=(int)in.nval;
           min=Math.abs(k-n);
           dfs(n,k,0); 
           System.out.print(min);
		}
	private static void dfs(int n, int k,int time) {
		if(n>k){dfs(k, k, time+Math.abs(n-k));}
		else if(n==k){if(time<min){min=time;}}
		else if(time>min){}
		else {
			for(int i=0;i<3;i++)
			{
				if(i==1){
					dfs(n+1, k, time+1);
				}
				else if(i==2){
					dfs(n-1, k, time+1);
				}
				else 
				{
					int team=2;//当前点倍数
					dfs(n*team, k, time+1);
					//dfs(n*(team+1), k, time+1);
					
					
				}
			}
		}
	}
}

