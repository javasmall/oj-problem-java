package �ݹ�;

public class jiecheng {

	public static void main(String[] args) {
		System.out.println(jiecheng(5));

	}
	static int jiecheng(int n)
	{
		if(n==1)//0�Ľ׳�Ϊ1
		{
			return 1;
		}
		else {
			return n*jiecheng(n-1);
		}
	}

}
