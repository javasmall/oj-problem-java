package 搜索;

import java.util.Scanner;

public class testD {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int  m=sc.nextInt();
		int n=sc.nextInt();
		int map[][]=new int[m][n];
		int value[][]=new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				map[i][j]=sc.nextInt();
			}
		}
		
		
	}
	static void moni(int map[][],int m,int n)
	{
		int value[][]=new int[map.length][map[0].length];
		for(int i=0;i<m-1;i++)//行
		{
			for(int j=0;j<n;j++)
			{
				if(map[i][j]==1)
				{
					map[i][j]=0;value[i+1][j]=1;
					map[i+1][j]=Math.abs(map[i+1][j]-1);//切换
					if(j-1>=0) {map[i+1][j-1]=Math.abs(map[i+1][j-1]-1);}
					if(j+1<n) {map[i+1][j+1]=Math.abs(map[i+1][j+1]-1);}
					if(i+2<m) {map[i+2][j]=Math.abs(map[i+2][j]-1);}
				}
			}
		}
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(map[m-1][i]==1) {System.out.println("IMPOSSIBLE");b=true;break;}
		}
        if(!b) {
        	for(int i=0;i<m;i++)
        	{
        		for(int j=0;j<n;j++)
        		{
        			if(j==n-1) {System.out.println(value[i][j]);}
        			else
        			System.out.print(value[i][j]+" ");
        		}
        	}
        }
	}
}
