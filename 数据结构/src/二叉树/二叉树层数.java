package ������;

public class ���������� {
	public static void main(String[] args)
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
		System.out.println(a.deep(1));
	}
private	static class node {//���
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
private	static	class tree {
			 node root;//��
			public tree()
			{root=null;}
			public int deep(int x)//shendu
			{
				int deep=1;
				node current=root;
				if(root==null) {return deep;}
				while(current.value!=x&&current!=null) 
				{
					if(x<current.value) {current=current.left;deep++;}
					if(x>current.value) {current=current.right;deep++;}
					if(current==null) {return deep;}//�������ж������ֱ�ӷ���
				}
				//��������λ���ж��Ƿ�Ϊ�ջᵼ��current.value�����ڱ���
				 if(current.value==x) {return deep;}		
				return deep;		
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
		}
}



