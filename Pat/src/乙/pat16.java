package 乙;

import java.util.Scanner;

public class pat16 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
       Scanner sc=new Scanner(System.in);
       double c1=sc.nextInt();
       double c2=sc.nextInt();
       double value=(c2-c1)/100;
       value=Math.round(value);
       int hour=(int)value/3600;
       int min=(int)value%3600/60;
       int second=(int)value%60;
      String hour2=check(hour);
      String min2=check(min);
      String second2=check(second);
      System.out.println(hour2+":"+min2+":"+second2);
	}

	private static String check(int time) {
		if(time<10)
		{return "0"+time;}
		else
			return time+"";			
	}
}
