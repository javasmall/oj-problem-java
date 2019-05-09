package 乙;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pat23 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String bad=sc.nextLine();//坏的
		//sc.nextLine();
		String input=sc.nextLine();
		char a[]=bad.toCharArray();
		List a2=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			a2.add(a[i]);
		}	
		char b[]=input.toCharArray();int bl=b.length;
		List list=new ArrayList();	
		for(int i=0;i<bl;i++)
		{
			char exam=b[i];
			//System.out.println(exam);			
			char big=(exam+"").toUpperCase().charAt(0);
			char small=(exam+"").toLowerCase().charAt(0);
			if(!a2.contains('+')) 
			{//大写字母不能用注意一定要是单引号
			   if(!a2.contains(big)&&!a2.contains(small))
			    {
				list.add(exam);	
				}			
			}
		     else {
				if(exam==small&&!a2.contains(big)&&!a2.contains(small))
				{
					list.add(exam);
				}
			}
			
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i));
		}
	}
}
