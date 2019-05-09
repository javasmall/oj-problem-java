package Ë®;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class º¼µçoj2019 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            int n=sc.nextInt();//nÐÐ
            int m=sc.nextInt();
            if(m==0&&n==0) {break;}
            List list=new ArrayList();
            for(int i=0;i<n;i++)
            {
                int exm=sc.nextInt();
                list.add(exm);
            }
            list.add(m);
            list.sort(null);
            for(int i=0;i<n+1;i++)
            {
                if(i==n) {System.out.println(list.get(i));}
                else System.out.print(list.get(i)+" ");
            }
            
        }

}
}