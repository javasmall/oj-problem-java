package kmp;

import java.util.Scanner;

public class hdu2203 {
static int []getnext(String a)
{
	
	int next[]=new int [a.length()];
	int k=-1,i=0;next[0]=-1;
	while(i<a.length()-1)
	{
		if(k==-1||a.charAt(k)==a.charAt(i))
		{
			i++;k++;next[i]=k;
		}
		else {
			k=next[k];
		}
	}
	return next;
}
static boolean kmp(String a,String b)
{
	int next[]=getnext(b);
	int i=0,j=0;
	while(i<a.length())
	{
		if(j==-1||a.charAt(i)==b.charAt(j))
		{
			i++;j++;
		}
		else {
			j=next[j];
		}
		if(j==b.length()) {return true;}
	}
	return false;
}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			String a=sc.nextLine();
			String b=sc.nextLine();
			String a2=a;
			int leng=b.length()*2;
			int value=leng/a.length()+1;
			for(int i=0;i<value;i++)
			{
				a2+=a;
			}
			boolean jud=kmp(a2, b);
			//System.out.println(a2+" "+b);
			if(jud) {System.out.println("yes");}
			else {
				System.out.println("no");
			}
		}

	}

}
