package ÊýÑ§;
import java.util.Scanner;

public class º¼µçoj1018 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double pi=Math.PI;
        
        double e=Math.E;
        
        for(int i=0;i<n;i++)
        {
            long b=sc.nextLong();
            if(b==0) {System.out.println(1);}
            else {
            double value=Math.log10(Math.sqrt(2*pi*b))+b*Math.log10(b/e);
            System.out.println((int)(value)+1);}
        }
    }
}