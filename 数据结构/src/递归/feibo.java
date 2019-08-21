package ตÝน้;

public class feibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		user t1=new user();
		getuser(t1);
		System.out.println(t1.name);
	}
	static long F(int n)
	{
		if(n==1||n==2) {return 1;}
		else {
			return F(n-1)+F(n-2);
		}
	}
	static void getuser(user u1)
	{
		user u2=new user();
		u1=u2;
		u1.setName("bigsai");
		
		//u1=u2;
			
	}
static class user
{
	String name;
	public user() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
}
