package 乙;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*
 * 数字与字符串
 */
public class pat11 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int a[]=new int[10];//代表0-9十个字母
		Set set=new HashSet();
		int leng=n.length();//字符串的具体长度
		for(int i=0;i<leng;i++)
		{
			char exam=n.charAt(i);
			int exam2=(exam-'0');//转换类型
			set.add(exam2);
			a[exam2]++;
		}
		for(Object set1:set)
		{
			int exam=(int)set1;
			System.out.println(exam+":"+a[exam]);
		}
	}
}
