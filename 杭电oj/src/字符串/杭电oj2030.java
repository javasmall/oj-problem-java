package �ַ���;
import java.util.*;  
public class ����oj2030{  
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();  
        sc.nextLine();  
        while(n-->0){  
            String str=sc.nextLine();  
            int numb=0;  
            byte b[]=str.getBytes();//���ַ���ת��Ϊ�ֽ�����  
            for(int i=0;i<b.length;i++){  
                if(b[i]<0){  
                    numb++;  
                }  
            }  
            System.out.println(numb/2);  
        }  
    }  
}