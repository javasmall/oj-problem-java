package codeforces498;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    long first[]=new long[n];
	    Map<Long,Integer>map=new HashMap();
	    map.put((long) 0, 0);
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    	if(i==0)first[i]=a[i];
	    	else
	    		first[i]=first[i-1]+a[i];
	    	map.put(first[i],i );
	    }
	    long last[]=new long[n+1];
	   
	    for(int i=n-1;i>0;i--)
	    {
	    	last[i]=last[i+1]+a[i];
	    	
	    }
	    for(int i=1;i<n+1;i++)
	    {
	    	if(map.containsKey(last[i])) {if(map.get(last[i])<i) {System.out.println(last[i]);break;}}
	    }
	    
	}

}
