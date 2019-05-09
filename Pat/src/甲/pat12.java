package ¼×;


import java.util.Scanner;

public class pat12 {
	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);	
	  int n=sc.nextInt();
	  sc.nextLine();	 
	  String suffix=sc.nextLine();
	  for(int i=1;i<n;i++)
	  {
		  String s=sc.nextLine();
		  for(int j=s.length()-1;j>=0;j--)
		  {
			  if(suffix.length()-1-(s.length()-1-j)>=0)
			  if(s.charAt(j)!=suffix.charAt(suffix.length()-1-(s.length()-1-j)))
			  {
				  suffix=s.substring(j);
				  break;
			  }
		  }
		 
	  }
	 
	  if(suffix.length()>1)
	  System.out.println(suffix.substring(1));
	  else
	
	   System.out.println("nai");
//	 while(it.hasNext())
//	  {
//		 String s=it.next();
//		  System.out.println(s+" "+ map.get(s));
//		  //System.out.println(map.get(a));
//	  }
	}
}
