package dp;
import java.util.Scanner;

public class ����oj1257 {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int max=0;//������г���
        int n=sc.nextInt();
        int dp[]=new int[n];//�Ե�i��Ԫ�ؽ�β����������С������һ��һ����a[i]�ģ�    
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        dp[0]=1;//��һԪ�ع���1
        
        for(int i=1;i<n;i++)
        {//����dp[i];
            int m=0;//ÿ�ζ�Ҫ��ʼ������;m��ʵ������Ϊ��ʱ������Ϊ���ұ��Լ�С��Ԫ�ص�������У�Ȼ��ƴ�ճ�Ϊ��i�����
            for(int j=0;j<i;j++)//��0����ǰԪ��ѭ��
            {
                if(dp[j]>m&&a[j]<a[i])
                {
                    m=dp[j];    //������Ϊ���ҵ������Ǹ�dp��j���������Ǹ�a[j]<a[i];��j���Ǵ�����i�͹�����i��β������������
                }
                dp[i]=m+1;//�൱�����ĵ�J���������һ��Ԫ�ء�
                if(max<dp[i])
                {
                    max=dp[i];
                }
            
            }
        }
        System.out.println(max);
        
        }
    }

}