package 乙;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class pat19 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		a=a.toUpperCase();
		b=b.toUpperCase();
		char a1[]=a.toCharArray();
		char b1[]=b.toCharArray();
		Set set=new HashSet();
		List list=new ArrayList();
		for(int i=0;i<b1.length;i++)
		{
			set.add(b1[i]);
		}
		for(int i=0;i<a1.length;i++)
		{
			if(!set.contains(a1[i])&&!list.contains(a1[i]))
			{
				list.add(a1[i]);
			}
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}

	}
}
