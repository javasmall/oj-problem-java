package test2;

	import java.util.Scanner;
	
	public class testB {
	
		public static void main(String[] args) {
			// TODO �Զ����ɵķ������
			Scanner sc=new Scanner(System.in);
			double a=1;
			int k=sc.nextInt();int n=2;
			while(a<k)
			{
				a+=(double)1/(double)n;
				if(a>k) {break;}
				else
				{
					n++;
				}
			}
			System.out.println(n);
	
		}
	
	}
