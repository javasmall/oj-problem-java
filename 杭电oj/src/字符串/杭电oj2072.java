package �ַ���;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ����oj2072 {
    public static void main(String []args){  
        Scanner sc=new Scanner(System.in); 
        while(sc.hasNext())
        {
            String a=sc.nextLine();
            
            boolean bre = false;
            String b[]=a.split(" ");
            for(int i=0;i<b.length;i++)
            {
                if(b[i].contains("#"))
                    bre=true;
            }
            if(bre)break;
            List list=new ArrayList();
            /*
             * �㲻ͬ������
             */
            for(int i=0;i<b.length;i++)
            {
                if(!list.contains(b[i]))
                    list.add(b[i]);
            }
            if(list.contains(""))
            {
                System.out.println(list.size()-1);
            }
            else
 /*
  * �㲻ͬ��ĸ��           
  */
//            String c="";//ȥ���ո�
//            for(int i=0;i<b.length;i++)
//            {
//                c+=b[i];
//            }
//            char d[]=c.toCharArray();
//            for(int q=0;q<d.length;q++)    
//            {
//                if(!list.contains(d[q]))
//                {                   
//                list.add(d[q]);                                   
//                }    
//            }
            System.out.println(list.size());
        }
    }

}