package codefores515;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int r=sc.nextInt();
		int a[]=new int[n];boolean b[]=new boolean[n];
		for(int q=0;q<n;q++)
		{
			a[q]=sc.nextInt();
		}
		int count=0;int index=0;
        for(int i=0;i<=n-2*(r-1);i++)
        {
        	boolean jud=false;
        	for(int j=i+r;j>=i;j--)
        	{
        		if(a[j]==1)//�ҵ�����ȡů��
        		{
        			jud=false;
        			b[j]=true;
        			for(int q=1;q<r;q++)
        			{
        				b[j+q]=true;
                        if(j-q>=0)
        				b[j-q]=true;
                        i=j+r;
        			}
        			count++;
        			break;//����Ѱ��
        		}
        	}
        	if(!jud)//��û�ҵ���Ҫ��ǰ����
        	{
        		for(int j=i-1;j>i-r&&j>0;j--)
        		{
        			if(a[j]==1)
        			{
        				for(int q=1;q<r;q++)
        				{
        					b[j+1]=true;
        				}
        				jud=true;
        				count++;
        				i=j+r;
        				break;
        			}
        		}
        	}
        	if(!jud)
        	{
        		System.out.println(-1);
        		break;
        	}
        	index=i;
        	
        }
        //i  n֮��Ĵ���
        int q=n-r;
        while(q<n) {if(a[q]==0)q++;else break;}
        if(q==n-1&&a[q]==0) {System.out.println(-1);}
        else if(q-index<r) {System.out.println(count);}
        else
        {
        	int j= q-index;
        	boolean judge=false;
        	for(int qq=0;qq<r;qq++)
        	{
        		if(a[j-qq]==1)
        		{
        			count++;System.out.println(count);break;
        		}
        	}
        }
	}

}
