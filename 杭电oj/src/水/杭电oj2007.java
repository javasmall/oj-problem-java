package 水;
import java.util.Scanner;
/*
 * m和n需要判断
 */
public class 杭电oj2007
 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               int m=sc.nextInt();
               int n=sc.nextInt();
               if(m>n)
               {
                   int team=m;
                   m=n;n=team;
               }
               long ou=0;
              long ji=0;
               for(int i=m;i<n+1;i++)
               {
                   if(i%2==0)
                   {
                       ou+=i*i;
                   }
                   else
                       ji+=i*i*i;
               }
               System.out.println(ou+" "+ji);
           }
    }
}