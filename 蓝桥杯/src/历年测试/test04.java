package �������;

import java.util.Scanner;

public class test04 {
    static int x[]= {1,0,-1,0};//�� �� �� ��
    static int y[]= {0,1,0,-1};
    static int no=Integer.MAX_VALUE;
    static boolean b[][];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();//��   ����
		int n=sc.nextInt();//��  ����
		int a[][]=new int[n][m];
		b=new boolean[n][m];
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
				count+=a[i][j];
			}
		}
		dfs(a,0,0,a[0][0],count-a[0][0],1);//����     x y �Ѿ��е�Ǯ ʣ�¶�Ǯ
		if(no==Integer.MAX_VALUE) {System.out.println(0);}
		else
		{
			System.out.println(no);
		}
	}
	private static void dfs(int[][] a, int i, int j, int k, int count,int time) {
		if(k==count) {if(time<no) {no=time;}}
		else if(k>count) {}
		else
		{
			for(int q=0;q<4;q++)
			{
				if(i+x[q]>=0&&i+x[q]<a.length&&j+y[q]>=0&&j+y[q]<a[0].length)//��������
				{
					if(!b[i+x[q]][j+y[q]])//û�߹�
					{
						b[i+x[q]][j+y[q]]=true;
						dfs(a,i+x[q],j+y[q],k+a[i+x[q]][j+y[q]],count-a[i+x[q]][j+y[q]],time+1);
						b[i+x[q]][j+y[q]]=false;
					}
				}
			}
		}
		
	}

}
