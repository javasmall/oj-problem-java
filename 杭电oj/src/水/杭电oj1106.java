package Ë®;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class º¼µçoj1106 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String a=sc.nextLine();
            String b[]=a.split("5");
            List list=new ArrayList();
            for(int i=0;i<b.length;i++)
            {
                list.add(b[i]);
            }
            while(list.contains(""))
            {
               list.remove("");
            }
            int c[]=new int[list.size()];
            for(int i=0;i<list.size();i++)
            {
                c[i]=Integer.parseInt((String) list.get(i));
            }
            Arrays.sort(c);
            for(int i=0;i<list.size();i++)
            {
                if(i==list.size()-1) {System.out.println(c[i]);}
                else System.out.print(c[i]+" ");
            }            
       }                                    
    }
}