package ����˷�;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//Scanner sc=new Scanner(System.in);
		double a[][]= {{0.7,0.2},{0.3,0.8}};//��ʼ����a,��Ҫ�仯�ģ��仯һ�ξͳ�team
		double team[][]={{0.7,0.2},{0.3,0.8}};//��a��ʼ��ͬ������������󲻱䣬��n����
		for(int i=0;i<20;i++)//��n��
		{
			a=mutpate(a, team, 2);//a�仯
		}
		System.out.println(a[0][0]+" "+a[0][1]+" "+a[1][0]+" "+a[1][1]);//���a������
		double value1=a[0][0]*0.7+a[0][1]*0.3;//��һ������
		double value2=a[1][0]*0.7+a[1][1]*0.3;//�ڶ������ʣ�֮ǰ�ƹ���
		System.out.println(value1+" "+value2);//���

	}
	private static double[][] mutpate(double[][] a, double[][] b, int n) {//��������   nά��  n=2�ٱ���
		// TODO �Զ����ɵķ������
		double c[][]=new double [n][n];//��ʼһ������
		for(int i=0;i<n;i++)//����˷�����
		{
			for(int j=0;j<n;j++)
			{				
				for(int q=0;q<n;q++)
				{
					c[i][j]+=(a[i][q])*(b[q][j]);
				}
			}
		}
		return c;//����c����
	}
}
