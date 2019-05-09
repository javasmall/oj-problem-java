package 数学;
import java.util.Arrays;
import java.util.Scanner;
public class 杭电oj1280 {
    static int a[]=new int[3002];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);        
        int b[]=new int[5000000];        
        while(sc.hasNext())
        {
          int n=sc.nextInt();//数据个数
          int m=sc.nextInt();//前m大
          
          int number=0;
          for(int i=0;i<n;i++)
          {
              a[i]=sc.nextInt();
          }
          for(int i=0;i<n;i++)
          {
              for(int j=i+1;j<n;j++)
              {
                b[number++]=(a[i]+a[j]);
              }
          }
          Arrays.sort(b, 0, (n-1)*n/2);
          int x=number-1;
          for(int i=0;i<m;i++)
          {
              if(i==m-1)System.out.println(b[x-i]);
              else
          System.out.print(b[x-i]+" ");
          }
        
        }
    }
}