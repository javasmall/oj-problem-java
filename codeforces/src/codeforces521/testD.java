package codeforces521;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.List;
public class testD {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n=(int)in.nval;in.nextToken();
		int k=(int)in.nval;
		int a[]=new int[n];
		int map2[]=new int[200005];
		for(int i=0;i<n;i++)
		{
			in.nextToken();
			a[i]=(int)in.nval;
			map2[a[i]]++;
		}
		List<node>list=new ArrayList<>();
		for(int i=0;i<200005;i++)
		{
			if(map2[i]>0)
			{
			node no=new node(i, map2[i]);//�����Ĵ���
			list.add(no);
			}
		}
		list.sort(com);
      
		int max=list.get(0).value;//�������Ĵ���//�����ܳ����Ĵ���
		int value=0;//���ճ��ֵĴ���
		int mid=0;//���ֲ���
		  /*
         * ����
         */
	
//		int l=1;int r=max+1;
//		while(l<r)
//		{
//			mid=(l+r)/2;
//			
//			int count=0;
//			for(int i=0;i<list.size();i++)
//			{
//				count+=list.get(i).value/mid;
//				if(count>=k)
//				{
//					value=mid;
//                    l=mid+1;
//					break;
//				}		
//			}
//			if(count<k)
//			{
//				r=mid;
//			}			
//		}
//		mid=value;
		for(int q=1;q<=max;q++)
		{
			//System.out.println(q);
			int count=0;
			for(int i=0;i<list.size();i++)
			{
				count+=list.get(i).value/q;
				if(count>=k)
				{
					value=i;
                    mid=q;//����
					break;
				}			
			}
			if(count<k)
			{break;}
		}
		int time=0;//��������K�ξ�ֹͣ
		for(int i=0;i<list.size();i++)
		{
			node team=list.get(i);
			int va=team.value;
			while(va-mid>=0)
			{
				va-=mid;
				time++;
				if(time>k) {break;}
				
				out.print(team.index+" ");
			}
			if(time>k)break;
		}
		out.flush();		
	}
	static Comparator<node>com=new Comparator<node>() {
		@Override
		public int compare(node o1, node o2) {
			// TODO �Զ����ɵķ������
			return o2.value-o1.value;
		}		
	};
	static class node
	{
		int index;//��ֵ
		int value;//
		
		public node() {}
		public node(int index,int value)
		{
			this.index=index;
			this.value=value;
		}
	}

}
