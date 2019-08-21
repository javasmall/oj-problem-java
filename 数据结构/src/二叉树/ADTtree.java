package ������;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
class node {//���
	public int value;
	public node left;
	public node right;
	public node()
	{
	}
	public node(int value)
	{
		this.value=value;
		this.left=null;
		this.right=null;
	}
	public node(int value,node l,node r)
	{
		this.value=value;
		this.left=l;
		this.right=r;
	}			
}
class tree {
	 node root;//��
	public tree()
	{root=null;}
	public void makeempty()//���
	{root=null;;}
	public boolean isempty()//�鿴�Ƿ�Ϊ��
	{return root==null;}
	public node findmin(node t)//������С����ֵ��node�����ò鿴���ʱ��Ҫ.value
	{
		if(t==null) {return null;}
		else if(t.left==null) {return t;}
		else return(findmin(t.left));	
	}
	public node findmax(node t)//�������
	{
		if(t==null) {return null;}
		else if(t.right==null) {return t;}
		else return(findmax(t.right));	
	}
	public boolean iscontains(int x)//�Ƿ����
	{
		node current=root;
		if(root==null) {return false;}
		while(current.value!=x&&current!=null) 
		{
			if(x<current.value) {current=current.left;}
			if(x>current.value) {current=current.right;}
			if(current==null) {return false;}//�������ж������ֱ�ӷ���
		}
		//��������λ���ж��Ƿ�Ϊ�ջᵼ��current.value�����ڱ���
		 if(current.value==x) {return true;}		
		return false;		
	}
	public node insert(int x,node t)//����   t��root������
	{ 		
		node a1=new node(x);
		if(root==null) {root=a1;return root;}		
		if(t==null)    {t=a1;return t;}
		 else if(t!=null)
		 {			
			if(x<t.value)
			{t.left=insert(x,t.left);}
			else if(x>=t.value)
		    {t.right= insert(x,t.right);}				
	      }
		 return t;	
	}
	public node remove(int x,node t)//ɾ���ڵ�
	{	
		if(t==null) {return null;}
		if(x<t.value)       {t.left=remove(x,t.left);}
		else if(x>t.value)  {t.right=remove(x,t.right);}
		else if(t.left!=null&&t.right!=null)//���ҽڵ������
		{
		  t.value=findmin(t.right).value;//�ҵ��Ҳ���Сֵ���
		  t.right=remove(t.value,t.right);
		}
		else //���ҵ��ջ������Ҷ���
		{
			if(t.left==null&&t.right==null)
			{t=null;}
			else if(t.right!=null)
			{
				t=t.right;
			}
			else if(t.left!=null)
			{
				t=t.left;
			}
			return t;			
		}		
		return t;		
	}
	public void duilie(node t)
	{
		Queue<node> q1 = new ArrayDeque<node>();
		if(t==null)return;
		if(t!=null) {
		q1.add(t);}
		while(!q1.isEmpty())
		{
			node t1= q1.poll();
			if(t1.left !=null)q1.add(t1.left);
			if(t1.right!=null)q1.add(t1.right);
			System.out.print(t1.value+" ");		
		}
		System.out.println();
	}
	public void qianxu(node t)//ǰ��ݹ� ǰ������������ ---> ������ ---> ������
	{
		if(t!=null) {
		System.out.print(t.value+" ");//��ǰ�ڵ�
		qianxu(t.left );
		qianxu(t.right);}		
	}
	public void qianxu2(node t)//�ǵݹ�ǰ�� ջ �������
	{
		Stack<node> q1=new Stack<node>();
		if(t==null)return;
		if(t!=null) {q1.push(t);}					
		while(!q1.empty())
		{
			node t1=q1.pop();					
			if(t1.right!=null) {q1.push(t1.right);}
			if(t1.left!=null) {q1.push(t1.left);}
			System.out.print(t1.value+" ");	
		}		
	}
	public void houxu(node t)//������� ��������������� ---> ������ ---> �����
	{
		if(t!=null)
		{			
			houxu(t.left );
			houxu(t.right);
			System.out.print(t.value+" ");	//���������ҷ��ʵ�ǰ�ڵ�		
		}				
	}
	public void houxu2(node t)//q1��q2 q1Ҫ���Һ����ȱ����Ҳ࣬q1��װ�Ҳ�Ͱ��Ҳ�ŵ�ǰ�棬���������棨ջ����
	{
		Stack<node> q1=new Stack();
		Stack<node>q2=new Stack();
		if(t==null)return;
		if(t!=null) {q1.push(t);	}				
		while(!q1.isEmpty())
		{
			node t1=q1.pop();
			q2.push(t1);
			if(t1.left!=null) {q1.push(t1.left);}
			if(t1.right!=null) {q1.push(t1.right);}							
		}
		while(!q2.isEmpty())
		{
			node t1=q2.pop();
			System.out.print(t1.value+" ");
		}
	}
	public void zhongxu(node t)//������� ���������������---> ����� ---> ������
	{
		if(t!=null)
		{
		zhongxu(t.left);
		System.out.print(t.value+" ");//��������ڵ���ʵ�ǰ�ڵ�
		zhongxu(t.right);
		}
	}
	public void zhongxu2(node t)//�ȴ����������㣬�׳�һ���㣬���ʸõ��ҽڵ㣬���ҽڵ��ڴ�����������ڵ�
	{
		Stack<node> q1=new Stack();		
		if(t==null)return;		
		if(t!=null) {q1.push(t);}				
		node t1=q1.peek();//�����׳���Ҫ�ȴ������
		while(t1.left!=null)
		{					
			t1=t1.left;
			q1.push(t1);				
		}	
		while(!q1.isEmpty())
		{			
				node t2=q1.pop();
				System.out.print(t2.value+" ");
				if(t2.right!=null)	
				{
					t2=t2.right;q1.push(t2);
				   while(t2.left!=null)
				   {t2=t2.left;
					q1.push(t2);}
				}												
		}
	}
}

public class ADTtree {
	public static void main(String [] args)
	{
		tree a=new tree();		
		a.insert(5, a.root);		
		a.insert(9, a.root);
		a.insert(8, a.root);
		a.insert(4, a.root);
		a.insert(2, a.root);
		a.insert(6, a.root);		
		a.insert(7, a.root);
		a.insert(1, a.root);
		System.out.print("���б���");
		a.duilie(a.root);
		System.out.print("ǰ�����");
		a.qianxu(a.root);
		System.out.print("�ǵݹ�ǰ��");
		a.qianxu2(a.root);
		System.out.println();
		System.out.print("�������");
		a.houxu(a.root);
		System.out.print("�ǵݹ����");
		a.houxu2(a.root);
		System.out.println();
		System.out.print("�������");		
		a.zhongxu(a.root);		
		System.out.print("�ǵݹ�����");
		a.zhongxu2(a.root);
		System.out.println();
		System.out.println(a.iscontains(12));
		System.out.println(a.iscontains(7));
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
