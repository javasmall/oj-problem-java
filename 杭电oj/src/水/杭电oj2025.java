package Ë®;
import java.util.Scanner;
public class º¼µçoj2025 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               String a=sc.nextLine();
               char b[]=a.toCharArray();
               char c='a';
               String d="";
               for(int i=0;i<b.length;i++)
               {
                   if(b[i]>c)
                   {
                       c=b[i];
                   }
               }
               for(int i=0;i<b.length;i++)
               {
                   if(b[i]==c)
                   {d+=b[i]+"(max)";}
                   else
                       d+=b[i];
               }
               System.out.println(d);               
           }
    }
}