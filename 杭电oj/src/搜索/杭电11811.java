package 搜索;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
public class 杭电11811 {
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
			if(str.equals("0"))//b m 1 11
			{				
				Queue<Integer>q1=new ArrayDeque<>();
				q1.add(1);
				jud[1]=true;
				boolean bool=false;
				while(!q1.isEmpty())
				{
				    int team=q1.poll();
				    if(team==12) {System.out.println("Yes.");bool=true;break;}
				    else
				    {
				    	for(int j=0;j<list[team].size();j++)
				    	{
				    		int t2=list[team].get(j);
				    		if(!jud[t2])
				    		{
				    			q1.add(t2);
				    			jud[t2]=true;
				    		}
				    		else
				    		{continue;}
				    	}
				    }    
				}
				if(!bool)
				System.out.println("No.");
				for(int i=0;i<26;i++)
				{
					list[i]=new ArrayList<>();
				}
				jud=new boolean[26];
				
			}
			else {
			char font=str.charAt(0);
			char end=str.charAt(str.length()-1);
			if(font!=end)
			list[(int)(font-'a')].add((int)(end-'a'));	
			}
		}
	}
}
