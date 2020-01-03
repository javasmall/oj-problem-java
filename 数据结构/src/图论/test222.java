package 图论;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class test222 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String numstr=sc.next();
		int number[]=new int[numstr.length()];
		Set<Integer> set=new HashSet<Integer>();
		for(int i=0;i<numstr.length();i++)
		{
			int team=Integer.parseInt(numstr.charAt(i)+"");
			set.add(team);
			number[i]=team;
		}
		int arr2[]=new int[set.size()];//arr需要反转才能得到
		int index=0;
		for(Integer n:set)
		{
			arr2[index++]=n;
		}
		Arrays.sort(arr2);//排序
		//反转
		int arr[]=new int[arr2.length];
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		String t1="";
		for(int i=0;i<arr2.length;i++)
		{
			arr[i]=arr2[arr2.length-1-i];
			map.put(arr[i],i);
			t1+=arr[i]+",";
		}
		t1=t1.substring(0,t1.length()-1);//多个，
		String s1="int[] arr = new int[]{"+t1+"};";
		String t2="";
		for(int i=0;i<number.length;i++)
		{
			t2+=map.get(number[i])+",";
		}
		t2=t2.substring(0,t2.length()-1);//多个，
		String s2="int[] index = new int[]{"+t2+"};";
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
