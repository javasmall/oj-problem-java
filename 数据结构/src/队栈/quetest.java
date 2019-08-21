package 队栈;

public class quetest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		seqQueue<String>q1=new seqQueue<String>(5);
		q1.enQueue("wo");
		q1.enQueue("w5");
		q1.enQueue("w4");
		q1.enQueue("w6");
		q1.enQueue("w7");
		System.out.println(q1.toString());
		System.out.println(q1.deQueue());
		System.out.println(q1.toString());
		System.out.println(q1.lenth());
		System.out.println("--------------------------");
		
		listQueue<String>q2=new listQueue<String>();
		q2.enQueue("wo");
		q2.enQueue("w5");
		q2.enQueue("w4");
		q2.enQueue("w6");
		q2.enQueue("w7");
		System.out.println(q2.toString());
		System.out.println(q2.deQueue());
		System.out.println(q2.toString());
		System.out.println(q2.lenth());
		System.err.println("欢迎关注公众号:bigsai");
	}

}
