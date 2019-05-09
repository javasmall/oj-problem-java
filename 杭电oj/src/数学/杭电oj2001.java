package ÊýÑ§;
import java.util.Scanner;

public class º¼µçoj2001 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            double d=sc.nextDouble();
            double length=0.0;
            length=Math.sqrt(Math.pow(c-a, 2)+Math.pow(d-b, 2));
            System.out.println(String.format("%.2f", length));
        }
    }

}