package test乙;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean jude[]=new boolean[500];
		for(int i=0;i<n;i++)
		{
			int q=a[i];
			
			while(q!=1)
			{
				
				if(q%2==0) {q/=2;}
				else {q=(q*3+1)/2;}
				if(jude[q])break;
				jude[q]=true;
			}
		}
		Arrays.sort(a);
		String value="";
		for(int j=n-1;j>=0;j--)
		{
			if(!jude[a[j]])value+=a[j]+" ";
		}
		System.out.println(value.substring(0,value.length()-1));
	}
}
