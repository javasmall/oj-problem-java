package codeforces498;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class testB {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		List<String> list=new ArrayList();
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        int b[]=a.clone();
        Arrays.sort(b);
        int value=0;
        for(int i=b.length-1;i>b.length-1-k;i--)
        {
        	list.add(b[i]+"");
        	value+=b[i];
        }
        System.out.println(value);
        int index=-1;
        for(int i=0;i<n;i++)
        {
        	if(list.contains(a[i]+""))
        	{
        	  if(list.size()==1) {System.out.print(n-index-1);break;}
        	  else
        	  System.out.print((i-index)+" ");
        	  index=i;
        	  list.remove(a[i]+"");
        	}
        }
	}
}
