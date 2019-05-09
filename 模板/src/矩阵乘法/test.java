package 矩阵乘法;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//Scanner sc=new Scanner(System.in);
		double a[][]= {{0.7,0.2},{0.3,0.8}};//初始矩阵a,是要变化的，变化一次就乘team
		double team[][]={{0.7,0.2},{0.3,0.8}};//和a初始相同，但是这个矩阵不变，乘n次用
		for(int i=0;i<20;i++)//乘n次
		{
			a=mutpate(a, team, 2);//a变化
		}
		System.out.println(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);//输出a矩阵结果
		double value1=a[0][0]*0.7+a[0][1]*0.3;//第一个概率
		double value2=a[1][0]*0.7+a[1][1]*0.3;//第二个概率（之前推过）
		System.out.println(value1+" "+value2);//输出

	}
	private static double[][] mutpate(double[][] a, double[][] b, int n) {//两个矩阵   n维数  n=2再本题
		// TODO 自动生成的方法存根
		double c[][]=new double [n][n];//初始一个矩阵
		for(int i=0;i<n;i++)//矩阵乘法规则
		{
			for(int j=0;j<n;j++)
			{				
				for(int q=0;q<n;q++)
				{
					c[i][j]+=(a[i][q])*(b[q][j]);
				}
			}
		}
		return c;//返回c矩阵
	}
}
