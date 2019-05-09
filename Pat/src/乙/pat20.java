package 乙;

/*
 * 思想太高深
 * 
 * 
 */
import java.util.Arrays;
import java.util.Scanner;

public class pat20 {
	static int p=0;
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 p=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=0;
		Arrays.sort(a);	
		int first=0;int end=n-1;

		if(a[end]<a[0]*p) {max=0;}
		else
		for(int i=0;i<n;i++)
		{
			for(int j=i+max;j<n;j++)
			{
				if(a[j]>a[i]*p)
				{break;}
					max++;
				
			}
		}
		//max=end-first+1;
		System.out.print(max);
	}
}
