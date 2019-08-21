package ������;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BinarySortTree {
	class node {// ���
		public int value;
		public node left;
		public node right;

		public node() {
		}

		public node(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		public node(int value, node l, node r) {
			this.value = value;
			this.left = l;
			this.right = r;
		}
	}

	node root;// ��

	public BinarySortTree() {
		root = null;
	}

	public void makeEmpty()// ���
	{
		root = null;
	}

	public boolean isEmpty()// �鿴�Ƿ�Ϊ��
	{
		return root == null;
	}

	public node findmin(node t)// ������С����ֵ��node�����ò鿴���ʱ��Ҫ.value
	{
		if (t == null) {
			return null;
		} else if (t.left == null) {
			return t;
		} else
			return (findmin(t.left));
	}

	public node findmax(node t)// �������
	{
		if (t == null) {
			return null;
		} else if (t.right == null) {
			return t;
		} else
			return (findmax(t.right));
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

	public node insert(int x)// ���� t��root������
	{
		node current = root;
		if (root == null) {
			root = new node(x);
			return root;
		}
		while (current != null) {
			if (x < current.value) {
				if (current.left == null) {
					return current.left = new node(x);}
				else current = current.left;}
		    else if (x > current.value) {
				if (current.right == null) {
					return current.right = new node(x);}
				else current = current.right;
			}
		}
		return current;//�����ò���
	}

	public node remove(int x, node t)// ɾ���ڵ�
	{
		if (t == null) {
			return null;
		}
		if (x < t.value) {
			t.left = remove(x, t.left);
		} else if (x > t.value) {
			t.right = remove(x, t.right);
		} else if (t.left != null && t.right != null)// ���ҽڵ������
		{
			t.value = findmin(t.right).value;// �ҵ��Ҳ���Сֵ���
			t.right = remove(t.value, t.right);
		} else // ���ҵ��ջ������Ҷ���
		{
			if (t.left == null && t.right == null) {
				t = null;
			} else if (t.right != null) {
				t = t.right;
			} else if (t.left != null) {
				t = t.left;
			}
			return t;
		}
		return t;
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

	public void qianxu(node t)// ǰ��ݹ� ǰ������������ ---> ������ ---> ������
	{
		if (t != null) {
			System.out.print(t.value + " ");// ��ǰ�ڵ�
			qianxu(t.left);
			qianxu(t.right);
		}
	}

	public void qianxu2(node t) {
		Stack<node> q1 = new Stack();
		
		while(!q1.isEmpty()||t!=null)
		{
			if (t!=null) {
				System.out.print(t.value+" ");
				q1.push(t);				
				t=t.left;
			}
			else {
				t=q1.pop();
				t=t.right;
			}
		}
	}
	public void qianxu3(node t)// �ǵݹ�ǰ�� ջ �������  tһ��Ϊ
	{
		Stack<node> q1 = new Stack<node>();
		if (t == null)
			return;
		if (t != null) {
			q1.push(t);
		}
		while (!q1.empty()) {
			node t1 = q1.pop();
			if (t1.right != null) {
				q1.push(t1.right);
			}
			if (t1.left != null) {
				q1.push(t1.left);
			}
			System.out.print(t1.value + " ");
		}
	}

	public void houxu(node t)// ������� ��������������� ---> ������ ---> �����
	{
		if (t != null) {
			houxu(t.left);
			houxu(t.right);
			System.out.print(t.value + " "); // ���������ҷ��ʵ�ǰ�ڵ�
		}
	}

	public void houxu3(node t)// q1��q2 q1Ҫ���Һ����ȱ����Ҳ࣬q1��װ�Ҳ�Ͱ��Ҳ�ŵ�ǰ�棬���������棨ջ����
	{
		Stack<node> q1 = new Stack();
		Stack<node> q2 = new Stack();
		if (t == null)
			return;
		if (t != null) {
			q1.push(t);
		}
		while (!q1.isEmpty()) {
			node t1 = q1.pop();
			q2.push(t1);
			if (t1.left != null) {
				q1.push(t1.left);
			}
			if (t1.right != null) {
				q1.push(t1.right);
			}
		}
		while (!q2.isEmpty()) {
			node t1 = q2.pop();
			System.out.print(t1.value + " ");
		}
	}
	
	public void houxu2(node t) {
		Stack<node> q1 = new Stack();	
		Map<Integer,Integer >map=new HashMap<>();
		while(!q1.isEmpty()||t!=null)
		{
			if (t!=null) {
				q1.push(t);
				map.put(t.value, 1); //t.value������ֵ�ڵ���ֵĴ���
				t=t.left;
			}
			else {
				t=q1.peek();
				if(map.get(t.value)==2) {//�ڶ��η��ʣ��׳�
					q1.pop();
					System.out.print(t.value+" ");
					t=null;//��Ҫ������
				}
				else {
					map.put(t.value, 2);
					t=t.right;
				}
				
			}
		}
	}

	public void zhongxu(node t)// ������� ���������������---> ����� ---> ������
	{
		if (t != null) {
			zhongxu(t.left);
			System.out.print(t.value + " ");// ��������ڵ���ʵ�ǰ�ڵ�
			zhongxu(t.right);
		}
	}
	public void zhongxu3(node t) {
		Stack<node> q1 = new Stack();
		
		while(!q1.isEmpty()||t!=null)
		{
			if (t!=null) {
				q1.push(t);
				t=t.left;
			}
			else {
				t=q1.pop();
				System.out.print(t.value+" ");
				t=t.right;
			}
		}
	}
	
	public void zhongxu2(node t)// �ȴ����������㣬�׳�һ���㣬���ʸõ��ҽڵ㣬���ҽڵ��ڴ�����������ڵ�
	{
		Stack<node> q1 = new Stack();
		if (t == null)
			return;
		if (t != null) {
			q1.push(t);
		}
		node t1 = q1.peek();// �����׳���Ҫ�ȴ������
		while (t1.left != null) {
			t1 = t1.left;
			q1.push(t1);
		}
		while (!q1.isEmpty()) {
			node t2 = q1.pop();
			System.out.print(t2.value + " ");
			if (t2.right != null) {
				t2 = t2.right;
				q1.push(t2);
				while (t2.left != null) {
					t2 = t2.left;
					q1.push(t2);
				}
			}
		}
	}
}
