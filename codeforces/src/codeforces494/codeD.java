package codeforces494;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Map;


public class codeD {
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		Map<Long,Integer> map=new HashMap();
		in.nextToken();
		int n=(int)in.nval;in.nextToken();
		int q=(int)in.nval;
	    long value[]=new long[33];//º€÷µ ‰»Î
	    int number[]=new int[33];
	    value[0]=1;map.put((long) 1, 0);
	    for(int i=1;i<33;i++)
	    {
	    	value[i]=2*value[i-1];
	    	map.put( value[i], i);
	    	//System.out.println(value[i]);
	    }		
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			long input=(long)in.nval;int getint=map.get(input);
			number[getint]++;
		}
		int t=31;int count=0;
		while(q-->0)
		{
			in.nextToken();
			int sea=(int)in.nval;	
			 count=0;
			for(int i=t;i>=0;i--)
			{
				int num=number[i];
				if(sea<value[i]||num==0) {continue;}
				else  if(sea>=value[i]&&num>0) {
			    	int numb1=(int) (sea/value[i]);	
			    	numb1=numb1>num?num:numb1;
					sea-=value[i]*numb1;
					count+=numb1;											
			    }
				else if(sea==0) {break;}
			}
			if(sea==0)
			 {System.out.println(count);}
			else
				{System.out.println(-1);}			
		}
	}
}
