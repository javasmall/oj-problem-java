package dp;
import java.util.Scanner;

public class ����oj1024 {
    public static void main(String[] args) {                
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               int m=sc.nextInt();//����
               int n=sc.nextInt();//Ԫ�ظ���
               int a[]=new int[n+1];//Ԫ��ֵ
                int dp[][]=new int[2][n+1];
                int value[]=new int[n+1];
            int q=0;int max=0;
               for(int i=1;i<n+1;i++)
               {
                   a[i]=sc.nextInt();
                  
               }          
               //value[1]=-10000;
               for(int i=1;i<m+1;i++)
               {
                   
                   for(int j=i;j<n+1;j++)
                   { 
                       if(j==i) {dp[i%2][j]=dp[(i-1)%2][j-1]+a[j]; value[j]=dp[i%2][j];}
                       else if(j>i)
                       {
                           
//                           for(int k=i-1;k<=j-1;k++)//�ҵ���ǰdp���Ҳ�����
//                           {
//                               q=0;max=a[j];//�Ҳ����
//                               for(int k2=j;k2>k;k2--)
//                               {
//                                   q+=a[k2];
//                                   if(q>max) {max=q;}
//                                  
//                               }
//                               if(value[j]<max+dp[(i-1)%2][k])
//                                   value[j]=max+dp[(i-1)%2][k];
//                               
//                           }
                          
                           value[j]=max(dp[(i-1)%2][j-1]+a[j],value[j-1]+a[j]);//����ȡKʱ���������ȡheֱ������        ���ַ�ʽ
                           dp[i%2][j]=max(dp[i%2][j-1],value[j]);//���õ�J�����õ�J���Ƚ�
                       }
                   }
               }
              
               System.out.println(dp[m%2][n]);
           }
        }

        private static int max(int i, int value) {
            
            return i>value?i:value;
        }
    }