package 搜索;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 杭电1181dfs {

	static boolean judgle=false;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		List<Integer>list[]=new ArrayList[26];
		for(int i=0;i<26;i++)
		{
			list[i]=new ArrayList<>();
		}
		boolean jud[]=new boolean[26];
		while(sc.hasNext())
		{
			String str=sc.nextLine();
			if(str.equals("0")) {
				dfs(list,1,jud);
				if(judgle) {System.out.println("Yes.");}
				else System.out.println("No.");
				//初始化参数
				judgle=false;
				jud=new boolean[26];
				for(int i=0;i<26;i++)
				{
					list[i]=new ArrayList<>();
				}
			}
			else {
				char font=str.charAt(0);
				char end=str.charAt(str.length()-1);
				if(font!=end)
				list[(int)(font-'a')].add((int)(end-'a'));				
			}
		}

	}
	private static void dfs(List<Integer>[] list, int i, boolean[] jud) {
		// TODO 自动生成的方法存根
		if(i==12) {judgle=true;}
		if(!judgle)
		{
			for(int j=0;j<list[i].size();j++)
			{
				if(!jud[list[i].get(j)])
				{
					jud[list[i].get(j)]=true;
					dfs(list, list[i].get(j), jud);
					jud[list[i].get(j)]=false;
				}
			}
		}
		
	}

}
