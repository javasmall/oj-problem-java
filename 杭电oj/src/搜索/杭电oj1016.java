package 搜索;
import java.util.Scanner;
public class 杭电oj1016 {
    static boolean b[]=new boolean[21];
    static int time=0;//层数
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int Case=1;
      while(sc.hasNext())
      {
          int m=sc.nextInt();//个数
          int a[]=new int[m];
          a[0]=1;          
          System.out.println("Case "+Case+++":");
          dfs(m,a);    
          System.out.println();
          //judgel(m);//判断素数
      }
    }
    private static boolean judgel(int m) {
        for(int i=2;i<m;i++)
        {
            if(m%i==0) {return false;}
        }
        return true;                
    }
private static void dfs(int m, int[] a) {
    if(time==m-1) {for(int i=0;i<m;i++ ) 
    {if(i==m-1)System.out.print(a[i]);else System.out.print(a[i]+" ");}System.out.println();}
    else
    for(int i=2;i<m+1;i++)
        {
        if(!b[i])
        {
            if(time==m-2)
            {
                b[i]=true;
                if(judgel(i+a[time])&&judgel(i+1))
                {
                  a[++time]=i;
                  dfs(m,a);
                  time--;
                }
                b[i]=false;
            }
            else
            {
            b[i]=true;
            if(judgel(i+a[time]))
            {
              a[++time]=i;
              dfs(m,a);
              time--;
            }
            b[i]=false;
          }    
        }
        }        
    }
}