package �㷨ѵ��;

import java.util.Scanner;

public class k���� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();//�����ܹ�����ĸ��
		int l=sc.nextInt();//λ�� 
		int dp[][]=new int[l][k];
		for(int i=0;i<k;i++)
		{
			dp[0][i]=1;//��ʼ��
		}
		for(int i=1;i<l;i++)
		{
			//int count=0;
			for(int j=0;j<k;j++)
			{
				for(int q=0;q<k;q++)
				{
					if(Math.abs(j-q)!=1)
					dp[i][j]+=dp[i-1][q];
					dp[i][j]%=1000000007;
				}
			}
		}
		int count=0;
		for(int j=1;j<k;j++)
		{
			count+=dp[l-1][j];
			count%=1000000007;
		}
		System.out.println(count);

	}

}
