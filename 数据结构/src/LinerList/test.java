package LinerList;
public class test {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���Ա���ԣ�");
		doubleList<Integer> list = new doubleList<Integer>();
		list.add(66);
		list.addfirst(55);
		list.add(1, 101);
		list.add(-22);
		list.add(555);
		list.addfirst(9999);
		System.out.println(list.toString() + " lenth " + list.length());// 9999 55 101 66 -22 555
		// System.out.println(list.getElum(0)+" "+list.getElum(2)+" "+list.getElum(4));
		list.deletefirst();
		System.out.println(list.toString() + " lenth " + list.length());// 55 101 66 -22 555 lenth 5
		list.delete(1);
		System.out.println(list.toString() + " length " + list.length());// 55 66 -22 555 length 4
		list.delete(1);

		System.out.println(list.toString() + " length " + list.length());// 55 -22 555 length 3
		list.deletelast();
		System.out.println(list.toString() + " lenth " + list.length());// 55 -22 lenth 2
		list.deletelast();
		System.out.println(list.toString() + " lenth " + list.length());// 55 lenth 1
		list.deletelast();
		System.out.println(list.toString() + " lenth " + list.length());// lenth 0
		System.err.println("��ӭ��ע���ںţ�bigsai");
	}
}
