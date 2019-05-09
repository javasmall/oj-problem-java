package 贪心;
import java.util.Arrays;
import java.util.Scanner;

public class 杭电oj1009 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            double he=0.0;
            double m=sc.nextInt();
            int n=sc.nextInt();
            if(m==-1&&n==-1)break;
            double j[]=new double[n];//有多少榜
            double f[]=new double[n];//需要多少磅猫粮
            double k[]=new double[n];//频率
            for(int i=0;i<n;i++)
            {
                j[i]=sc.nextDouble();
                f[i]=sc.nextDouble();
                k[i]=j[i]/f[i];
            }
            sort(j,f,k,0,n-1);
            for(int i=n-1;i>=0;i--)
            {
                
                if(m>=f[i]) {he=he+j[i];m=m-f[i];}
                else {he=he+k[i]*m;break;}
                
            }
            System.out.println(String.format("%.3f", he));
        }
                
    }
    private static void sort(double[] a, double[] b, double[] c, int i, int n) {
        int low=i;
        int high=n;
        if(low>high) {return;}
        double k1=a[low];
        double k2=b[low];
        double k3=c[low];
        while(low<high)
        {
        while(low<high&&c[high]>=k3)//找到最右边的左侧比第一位小的。
        {
            high--;
        }
        a[low]=a[high];
        b[low]=b[high];
        c[low]=c[high];
        while(low<high&&c[low]<=k3)
        {
            low++;
            
        }
        a[high]=a[low];
        b[high]=b[low];
        c[high]=c[low];    
        }
       a[low]=k1;
       b[low]=k2;
       c[low]=k3;
       sort(a,b,c,i,low-1);
       sort(a,b,c,low+1,n);
        }

}