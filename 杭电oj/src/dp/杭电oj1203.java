package dp;
import java.util.Scanner;
/*
 * dp�㷨
 */
public class ����oj1203 {
    public static void main(String[] args)
    {        
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();//Ǯ��
            int m=sc.nextInt();//���ݸ���
            if(m==0&&n==0) {break;}
            float dp[][]=new float[n+1][m+1];
            int a[]=new int[m+1];//Ǯ
            float b[]=new float[m+1];//����
            for(int i=1;i<m+1;i++)
            {
                a[i]=sc.nextInt();
                b[i]=sc.nextFloat();
            }        
            
            for(int i=0;i<n+1;i++) {dp[i][0]=1;}//��ǮûѧУ
            int q=1;
            for(int i=0;i<m+1;i++) {if(a[i]==0)dp[0][i]=q*(1-b[i]);else dp[0][i]=q;}//��ѧУûǮ            
            for(int j=1;j<m+1;j++)//j����
                {
                    for(int i=1;i<n+1;i++)//iǮ�� 
                    
                    {if(i-a[j]>=0)
                    {
                        dp[i][j]=min(dp[i][j-1],dp[i-a[j]][j-1]*(1-b[j]));                        
                    }
                    else
                        dp[i][j]=dp[i][j-1];                    
                }                
            }
            float value=(100-dp[n][m]*100);
            System.out.println(String.format("%.1f", value)+"%");
            
           
        }
    }
    private static float min(float d, float e) {
        // TODO �Զ����ɵķ������
        return d>e?e:d;
    }
}