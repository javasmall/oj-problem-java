package ������;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySortTree a=new BinarySortTree();		
		a.insert(5);		
		a.insert(9);
		a.insert(8);
		a.insert(4);
		a.insert(2);
		a.insert(6);		
		a.insert(7);
		a.insert(1);
		System.out.print("���б���");
		a.cengxu(a.root);
		System.out.print("ǰ�����");
		a.qianxu(a.root);
		System.out.print("�ǵݹ�ǰ��");
		a.qianxu2(a.root);
		System.out.println();
		System.out.print("�������");
		a.houxu(a.root);
		System.out.print("�ǵݹ����");
		a.houxu3(a.root);
		System.out.println();
		System.out.print("�������");		
		a.zhongxu(a.root);		
		System.out.print("�ǵݹ�����");
		a.zhongxu3(a.root);
		System.out.println();
		System.out.println(a.isContains(12));
		System.out.println(a.isContains(7));
		System.out.println("min: "+a.findmin(a.root).value);
		System.out.println("max: "+a.findmax(a.root).value);
		a.remove(9, a.root);
		a.remove(8, a.root);
		System.out.print("ǰ�����");
		a.qianxu(a.root);
		System.out.println();
		System.out.print("�������");
		a.houxu(a.root);
		System.out.println();
		System.out.print("�������");
		a.zhongxu(a.root);	

	}

}
