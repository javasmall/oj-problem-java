package test��;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p1008 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int m=sc.nextInt();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int team=sc.nextInt();
			list.add(team);
		}
		m=m%n;
		for(int i=0;i<m;i++)
		{
			int team=list.get(list.size()-1);
			list.remove(list.size()-1);
			list.add(0, team);
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(list.get(i)+(i==list.size()-1?"":" "));
		}
		System.out.println();


	}

}
