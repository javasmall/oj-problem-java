package µÝ¹é;

public class jiecheng {

	public static void main(String[] args) {
		System.out.println(jiecheng(5));

	}
	static int jiecheng(int n)
	{
		if(n==1)//0µÄ½×³ËÎª1
		{
			return 1;
		}
		else {
			return n*jiecheng(n-1);
		}
	}

}
