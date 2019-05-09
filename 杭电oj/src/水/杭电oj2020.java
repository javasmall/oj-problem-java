package Ë®;
import java.util.Scanner;

public class º¼µçoj2020 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               int n=sc.nextInt();
               if(n==0)break;
               int c[]=new int[n];
               for(int i=0;i<n;i++)
               {
                   c[i]=sc.nextInt();
               }
               for(int i=0;i<n;i++) {
                   int t;
                   for(int j=i+1;j<n;j++)
                   {
                       
                       if(Math.abs(c[i])<Math.abs(c[j]))
                       {
                           t=c[i];
                           c[i]=c[j];
                           c[j]=t;
                       }
                   }
               }
               for(int i=0;i<n;i++)
               {
                   if(i==n-1) {System.out.println(c[i]);}
                   else
                   System.out.print(c[i]+" ");
               }
           }
    }
}