package test乙;

import java.util.Scanner;

public class p1002 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner=new Scanner(System.in);
		String string=scanner.nextLine();
		int a=0;
		for(int i=0;i<string.length();i++)
		{
			a+=(int)(string.charAt(i)-'0');
		}
		String value[]= {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        String string2=String.valueOf(a);
        for(int i=0;i<string2.length();i++)
        {
        	System.out.print(value[Integer.parseInt(string2.substring(i, i+1))]+(i==string2.length()-1?"\n":" "));
        }
	}

}
