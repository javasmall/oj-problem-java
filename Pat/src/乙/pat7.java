package 乙;

import java.util.Scanner;
public class pat7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         String a1=sc.next();int a2=sc.nextInt();
         char[] b1=a1.toCharArray();
         int a=0;//余数
         String c="";//数值
         for(int i=0;i<b1.length;i++)
         {
        	 a=a*10+Integer.parseInt(b1[i]+"");//下一层
        	 int chu=a/a2;//chu
        	 c+=chu;
        	 a=a-a2*chu;//a变成余数
         }
         if(c.charAt(0)=='0')//防止第一个不够除字符串为0
         {
        	 c=c.substring(1);
         }
                           
         System.out.println(c+" "+a);
	}
}
