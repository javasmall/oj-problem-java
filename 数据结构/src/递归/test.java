package �ݹ�;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digui(5);
	}
	static void digui(int time)
	{
		if(time==0) {}//time==0��ִ��
		else {
			System.out.println("bigsaiǰtime: "+time);
			digui(time-1);
			System.out.println("bigsai��time: "+time);	
		}	
	}
}