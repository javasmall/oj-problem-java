package Ì°ÐÄ;
import java.util.Scanner;

public class º¼µçoj1008 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        
        while(sc.hasNext())
        {
            int time=0;
            int n=sc.nextInt();
            if(n==0)break;
            int a[]=new int [n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                if(i==0) {time=time+a[0]*6;}
                else {
                    if(a[i]-a[i-1]>0) {time=time+(a[i]-a[i-1])*6; }
                    if(a[i]-a[i-1]<0) {time=time+(a[i-1]-a[i])*4; }
                }
            }
            time=time+n*5;
            System.out.println(time);
            
        }
    }

}