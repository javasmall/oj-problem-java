package µÝ¹é;
import java.util.Scanner;

public class º¼µçoj2046 {
     public static void main(String[] args){  
            Scanner sc=new Scanner(System.in);  
            while(sc.hasNext())
            {
                int n=sc.nextInt();
                if(n>50||n<=0) {break;}
                long a[]=new long[n];
                for(int i=0;i<n;i++)
                {
                    if(i==0) {a[0]=1;}
                    if(i==1) {a[1]=2;}
                    
                    if(i>=2) a[i]=a[i-1]+a[i-2];
                }
                System.out.println(a[n-1]);
            }
     }
}