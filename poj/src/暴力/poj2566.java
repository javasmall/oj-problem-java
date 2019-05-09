package 暴力;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;

public class poj2566 {

	static int left=0;
	static int right=0;	
	static int minlen=0;
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		while(in.nextToken()!=StreamTokenizer.TT_EOF)
		{
			int n=(int)in.nval;
			in.nextToken();int k=(int)in.nval;
			if(n==0&&k==0) {break;}
			int a[]=new int[n];int sum[][]=new int[n+1][2];
			for(int i=0;i<n;i++)
			{
				in.nextToken();a[i]=(int)in.nval;
				
				sum[i+1][1]+=a[i]+sum[i][1];
				sum[i+1][0]=i+1;//标记index
			}
			Arrays.sort(sum,comparator);
			for(int i=0;i<k;i++)
			{
				in.nextToken();
				int team=(int)in.nval;
				minlen=Integer.MAX_VALUE;left=0;right=0;
				chiqu(sum,team);
				System.out.print(minlen+" ");
				int min=sum[left][0]<sum[right][0]?sum[left][0]:sum[right][0];
				int max=sum[left][0]>sum[right][0]?sum[left][0]:sum[right][0];
				System.out.println((min+1)+" "+max);
			}			
		}
	}
	private static void chiqu(int[][] sum2, int team) {
		// TODO 自动生成的方法存根
		int l=0;
		for(int i=1;i<sum2.length;i++)
		{
			int count=sum2[i][1]-sum2[l][1];
			if(count<team)//可以继续增长
			{
				if(Math.abs(team-count)<Math.abs(team-minlen))
				{
					left=l;right=i;minlen=count;
				}
			}
			else
			{
				if(Math.abs(team-count)<Math.abs(team-minlen))
				{
					left=l;right=i;minlen=count;
				}
				while(count>=team&&l<i-1)
				{
					l++;
					count=sum2[i][1]-sum2[l][1];
					if(Math.abs(team-count)<Math.abs(team-minlen))
					{
						left=l;right=i;minlen=count;
					}
				}
			}			
		}		
	}
	static Comparator<int[]>comparator=new Comparator<int[]>() {
		@Override
		public int compare(int[] o1, int[] o2) {
			// TODO 自动生成的方法存根
			return o1[1]-o2[1];
		}
	};

}
