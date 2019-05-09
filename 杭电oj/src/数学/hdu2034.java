package 数学;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hdu2034 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			if(a==0&&b==0)break;
			List<Integer>list=new ArrayList<>();
			for(int i=0;i<a;i++)
			{
				int team=sc.nextInt();
				list.add(team);
			}
			for(int i=0;i<b;i++)
			{
				int team=sc.nextInt();
				if(list.contains(team))
				{
					list.remove((Integer)team);
				}
			}
			list.sort(null);
			if(list.size()==0)System.out.println("NULL");
			else {
				for(int j=0;j<list.size();j++)
				{
					System.out.print(list.get(j)+" ");
				}
				System.out.println();
			}
		}
	}

}
