package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class test11 {
    static tree tree;
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String s[]=sc.nextLine().split(" ");
		int a[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);
		}
		 tree=new tree();
		tree.root=new node(a[0]);
		for(int i=1;i<s.length;i++)
		{
			tree.add(a[i]);
		}
		node no=tree.root;
		String str="";
		int index=0;//1或者-1表示两个方向
		search(no,str,index);	
	}
	static void search(node no,String str,int index)
	{		
		String right=str+(index==-1?"|..":"...");
		int leng=(no.value+"").length();
		for(int i=0;i<leng;i++)
		{
			right+=".";
		}
		if(no.right!=null) {search(no.right,right,1);}
		if(no.value!=tree.root.value)
		System.out.println((str+"|-"+no.value+((no.left!=null||no.right!=null)?"-|":"")).substring(2));
		else//特殊情况
			System.out.println(no.value+((no.left!=null||no.right!=null)?"-|":""));
	    String left=str+(index==1?"|..":"...");
	    for(int i=0;i<leng;i++)
		{
			left+=".";
		}
		if(no.left!=null) {search(no.left,left,-1);}
	}
	static class tree
	{
		node root;
		public tree() {}
		public void add(int a)
		{
			node no=root;
			while(true)
			{
				if(no.value>a)
				{
					if(no.left!=null)
					{no=no.left;}
					else
					{
						no.left=new node(a);break;
					}
				}
				else
				{
					if(no.right!=null)
					{
						no=no.right;
					}
					else
					{
						no.right=new node(a);break;
					}
				}
			}			
		}
	}
	static class node
	{
		int value;
		node left;
		node right;
		public node(int value)
		{
			this.value=value;
		}
	}

}
