package �ݹ�;
public class hannuota {
	static void move(char a,char b)
	{
		System.out.println("�ƶ����ϲ��"+ a+ "��"+ b+ "\t");
	}
	static void hannuota(int n,char a,char b,char c)//��Ҫ����ÿһ�󲽶�����һ����Ҫ�ߵġ�
	{
		if(n==1) {move(a,c);}//��a�Ƶ�c
		else
		{
			hannuota(n-1,a,c,b);//��n-1����a����c�Ƶ�b
			move(a,c); //����n�����һ������a�Ƶ�c��
			hannuota(n-1,b,a,c);//�ٽ�n-1����b����a�Ƶ�c
		}
	}
	public static void main(String[] args)
	{
		
		hannuota(5,'a','b','c');
	}
}

