package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class pat52 {
	public static void main(String[] args) throws IOException {
//		BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
//		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));	
		Scanner sc=new Scanner(System.in);
		String a1=sc.next();
		String a2=sc.next();
		String a3=sc.next();
		String a4=sc.next();
		int number=0;
		int day=0;String hour="";
		int minlength=a1.length()<a2.length()?a1.length():a2.length();
		for(int i=0;i<minlength;i++)
		{
			if(a1.charAt(i)==a2.charAt(i))
			{
				if(number==0)
				{
					if(a1.charAt(i)>='0'&&a1.charAt(i)<='9') {}//
					else
					{
						day=(int)((a1.charAt(i)+"").toLowerCase().charAt(0)-'a')+1;
						number++;
					}
				}
				else if(number==1)
				{
					if(a1.charAt(i)>='0'&&a1.charAt(i)<='9') {hour="0"+a1.charAt(i);break;}
					else
					{
						hour=(int)(((a1.charAt(i)+"").toLowerCase().charAt(0)-'a')+10)+"";
						break;
					}
				}
			}
		}
		int second=0;int j=0;
		 minlength=a3.length()<a4.length()?a3.length():a4.length();
		for(int i=0;i<minlength;i++)
		{
			if(a3.charAt(i)==a4.charAt(i)) {
				if(a3.charAt(i)=='&') {j++;}
				else {
					second=i+1-j;
					break;
				}	
			}
		}
		String day2=get(day);
		System.out.println(day2+" "+hour+":"+((second<10?"0":"")+second));

	}
	private static String get(int day) {		
		switch(day) {
		case 1:return "MON";
		case 2:return "TUE";
		case 3:return "WED";
		case 4:return "THU";
		case 5:return "FRI";
		case 6:return "SAT";
		case 7:return "SUN";
		}
		return null;
	}
}
