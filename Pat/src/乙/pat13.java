package 乙;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class pat13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int  a[]=new int[10];
		int number=0;
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
			for(int j=0;j<a[i];j++)
			{number++;}
		}
		int b[]=new int[number];
		int number2=0;
	    for(int i=0;i<10;i++)
			{				
				for(int j=0;j<a[i];j++)
				{b[number2++]=i;}
			}
	    Arrays.sort(b);
	    int first=0;
	    while(b[first]==0)
	    {
	    	first++;
	    }
	    int team=b[first];
	    b[first]=b[0];
	    b[0]=team;
	    for(int i=0;i<number;i++)
	    {
	    	System.out.print(b[i]);
	    }	    
		}
}
