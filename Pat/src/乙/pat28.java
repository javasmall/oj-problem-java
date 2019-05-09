package 乙;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class pat28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new HashMap();
		int n=sc.nextInt();//总人数
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			if(map.containsKey(a[i]))
			map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i],1);
		}
		int kk=sc.nextInt();//查询个数
		int sea[]=new int[kk];
		for(int i=0;i<kk;i++)
		{
			sea[i]=sc.nextInt();
		}
		for(int i=0;i<kk;i++)
		{
			if(map.containsKey(sea[i]))
				{if(i==kk-1) {System.out.println(map.get(sea[i]));}
				else
					System.out.print(map.get(sea[i])+" ");
				}
			else
			{if(i==kk-1) {System.out.println(0);}
			else	System.out.print(0+" ");
		             }
	}
	}}
