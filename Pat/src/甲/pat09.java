package ¼×;

import java.util.Scanner;

public class pat09 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		int first[]=new int[n];
		int value[]=new int[n];
		int heap[]=new int[n];
		int insert[]=new int[n];
		for(int i=0;i<n;i++)
		{
			first[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			value[i]=sc.nextInt();
		}
		heap=first.clone();
		insert=first.clone();
//		for(int i=0;i<n;i++)
//		{
//			System.out.print(insert[i]);
//		}
		for(int i=1;i<n;i++)
		{
			
			for(int j=n-1;j>=i;j--)
			{
				int x=insert[j];
				if(x<insert[j])
				{
					insert[i]=insert[j];
					insert[j]=x;
					
					System.out.println(i+" "+j);
					break;
				}
			}
//			if(value.equals(insert))
//			{
//				System.out.println("Insertion Sort");
//			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(insert[i]);
		}
	}

}
