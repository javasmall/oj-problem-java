package 数论;

import java.util.Scanner;

public class testN {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++)
       {
    	  int n=sc.nextInt();
         int a=1;int b=n*10;
          int value=0;int mid=0;
          while(b>a)
          {
        	  mid=(a+b)/2;
        	  value=getfive(mid);
        	  if(value==n)
        	  {
        		  a=mid;mid=mid-mid%5;break;
        	  }
        	  else if(value<n)
        	  {
        		  a=mid+1;
        	  }
        	  else {
				b=mid-1;
			}
			
          }
           if(value==n)
    	   System.out.println("Case "+(i+1)+": "+mid);
           else
        	   System.out.println("Case "+(i+1)+": "+"impossible");
       }
	}
	static int getfive(int n)
	{
	   int res=0;
  	   while(n>0)
  	   {
  		   n/=5;
  		   res+=n;
  	   }
		return res;
	}
}
