package 并查集;
import java.util.Scanner;

public class 杭电1232 {
	static int value=0;//表示当前已经连接的城镇数
	static int a[]=new int [1001];
	public static void main(String[] args) {    
		Scanner sc = new Scanner(System.in);         
        while(sc.hasNext())
        {
        	int n=sc.nextInt();//城镇个数
        	a=new int[n+1];
        	if(n==0)break;
        	int m=sc.nextInt();//道路个数
        	for(int i=0;i<m;i++)
        	{
        		int a1=sc.nextInt();//两个城镇
        		int a2=sc.nextInt();
        		union(a1,a2);
        	}
        	System.out.println(n-1-value);       	
        	value=0;
        }
	}
	private static void union(int a1, int a2) {
		int q1=search(a1);
		int q2=search(a2);
			if(q1==q2){}//如果根相等，那么什么都不做
			else
			{
				value++;
				a[q2]=q1;//a2指向a1先不考虑优化
				a[q1]--;
			}
	}
	private static int search(int a1) {
		if(a[a1]<=0) {return a1;}
		else
			return search(a[a1]);		
	}	
}
