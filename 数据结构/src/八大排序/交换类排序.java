package �˴�����;

import java.util.Arrays;

public class ���������� {
	
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
	    //���������˳��һ�����ܻ죬������������Խ�磡����very important����
		if(low>high)
			return;
		int k=a[low];//ȡ������һ����Ϊ���������Ҫ����඼����С���Ҳ඼������
		while(low<high)
		{
			while(low<high&&a[high]>=k)
			{
				high--;
			}
			//�������ҵ���һ������С����
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
