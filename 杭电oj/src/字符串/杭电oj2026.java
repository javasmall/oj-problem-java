package ×Ö·û´®;
import java.util.Scanner;

public class º¼µçoj2026 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               String a=sc.nextLine();
               String d="";
               String b[]=a.split(" ");
               for(int i=0;i<b.length;i++)
               {
                   char c[]=b[i].toCharArray();
                   c[0]=(char)(c[0]-32);
                   for(int j=0;j<c.length;j++)
                   {
                       d+=c[j];
                   }
                   if(i!=b.length-1)
                   d+=" ";
               }
               System.out.println(d);
           }
    }

}