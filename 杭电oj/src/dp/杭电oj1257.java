package dp;
import java.util.Scanner;

public class 杭电oj1257 {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int max=0;//最大数列长度
        int n=sc.nextInt();
        int dp[]=new int[n];//以第i个元素结尾的最大子数列。（最后一个一定是a[i]的）    
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        dp[0]=1;//第一元素构成1
        
        for(int i=1;i<n;i++)
        {//计算dp[i];
            int m=0;//每次都要初始化计算;m的实际意义为临时变量，为了找比自己小的元素的最大数列，然后拼凑成为第i个最大。
            for(int j=0;j<i;j++)//从0到当前元素循环
            {
                if(dp[j]>m&&a[j]<a[i])
                {
                    m=dp[j];    //这样做为了找到最大的那个dp【j】，并且那个a[j]<a[i];则j的那串加上i就构成以i结尾的最大递增数列
                }
                dp[i]=m+1;//相当于最大的第J串后面接了一个元素。
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