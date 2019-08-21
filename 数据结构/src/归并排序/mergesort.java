package πÈ≤¢≈≈–Ú;

public class mergesort {
	static int time=0;
	public static void main(String[] args)
	{
		int a[]= {3,2};
	    a=sort(a,0,a.length-1);
	   for(int i=0;i<a.length;i++)
	   {
		   System.out.print(a[i]+" ");
	   }
	   System.out.println();
	    System.out.println(time);
	}
	public static int[] sort(int a[],int left,int right)
	{
		int mid=(left+right)/2;
		if(left<right) {
				
		sort(a,left,mid);
		sort(a,mid+1,right);
		merge(a,left,mid,right);}
		return a;
	}

	private static void merge(int[] a, int left, int mid, int right) {
		int team[]=new int[right-left+1];
		int i=left;
		int j=mid+1;
		int k=0;
		while(i<=mid&&j<=right)
		{
			if(a[i]<=a[j]) {team[k++]=a[i++];}
			else
			{
				team[k++]=a[j++];time+=mid-i+1;
			}
		}
		while(i<=mid)
		{
			team[k++]=a[i++];
		}
		while(j<=right)
		{
			team[k++]=a[j++];
		}
		for(int q=0;q<k;q++)
		{
		     	a[q+left]=team[q];
		}	
	}
}
