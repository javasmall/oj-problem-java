package 蓝桥2018;

public class test3 {

	static int a,b=0;//a+bi
	public static void main(String[] args) 
	{
		// TODO 自动生成的方法存根
		a=2;b=3;
		for(int i=0;i<123455;i++)
		{
			muti(a, b, 2, 3);
		}
		System.out.println(a+" "+b);

	}
	static void muti(int a1,int b1,int a2,int b2)
	{
		a=a1*a2-b1*b2;
		b=a1*b2+b1*a2;
	}
}
