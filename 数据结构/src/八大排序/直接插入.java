package 八大排序;

import java.util.Arrays;

public class 直接插入 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,25,8,7,45,2,8,18,9,88,3};
		int b[]=new int[10];
		a=insertsort(a);
		System.out.println(Arrays.toString(a));
		System.out.println();
		b=shellsort(a);
		System.out.println(Arrays.toString(a));
	}
	
	
	static int [] insertsort (int a[])
	{
		int team=0;
		for(int i=1;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a));
			team=a[i];
			for(int j=i-1;j>=0;j--)
			{
				
				if(a[j]>team)
				{
					a[j+1]=a[j];
					a[j]=team;	
				}	
				else {
					break;
				}
			}
		}
		return a;		
	}
	static int [] shellsort (int a[])
	{
		int d=a.length;
		int team=0;//临时变量
		for(;d>=1;d/=2)
		for(int i=d;i<a.length;i++)
		{
			
			System.out.println(Arrays.toString(a));
			team=a[i];
			for(int j=i-d;j>=0;j-=d)
			{				
				if(a[j]>team)
				{
					a[j+d]=a[j];
					a[j]=team;	
				}
				else {
					break;
				}
			}
		}
		return a;		
	}

}
