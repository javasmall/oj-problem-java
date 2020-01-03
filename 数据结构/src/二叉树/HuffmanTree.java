package 二叉树;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HuffmanTree {
	
	public static class node
	{
		int value;
		node left;
		node right;
		int deep;//记录深度
		public node(int value) {
			this.value=value;
			this.deep=0;
		}
		public node(node n1, node n2, int value) {
			this.left=n1;
			this.right=n2;
			this.value=value;
		}
	}
	private node root;//最后生成的根节点
	List<node>nodes;
	public HuffmanTree() {
		this.nodes=null;
	}
	public HuffmanTree(List<node>nodes)
	{
		this.nodes=nodes;
	}
	public void createTree() {
	   Queue<node>q1=new PriorityQueue<node>(new Comparator<node>() {
		public int compare(node o1, node o2) {
			return o1.value-o2.value;
		}});
	   q1.addAll(nodes);
	   while(!q1.isEmpty())
	   {
		   node n1=q1.poll();
		   node n2=q1.poll();
		  node parent=new node(n1,n2,n1.value+n2.value);
		  if(q1.isEmpty())
		  {
			  root=parent;return;
		  }
		  q1.add(parent);
	   }
	}
	public int getweight() {
		Queue<node>q1=new ArrayDeque<node>();
		q1.add(root);
		int weight=0;
		while (!q1.isEmpty()) {
			node va=q1.poll();
			if(va.left!=null)
			{
				va.left.deep=va.deep+1;va.right.deep=va.deep+1;
				q1.add(va.left);q1.add(va.right);
			}
			else {
				weight+=va.deep*va.value;
			}
		}
		return weight;
	}
	public static void main(String[] args) {
		List<node>list=new ArrayList<node>();
		list.add(new node(2));
		list.add(new node(3));
		list.add(new node(6));
		list.add(new node(8));list.add(new node(9));
		HuffmanTree tree=new HuffmanTree();
		tree.nodes=list;
		tree.createTree();
		System.out.println(tree.getweight());
	}
	

}
