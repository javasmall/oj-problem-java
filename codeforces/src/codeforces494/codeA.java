package codeforces494;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class codeA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map <Integer,Integer>map=new HashMap();
		int max=1;
		for(int i=0;i<n;i++)
		{
			int j=sc.nextInt();
			if(map.containsKey(j)) {map.put(j, map.get(j)+1);if(map.get(j)>max) {max=map.get(j);}}
			else
			{
				map.put(j, 1);
			}
		}
		System.out.println(max);
	}
}
