package ��;

import java.util.Scanner;
public class pat7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         String a1=sc.next();int a2=sc.nextInt();
         char[] b1=a1.toCharArray();
         int a=0;//����
         String c="";//��ֵ
         for(int i=0;i<b1.length;i++)
         {
        	 a=a*10+Integer.parseInt(b1[i]+"");//��һ��
        	 int chu=a/a2;//chu
        	 c+=chu;
        	 a=a-a2*chu;//a�������
         }
         if(c.charAt(0)=='0')//��ֹ��һ���������ַ���Ϊ0
         {
        	 c=c.substring(1);
         }
                           
         System.out.println(c+" "+a);
	}
}
