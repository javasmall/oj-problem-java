package ������;

import java.util.ArrayDeque;
import java.util.Queue;

import ������.BinarySortTree.node;

public class AvlTree {
	
	class node
	{
		int value;
		node left;
		node right;
		int height;
		public node() {
			
		}
		public node(int value)
		{
			this.value=value;
			this.height=0;
		}
		public node(int value,node left,node right)
		{
			this.value=value;
			this.left=left;this.right=right;
			this.height=0;
		}
	}
	node root;// ��

	public AvlTree() {
		this.root = null;
	}

	public boolean isContains(int x)// �Ƿ����
	{
		node current = root;
		if (root == null) {
			return false;
		}
		while (current.value != x && current != null) {
			if (x < current.value) {
				current = current.left;
			}
			if (x > current.value) {
				current = current.right;
			}
			if (current == null) {
				return false;
			} // �������ж������ֱ�ӷ���
		}
		// ��������λ���ж��Ƿ�Ϊ�ջᵼ��current.value�����ڱ���
		if (current.value == x) {
			return true;
		}
		return false;
	}

	public int getHeight(node t)
	{
		if(t==null) {return -1;}//
		return t.height;
		//return 1+Math.max(getHeight(t.left), getHeight(t.right));����Ч��̫��
	}
	public void cengxu(node t) {//�������
		Queue<node> q1 = new ArrayDeque<node>();
		if (t == null)
			return;
		if (t != null) {
			q1.add(t);
		}
		while (!q1.isEmpty()) {
			node t1 = q1.poll();
			if (t1.left != null)
				q1.add(t1.left);
			if (t1.right != null)
				q1.add(t1.right);
			System.out.print(t1.value + " ");
		}
		System.out.println();
	}
	public void zhongxu(node t)//������� ���������������---> ����� ---> ������
	{//Ϊ�˲��Ըĳ��к���
		if(t!=null)
		{
		zhongxu(t.left);
		System.out.print(t.value+" ");//��������ڵ���ʵ�ǰ�ڵ�
		zhongxu(t.right);
		//System.out.print(t.value+" ");//��������ڵ���ʵ�ǰ�ڵ�
		}
	}
	public void qianxu(node t)//ǰ��ݹ� ǰ������������ ---> ������ ---> ������
	{
		if(t!=null) {
		System.out.print(t.value+" ");//��ǰ�ڵ�
		qianxu(t.left );
		qianxu(t.right);}		
	}
	public void insert(int value) {
		root=insert(value, root);
	}
	public node insert(int x,node t)//����   t��root������
	{ 		
		node a1=new node(x);
		//if(root==null) {root=a1;return root;}		
		if(t==null)    {return a1;}
		//����������ݹ�ʵ��
		 else if(t!=null)
		 {			
			if(x<t.value)
			{ t.left=insert(x,t.left);}
			else 
		    { t.right= insert(x,t.right);}				
	      }
		/*
		 * ���µ�ǰ�ڵ�ĸ߶ȣ���Ϊ��������ֻ�б������һ����Ӱ�죬
		 * ���Եݹ����º���ײ�ģ��ϲ��ֱ�ӵ���
		 */
		 t.height=Math.max(getHeight(t.left),getHeight(t.right))+1;//��Ҫд�ɵݹ飬 �ݹ�Ч�ʵ�
		  return banlance(t);//��Ϊjava���󴫲λ��ƣ���Ҫ��¡������ֱ��t=xx ����任	  
	}

	private node banlance(node t) {
		// TODO Auto-generated method stub
		//if(t==null)return null;
		int lefthigh=getHeight(t.left);
		int righthigh=getHeight(t.right);
		if(Math.abs(lefthigh-righthigh)<=1)//����Ҫƽ���
		{	return t;}
		else if(lefthigh<righthigh)//�Ҳ��
		{
			if(getHeight(t.right.left)<getHeight(t.right.right))//RR��Ҫ����
			{
				return  getRRbanlance(t);
			}
			else {
				return getRLbanlance(t);
			}
		}
		else {
			if(getHeight(t.left.left)>getHeight(t.left.right))//ll ����
			{
				return getLLbanlance(t);
			}
			else {
				return getLRbanlance(t);
			}
		}
	}
	/*
	 *        oldroot(ƽ������Ϊ2,��ƽ��)    ==>   newroot   
	 *       /    \                              /    \
	 *      B     newroot(ƽ������Ϊ1)        oldroot   D 
	 *             /    \                      / \      \
	 *            C      D                    B   C      E
	 *                    \
	 *                     E
	 */

	private node getRRbanlance(node oldroot) {//�������Ҫ����
		// TODO Auto-generated method stub
		node newroot=oldroot.right;
		oldroot.right=newroot.left;
		newroot.left=oldroot;
		oldroot.height=Math.max(getHeight(oldroot.left),getHeight(oldroot.right))+1;
		newroot.height=Math.max(getHeight(newroot.left),getHeight(newroot.right))+1;//ԭ����root�ĸ߶���Ҫ���¼���
		return newroot;		
	}
    /*
     * ����ͬ��
     */
	private node getLLbanlance(node oldroot) {//LLС����Ҫ����ת
		// TODO Auto-generated method stub
		node newroot=oldroot.left;
		oldroot.left=newroot.right;
		newroot.right=oldroot;
		oldroot.height=Math.max(getHeight(oldroot.left),getHeight(oldroot.right))+1;
		newroot.height=Math.max(getHeight(newroot.left),getHeight(newroot.right))+1;//ԭ����root�ĸ߶���Ҫ���½���	
		return newroot;	
	}

	private node getLRbanlance(node oldroot) {
		oldroot.left =getRRbanlance(oldroot.left);
		oldroot.height=Math.max(getHeight(oldroot.left), getHeight(oldroot.right))+1;
		return getLLbanlance(oldroot);
		
	}

	/*          (��ƽ�����������ڵ�)
	 *         oldroot       ==>          newroot
	 *        /        \                 /       \      
	 *       A          B             oldroot     B
	 *                /   \           /    \     /  \
	 *           newroot   D         A      E    F   D
	 *            /   \
	 *           E     F
	 */

	private node getRLbanlance(node oldroot) {//������	
//		node newroot=oldroot.right.left;
//		oldroot.right.left=newroot.right;
//		newroot.right=oldroot.right;
//		oldroot.right=newroot.left;	
//		newroot.left=oldroot;
//		oldroot.height=Math.max(getHeight(oldroot.left),getHeight(oldroot.right))+1;
//		newroot.right.height=Math.max(getHeight(newroot.right.left),getHeight(newroot.right.right))+1;
//		newroot.height=Math.max(getHeight(oldroot.left),getHeight(newroot.right))+1;//ԭ����root�ĸ߶���Ҫ���½���	
		oldroot.right =getLLbanlance(oldroot.right);
		oldroot.height=Math.max(getHeight(oldroot.left), getHeight(oldroot.right))+1;
		return getRRbanlance(oldroot);
		
	}
}
