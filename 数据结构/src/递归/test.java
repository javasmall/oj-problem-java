package 递归;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		digui(5);
	}
	static void digui(int time)
	{
		if(time==0) {}//time==0不执行
		else {
			System.out.println("bigsai前time: "+time);
			digui(time-1);
			System.out.println("bigsai后time: "+time);	
		}	
	}
}