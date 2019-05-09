package 线段树;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
 class linetree
{
	node root;
	public linetree(int left,int right)
	{
		root=buildtree(left,right);
	}
	public node buildtree(int left,int right)
	{
		node no=new node(left, right);
		if(right-left>=1) {
			int mid=(left+right)/2;
			no.leftnode=buildtree(left, mid);
			no.rightnode=buildtree(mid+1, right);
		}
		return no;		
	}
	public int search(node node,int left,int right)
	{
		if(left>right||node==null) {return 0;}
		if(node.left==left&&node.right==right)
		{
			return node.value;
		}
		int mid=(left+right)/2;
		return search(node.leftnode, left, mid)+search(node.rightnode, mid+1, right);
	}
	public int searchmax(node node,int left,int right)
	{
		if(left>right||node==null||left>node.right||right<node.left) {return 0;}
		if(right-left==0) {return node.value;}
		//if(left<=node.left&&right>node.right) {return 0;}
	    int mid=(node.left+node.right)/2;
	    return max(searchmax(node.leftnode, left,mid),searchmax(node.rightnode, mid+1, right));
		
	}
	private int max(int a, int b) {
		// TODO 自动生成的方法存根
		return a>b?a:b;
	}
	public int update(node node1,int index,int value)//二分递归
	{
		if(node1.left==node1.right)
		{
			if(node1.left==index)
			{
			node1.value=value;
			return value;
			}
			else
				return 0;
		}
		else {//二分操作
			int mid=(node1.left+node1.right)/2;
			if(index<=mid) {//我要更新的节点在节点的左侧我需要更新这个点的大小
				node1.value=node1.rightnode.value+update(node1.leftnode, index, value);
			}
			else {
				node1.value=node1.leftnode.value+update(node1.rightnode, index, value);
			}
			return node1.value;
		}
	}
}
public class xianduanshu{
	
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();int n=(int)in.nval;
		in.nextToken();int m=(int)in.nval;
		linetree tree=new linetree(1, n);
		
		for(int i=1;i<n+1;i++)
		{
			in.nextToken();int t=(int)in.nval;
			tree.update(tree.root, i, t);
		}
		for(int i=0;i<m;i++)
		{
			in.nextToken();int a=(int)in.nval;
			in.nextToken();int b=(int)in.nval;
			in.nextToken();int c=(int)in.nval;
			if(a==1)
			{
				tree.update(tree.root, b, c);
			}
			else if(a==2) 
			{
				int value=tree.search(tree.root, b, c);
				out.println(value);
			}
			else {
				int value=tree.searchmax(tree.root, b,c);
				out.println(value);
			}
			out.flush();
		}
		

	}

}

class node
{
	int value;//总合
	int left;//
	int right;
	node leftnode;
	node rightnode;
	public node(int left,int right)
	{
		this.left=left;
		this.right=right;
		value=0;
		leftnode=null;
		rightnode=null;
	}
}