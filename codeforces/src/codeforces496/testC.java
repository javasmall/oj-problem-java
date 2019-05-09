package codeforces496;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class testC {

	public static void main(String[] args) {		
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer>map=new TreeMap();
        Set<Integer>set=new HashSet();       
        long value[]=new long[32];
        value[0]=1;
        for(int i=1;i<32;i++)
        {
        	value[i]=2*value[i-1];
        }
        int n=sc.nextInt();      
        int a[]=new int[n];
        boolean jud[]=new boolean[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
        	
        	if(map.containsKey(a[i])) {map.put(a[i], map.get(a[i])+1);}
        	else
        		map.put(a[i], 1);
        	//judgel=a[i];
        }

        for(int i=n-1;i>=0;i--)
        {  
        	for(int j=31;j>0;j--)
        	{
        		if(value[j-1]<=a[i])
        		{
        			int team=(int) (value[j]-a[i]);
        			if(team==a[i]&&map.get(a[i])>=2) {set.add(team);break;}
        			else if(team!=a[i]&&map.containsKey(team)) {set.add(team);set.add(a[i]);break;}
        		}
        	}	
        }
    int count=0;
    for(int i:set)
    {
    	count+=map.get(i);
    }
        System.out.println(n-count);
	}
}
