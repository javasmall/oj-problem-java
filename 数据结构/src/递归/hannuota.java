package 递归;
public class hannuota {
	static void move(char a,char b)
	{
		System.out.println("移动最上层的"+ a+ "到"+ b+ "\t");
	}
	static void hannuota(int n,char a,char b,char c)//主要分析每一大步对于下一步需要走的。
	{
		if(n==1) {move(a,c);}//从a移到c
		else
		{
			hannuota(n-1,a,c,b);//将n-1个从a借助c移到b
			move(a,c); //将第n（最后一个）从a移到c。
			hannuota(n-1,b,a,c);//再将n-1个从b借助a移到c
		}
	}
	public static void main(String[] args)
	{
		
		hannuota(5,'a','b','c');
	}
}

