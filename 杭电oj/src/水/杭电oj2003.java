package Ë®;

import java.util.Scanner;

public class º¼µçoj2003 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           while(sc.hasNext())
           {
               double a=sc.nextDouble();
               double b=Math.abs(a);
               System.out.println(String.format("%.2f", b));
           }
    }

}