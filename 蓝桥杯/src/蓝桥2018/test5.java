package ����2018;

public class test5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		double a=2.0;
		//double b=0.000001;
		for(double b=0.00000001;b<1;b+=0.00000001)
		{
			double t=Math.pow((double)(a+b),(double)( a+b));
			
			if(t>=10)
			{
				System.out.println(a+b);
				break;
			}
		}

	}

}
