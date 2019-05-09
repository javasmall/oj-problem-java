package Ë®;

import java.util.Scanner;

public class º¼µçoj2081 {
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        sc.nextLine();
        for(int q=0;q<n;q++)
        {
            String a=sc.nextLine();
            String b=6+a.substring(6, 11);
            System.out.println(b);
        }
        }

}