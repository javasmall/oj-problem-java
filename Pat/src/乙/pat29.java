package 乙;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pat29 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String a=sc.next();//可以买的
	    String b=sc.next();//想要买的
	    List list=new ArrayList();
	    char a1[]=a.toCharArray();
	    char b1[]=b.toCharArray();
	    int more=0;
	    int less=b1.length;
	    for(int i=0;i<b1.length;i++)
	    {
	    	list.add(b1[i]+"");
	    }	   
	    for(int i=0;i<a1.length;i++)
	    {
	    	if(list.contains(a1[i]+""))
	    	{
	    		list.remove(a1[i]+"");
	    		less--;
	    	}
	    	else
	    	{
	    		more++;
	    	}
	    }
	    if(less==0)
	    {
	    	System.out.println("Yes "+more);
	    }
	    else
	    	System.out.println("No "+less);
	}
}
