package ×Ö·û´®;
import java.util.Scanner;
public class º¼µçoj2091 {
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in);     
        int u=1;
        while(sc.hasNext())
        {
            u++;
            String a=sc.nextLine();
            
            String b[]=a.split(" ");
            char c=b[0].charAt(0);
            if(c=='@') {break;}                        
            int d=Integer.parseInt(b[1]);
      if(u>2)
           {System.out.println();}
            for(int i=0;i<d;i++)
            {
                if(i==d-1)
                {
                    for(int j=0;j<2*d-1;j++)
                    {System.out.print(c);}
                }
                else {
                    for(int j=0;j<=(2*d-1)/2+i;j++)
                if(i==Math.abs(j-(2*d-1)/2))
                {
                    System.out.print(c);
                }
                else 
                    System.out.print(" ");
                }
                
                System.out.println();
                
            }
            
            
        }
    }    
            
 }