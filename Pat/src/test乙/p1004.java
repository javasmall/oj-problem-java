package test乙;

import java.util.Scanner;

public class p1004 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String name[][]=new String[n][2];
		int score[]=new int[n];
		for(int q=0;q<n;q++)
		{
			name[q][0]=sc.next();
			name[q][1]=sc.next();
			score[q]=sc.nextInt();
		}
		
		sort(name,score,0,n-1);
		System.out.println(name[n-1][0]+" "+name[n-1][1]);
		System.out.println(name[0][0]+" "+name[0][1]);
		

	}

	private static void sort(String[][] name, int[] score, int i, int j) {		
		int left=i;int right=j;
		if(i>j)return;//一定要放在前面
		String a1=name[i][0];
		String a2=name[i][1];
		int scor=score[i];
		while(left<right)
		{
			while(left<right&&score[right]>=scor)//找到第一个从右面数比第一个小的
			{
				right--;
			}//right位置为第一个比a[i]小的
			name[left][0]=name[right][0];
			name[left][1]=name[right][1];
		    score[left]=score[right];
		    while(left<right&&score[left]<=scor)
		    {
		    	left++;
		    }//left为从左到右的第一个大于scor的
		    name[right][0]=name[left][0];
		    name[right][1]=name[left][1];
		    score[right]=score[left];
			
		}
		name[left][0]=a1;name[left][1]=a2;score[left]=scor;
		sort(name, score, i, left-1);
		sort(name, score, left+1, j);
		
		
	}

}
