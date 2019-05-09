package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test03全排列 {
	static int ceng;
	static int number;
	static int n,leng,time=0;
	static int count;
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
	     n=(int)in.nval;leng=(n+"").toString().length();
	    int a[]=new int[9];
	    for(int i=0;i<9;i++)
	    {
	    	a[i]=i+1;
	    }
	   // int ceng=0;
	    sort(a,0);
	    System.out.println(time);
	}
	private static void sort(int[] a, int ceng2) {
		if(ceng2>7) {return;}
		else {
		for(int j=ceng2;j<9;j++)
		{
			if(j==ceng2) {
				sort(a,ceng2+1);				
			}
			else {
			int b[]=a.clone();
			int team=b[ceng2];
			b[ceng2]=b[j];b[j]=team;
			sort(b,ceng2+1);
			jud(b);
			
			}
		}}
	}
	private static void jud(int a[]) {
		int num1=0;
		boolean b=false;int no1=0;
		while(num1<n&&!b)
		{			
			num1=num1*10+a[no1++];
			//System.out.println(num1);
			int leng1=String.valueOf(num1).length();
			int index2=leng1+(9-leng1)/2-1;
			int index3=leng+(10-leng1)/2+1;
			int num2=0,num3=0;
			for(int i=no1;i<index2;i++)
			{
				num2=num2*10+a[i];
				//System.out.println(num2);
			}
			int num=1;
			for(int i=index2;i<9;i++)
			{
				num3=num3*10+a[i];
				num*=10;
			}
		    for(int j=index2;j<index3;j++)
		    {
		    	num2=num2*10+a[j];
		    	num/=10;
		    	num3%=num;
		    	if(n==num1+num2/num3&&num2%num3==0)
		    	{
		    		time++;b=true;//System.out.println(num1+" "+num2+" "+num3);break;
		    	}
		    	else if(num1+num2/num3>n)
		    	{
		    		break;
		    	}
		    }						
		}
	  }
}
