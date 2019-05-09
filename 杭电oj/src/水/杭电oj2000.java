package Ë®;
import java.util.Arrays;
import java.util.Scanner;

public class º¼µçoj2000 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String a=sc.nextLine();
            char b[]=a.toCharArray();
            Arrays.sort(b);
            for(int i=0;i<b.length;i++)
            {
                if(i==b.length-1) System.out.println(b[i]);
                else 
                    System.out.print(b[i]+" ");
            }
        }
    }
}