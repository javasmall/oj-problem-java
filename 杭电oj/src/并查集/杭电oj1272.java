package 并查集;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class 杭电oj1272 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
          // String value="YES";
           Set e=new HashSet();
           //List d = new ArrayList();
           int bian=0,dian=0;
           while(sc.hasNext())
           {                  
               int a=sc.nextInt();
               int b=sc.nextInt();
               if(a==-1&&b==-1)break;
               if(a==0&&b==0) 
               {if(e.size()==bian+1||bian==0)System.out.println("Yes"); else System.out.println("No");e=new HashSet();;bian=0;dian=0;}           
               else {
                  bian++;
                  e.add(a);
                  e.add(b);
               }               
           }
    }
}