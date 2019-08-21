package 二叉树;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
class node {//结点
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
	 node root;//根
	public tree()
	{root=null;}
	public void makeempty()//变空
	{root=null;;}
	public boolean isempty()//查看是否为空
	{return root==null;}
	public node findmin(node t)//查找最小返回值是node，调用查看结果时需要.value
	{
		if(t==null) {return null;}
		else if(t.left==null) {return t;}
		else return(findmin(t.left));	
	}
	public node findmax(node t)//查找最大
	{
		if(t==null) {return null;}
		else if(t.right==null) {return t;}
		else return(findmax(t.right));	
	}
	public boolean iscontains(int x)//是否存在
	{
		node current=root;
		if(root==null) {return false;}
		while(current.value!=x&&current!=null) 
		{
			if(x<current.value) {current=current.left;}
			if(x>current.value) {current=current.right;}
			if(current==null) {return false;}//在里面判断如果超直接返回
		}
		//如果在这个位置判断是否为空会导致current.value不存在报错
		 if(current.value==x) {return true;}		
		return false;		
	}
	public node insert(int x,node t)//插入   t是root的引用
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
	public node remove(int x,node t)//删除节点
	{	
		if(t==null) {return null;}
		if(x<t.value)       {t.left=remove(x,t.left);}
		else if(x>t.value)  {t.right=remove(x,t.right);}
		else if(t.left!=null&&t.right!=null)//左右节点均不空
		{
		  t.value=findmin(t.right).value;//找到右侧最小值替代
		  t.right=remove(t.value,t.right);
		}
		else //左右单空或者左右都空
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
	public void qianxu(node t)//前序递归 前序遍历：根结点 ---> 左子树 ---> 右子树
	{
		if(t!=null) {
		System.out.print(t.value+" ");//当前节点
		qianxu(t.left );
		qianxu(t.right);}		
	}
	public void qianxu2(node t)//非递归前序 栈 先左后右
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
	public void houxu(node t)//后序遍历 后序遍历：左子树 ---> 右子树 ---> 根结点
	{
		if(t!=null)
		{			
			houxu(t.left );
			houxu(t.right);
			System.out.print(t.value+" ");	//访问玩左右访问当前节点		
		}				
	}
	public void houxu2(node t)//q1和q2 q1要先右后左，先遍历右侧，q1先装右侧就把右侧放到前面，左侧放在上面（栈顶）
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
	public void zhongxu(node t)//中序遍历 中序遍历：左子树---> 根结点 ---> 右子树
	{
		if(t!=null)
		{
		zhongxu(t.left);
		System.out.print(t.value+" ");//访问完左节点访问当前节点
		zhongxu(t.right);
		}
	}
	public void zhongxu2(node t)//先储藏所有左侧点，抛出一个点，访问该点右节点，对右节点在储存所有子左节点
	{
		Stack<node> q1=new Stack();		
		if(t==null)return;		
		if(t!=null) {q1.push(t);}				
		node t1=q1.peek();//不能抛出，要先存最左侧
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
		System.out.print("队列遍历");
		a.duilie(a.root);
		System.out.print("前序遍历");
		a.qianxu(a.root);
		System.out.print("非递归前序：");
		a.qianxu2(a.root);
		System.out.println();
		System.out.print("后序遍历");
		a.houxu(a.root);
		System.out.print("非递归后序：");
		a.houxu2(a.root);
		System.out.println();
		System.out.print("中序遍历");		
		a.zhongxu(a.root);		
		System.out.print("非递归中序：");
		a.zhongxu2(a.root);
		System.out.println();
		System.out.println(a.iscontains(12));
		System.out.println(a.iscontains(7));
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
