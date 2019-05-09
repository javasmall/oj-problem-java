package 数论;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;
public class testA {
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
       in.nextToken();int t=(int)in.nval;
//       int a[]=new int[1000001];
//       for(int i=1;i<1000001;i++)
//       {
//    	   a[i]=i;
//       }
//       for(int i=2;i+2<1000001;i+=2)
//       {
//    	   a[i]/=2;
//       }
//       for(int i=3;i+2<1000001;i+=2)
//       {
//    	   if(a[i]==i)
//    	   {
//    		   for(int j=i;j+i<=1000001;j+=i)
//    		   {
//    			   a[j]=a[j]/i*(i-1);
//    		   }
//    	   }
//       }
  
       for(int i=0;i<t;i++)
       {
    	   in.nextToken();int n=(int)in.nval;long count=0;
    	   for(int j=0;j<n;j++)
    	   {
    		   in.nextToken();
    		   long team=(long)in.nval;
    		   int index=(int) (team+1);
    		   while(!isprime(index)) {index++;}
    		   count+=index;
    		   //System.out.println(oula(team));
    	   }
    	   System.out.println("Case "+(i+1)+": "+count+" Xukha");
       }
	}

	private static boolean isprime(int index) {
		if(index<=2)return true;
		else {
			for(int i=2;i*i<index+1;i++)
			{
				if(index%i==0)return false;
			}
			return true;
		}
		
	}

	private static int oula(int team) {
		int i=0;int res=team;int team1=team;
		for(i=2;i<(int)Math.sqrt(team1)+1;i++)
		{
			if(team%i==0) {
				res=res/i*(i-1);
				while(team%i==0) {team/=i;}//保证I是素数				
			}
		}
		if(team>1)res=res/team*(team-1);
		return res;
	}
}
