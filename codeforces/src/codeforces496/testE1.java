package codeforces496;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class testE1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//×ÜÊýÁ¿
		int m=sc.nextInt();
		int a[]=new int[n];
		int index=0;
		for(int i=0;i<n;i++)
		{
			int jud=sc.nextInt();
			a[i]=jud>m?1:-1;
			if(jud==m) {index=i;a[i]=0;}
		}
       int dp[]=new int[n];
       int left[]=new int[n];
       Map<Integer,Integer>map=new TreeMap();
       
       dp[index]=0;
       map.put(0, 1);
       for(int i=index+1;i<n;i++)
       {
    	   dp[i]+=dp[i-1]+a[i]; 
    	   if(map.containsKey(dp[i]))
    	   {
    		   map.put(dp[i], map.get(dp[i])+1);
    	   }
    	   else
    		   map.put(dp[i], 1);
       }
       long count =0;
       for(int i=index;i>=0;i--)
       {
    	   if(i==index) {dp[index]=0;}
    	   else dp[i]+=dp[i+1]+a[i];  
    	  if(map.containsKey(-dp[i]))
    	  {
    		  count+=map.get(-dp[i]);
    	  }
    	  if(map.containsKey(-dp[i]+1))
    	  {
    		  count+=map.get(-dp[i]+1);
    	  }
       }                
       System.out.println(count);
	}
}
