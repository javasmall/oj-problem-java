package ÊýÑ§;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class º¼µçoj1264 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        Set<String> set=new HashSet();
        while(sc.hasNext())
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();            
            if(change(a,c)) {int team=a;a=c;c=team;}
            if(change(b,d)) {int team=b;b=d;d=team;}
            if(a==-1)
            {    
                System.out.println(set.size());
                set.clear();
            }
            if(a==-2) {
                System.out.println(set.size());
                break;
            }
            else
            for(int i=a;i<c;i++)
            {
                for(int j=b;j<d;j++)
                {
                    set.add(i+" "+j);
                    
                }
            }            
        }
    }
    private static boolean change(int a, int c) {
        return a>c;
    }
}