package 乙;

import java.util.Scanner;

public class pat21 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int allcount=0;//判断是否全部为真
		int quanzhi[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			int number2=0;
			//sc.nextLine();
			String number=sc.next();
			char c[]=number.toCharArray();
			for(int j=0;j<17;j++)
			{
				if(c[j]<'0'||c[j]>'9')
				{
					b=true;
				}
			}
			if(!b)
			{
				for(int q=0;q<17;q++)
				{
					number2+=quanzhi[q]*(c[q]-'0');//计算权值
				}
				number2=number2%11;
				char q=getnumber2(number2);
				if(q!=number.charAt(17))
				{
					b=true;
				}				
			}
			if(b)
			{
				System.out.println(number);
				b=false;
			}
			else
			{allcount++;}			
		}
		if(allcount==n)
		{
			System.out.println("All passed");
		}
	}
	private static char getnumber2(int number2) {
		char a = 0;
	   switch (number2)
	   {
	   case 0:a= '1';break;
	   case 1:a= '0';break;
	   case 2:a= 'X';break;
	   case 3:a= '9';break;
	   case 4:a= '8';break;
	   case 5:a= '7';break;
	   case 6:a= '6';break;
	   case 7:a= '5';break;
	   case 8:a= '4';break;
	   case 9:a= '3';break;
	   case 10:a= '2';break;	  
	   }
	   return a;
	}
}
