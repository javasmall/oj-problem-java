package 递归;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 杭电oj2062 {
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in); 
        long a[]= new long [21];//a[n]表示个数；
        a[1]=1;
        for(int i=2;i<21;i++)
        {
            a[i]=i*(a[i-1]+1);
        
        }
        while(sc.hasNext())
        {
            
            long m=sc.nextLong();
            
            long n=sc.nextLong();
            if(m<=0||m>20||n<=0||n>a[(int) m]) {break;}
            List list=new ArrayList();
            for(int i=1;i<m+1;i++)
            {
                list.add(i);
            }
            
            out(m,n,a,list);
            System.out.println();
            
        }
       

    }
    private static void out(long m, long n,long a[],List list) {
        //m第几个    i总个数    n第几个
        if(m==1) {System.out.print(list.get((int) (m-1)));}
        else {
        long a1=a[(int) m]/m;
        long a2=(n-1)/a1+1;//第一位数
        int a3=(int)a2;
        if(n%a1!=1) {

            System.out.print(list.get(a3-1)+" ");
            list.remove(a3-1);
            out(m-1,(n-1)%a1,a,list);
        }
        else
            System.out.print(list.get(a3-1));
    }        
    }
}