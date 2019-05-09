package ×Ö·û´®;
import java.util.Scanner;
import java.util.regex.Pattern;
public class º¼µçoj2043 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String a=scan.nextLine();
        
        int m=Integer.parseInt(a);
        //String a=scan.nextLine();
       // System.out.println("a"+a);
        while(m--!=0){
            String s=scan.nextLine();
                int count=0;
                if(s.length()>7&&s.length()<17){
                    int a1=0;int a2 = 0;int a3 = 0;int a4 = 0;
//                   if (Pattern.compile("[A-Z]").matcher(s).find())
//                         count++;
//                   if (Pattern.compile("[a-z]").matcher(s).find())
//                     count++;
//                   if (Pattern.compile("[0-9]").matcher(s).find())
//                     count++;
//                   if (Pattern.compile("[~!@#$%^]").matcher(s).find())
//                     count++;
                for(int i=0;i<s.length();i++)
           {
                    if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
                    a1=1;
                else if(s.charAt(i)>='a'&&s.charAt(i)<='z')
                    a2=1;
                else if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                    a3=1;
                else a4=1;
            }
                 count=a1+a2+a3+a4;
                    }
            if(count>=3)
                System.out.println("YES");
            else
                System.out.println("NO");  
        }          
    }   
}