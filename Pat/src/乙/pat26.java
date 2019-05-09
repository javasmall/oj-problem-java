package ““;

import java.util.Scanner;

public class pat26 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char a=sc.next().charAt(0);
		int lie=(n+1)/2;
		for(int i=0;i<lie;i++)
		{
			if(i==0||i==lie-1)
			{
				for(int j=0;j<n;j++)
				{System.out.print(a);}
				System.out.println();
			}
			else
			{
				for(int j=0;j<n;j++)
				{
					if(j==0||j==n-1)
					{System.out.print(a);}
					else
						{System.out.print(" ");}					
				}
				System.out.println();
			}
		}
	}
}
