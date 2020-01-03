package 八大排序;

import java.util.Arrays;

public class 交换类排序 {
	
	public static void main(String[] args) {
		
		int a[]= {2,8,9,3,7,6,12,4};
		maopaosort(a);
		System.out.println(Arrays.toString(a));
		int b[]= {2,8,9,3,7,6,12,4};
		quicksort(b, 0, b.length-1);
		System.out.println(Arrays.toString(b));
	}

	private static void  maopaosort(int[] a) {
		// TODO Auto-generated method stub
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1])
				{
					int team=a[j];
					a[j]=a[j+1];
					a[j+1]=team;
				}
			}
		}
	}
	private static void quicksort(int [] a,int left,int right)
	{
		int low=left;
		int high=right;
	    //下面两句的顺序一定不能混，否则会产生数组越界！！！very important！！
		if(low>high)
			return;
		int k=a[low];//取最左侧的一个作为衡量，最后要求左侧都比它小，右侧都比它大。
		while(low<high)
		{
			while(low<high&&a[high]>=k)
			{
				high--;
			}
			//这样就找到第一个比它小的了
			a[low]=a[high];
			while(low<high&&a[low]<=k)
			{
				low++;
			}
			a[high]=a[low];			
		}
		a[low]=k;
		quicksort(a, left, low-1);
		quicksort(a, low+1, right);		
	}
}
