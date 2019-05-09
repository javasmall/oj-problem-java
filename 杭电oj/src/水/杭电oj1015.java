package 水;
import java.util.Arrays;
import java.util.Scanner;
/*
 * 暴力破解
 */
public class 杭电oj1015 {
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);          
           while(sc.hasNext())
           {                                            
//              String str=sc.nextLine();
//              String str2[]=str.split(" ");
//              int a=Integer.parseInt(str2[0]);
//               String b=str2[1];
               int a=sc.nextInt();
               String b=sc.next();
               if(a==0&&b.equals("END"))break;
               char c[]=b.toCharArray();//储存
               Arrays.sort(c);
               int d[]=new int[c.length];            
               String answer="no solution";//默认没有结果，有结果后再换取
               for(int i=0;i<c.length;i++)
               {
                   d[i]=c[i]-'A'+1;
               }
               for(int i=0;i<c.length;i++)
               {               
                   for(int j=0;j<c.length;j++)
                   {
                       if(j!=i)  
                       for(int k=0;k<c.length;k++)
                       {
                           if(k!=j&&k!=i)                                                      
                           for(int l=0;l<c.length;l++)
                           {
                               if(l!=i&&l!=j&&l!=k)
                              for (int m=0;m<c.length;m++)
                               {
                                   if(m!=i&&m!=j&&m!=k&&m!=l) 
                                   {
                                   if(d[i]-d[j]*d[j]+d[k]*d[k]*d[k]-d[l]*d[l]*d[l]*d[l]+d[m]*d[m]*d[m]*d[m]*d[m]==a)
                                   answer=c[i]+""+c[j]+c[k]+c[l]+c[m];}
                                  // System.out.println(answer);}
                                
                               }
                           }
                       }                      
                   }
               }
               System.out.println(answer);
               
           }
    }
}