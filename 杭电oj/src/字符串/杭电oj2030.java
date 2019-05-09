package 字符串;
import java.util.*;  
public class 杭电oj2030{  
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();  
        sc.nextLine();  
        while(n-->0){  
            String str=sc.nextLine();  
            int numb=0;  
            byte b[]=str.getBytes();//将字符串转化为字节数组  
            for(int i=0;i<b.length;i++){  
                if(b[i]<0){  
                    numb++;  
                }  
            }  
            System.out.println(numb/2);  
        }  
    }  
}