package �ݹ�;
import java.util.Scanner;

public class ����oj2048 {
     public static void main(String[] args){  
            Scanner sc=new Scanner(System.in);  
            
            double a[]=new double[21];
            a[1]=0;
            a[2]=1;
           // double q[]=new double[20];
            int n=sc.nextInt();//������������
            
            for(int i=3;i<=20;i++)
            {
                    a[i]=(i-1)*(a[i-1]+a[i-2]);
            }
            for(int j=0;j<n;j++)
            {
                int m=sc.nextInt();//�μӸ���
                double exam=a[m];
                for(int i=1;i<m+1;i++)
                {
                    exam=exam/i;
                }
                exam=exam*100;
                System.out.println(String.format("%.2f", exam)+"%");
                
            }
            
     }

}