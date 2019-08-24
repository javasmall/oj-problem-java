package ¶þ²æÊ÷;

public class AvlTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvlTree a=new AvlTree();
		a.insert(5);	a.qianxu(a.root);System.out.println();	a.cengxu(a.root);System.out.println();
		a.insert(11);     a.qianxu(a.root);System.out.println(); a.cengxu(a.root);System.out.println();
		a.insert(8);      a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		a.insert(9);      a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		System.out.println(a.root.height+" left:"+a.getHeight(a.root.left)+" right:"+a.getHeight(a.root.right));
		System.out.println(a.root.right.left.value);
		a.insert(10);       a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		a.insert(3);		 a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		
		a.insert(2);        a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		a.insert(1);    a.qianxu(a.root);System.out.println();a.cengxu(a.root);System.out.println();
		
	}
}
