package ×Ö·û´®;
import java.util.Scanner;

public class º¼µçoj2064 {
    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long[] exa=new long[65];
        exa[1]=2;
        for(int i=2;i<65;i++)
        {
            exa[i]=exa[i-1]*3+2;
        }
        while(sc.hasNext())
        {
             int n=sc.nextInt();
             if(n<1||n>35) {break;}
             else
        //hannuota(3,'a','b','c');//64¸öa-c
        System.out.println(exa[n]);
    }

}}