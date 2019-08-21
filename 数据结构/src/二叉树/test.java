package 二叉树;

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
		System.out.print("队列遍历");
		a.cengxu(a.root);
		System.out.print("前序遍历");
		a.qianxu(a.root);
		System.out.print("非递归前序：");
		a.qianxu2(a.root);
		System.out.println();
		System.out.print("后序遍历");
		a.houxu(a.root);
		System.out.print("非递归后序：");
		a.houxu3(a.root);
		System.out.println();
		System.out.print("中序遍历");		
		a.zhongxu(a.root);		
		System.out.print("非递归中序：");
		a.zhongxu3(a.root);
		System.out.println();
		System.out.println(a.isContains(12));
		System.out.println(a.isContains(7));
		System.out.println("min: "+a.findmin(a.root).value);
		System.out.println("max: "+a.findmax(a.root).value);
		a.remove(9, a.root);
		a.remove(8, a.root);
		System.out.print("前序遍历");
		a.qianxu(a.root);
		System.out.println();
		System.out.print("后序遍历");
		a.houxu(a.root);
		System.out.println();
		System.out.print("中序遍历");
		a.zhongxu(a.root);	

	}

}
