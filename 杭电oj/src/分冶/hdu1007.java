package 分冶;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Arrays;
import java.util.Comparator;
public class hdu1007 {
    static int n;
	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
         while(in.nextToken()!=StreamTokenizer.TT_EOF)
         {
        	 n=(int)in.nval;if(n==0) {break;}
        	node no[]=new node[n];
        	
        	 for(int i=0;i<n;i++)
        	 {
        		 in.nextToken();double x=in.nval;
        		 in.nextToken();double y=in.nval;
        		 no[i]=new node(x,y);
        	 }
        	 Arrays.sort(no, com);
        	double min= search(no,0,n-1);
        	out.println(String.format("%.2f", Math.sqrt(min)/2));out.flush();
         }         
	}
	private static double search(node[] no, int left,int right) {
		int mid=(right+left)/2;//中间
        double minleng=0;
        if(left==right) {return Double.MAX_VALUE;}//一个点没有距离之说，返回最大不影响
        //相邻直接返回两点距离
        else if(left+1==right) {minleng= (no[left].x-no[right].x)*(no[left].x-no[right].x)+(no[left].y-no[right].y)*(no[left].y-no[right].y);}
        else minleng= min(search(no,left,mid),search(no,mid,right));//左右侧小的那个
        int ll=mid;int rr=mid+1;
        while(no[mid].y-no[ll].y<=Math.sqrt(minleng)/2&&ll-1>=left) {ll--;}//从中间向左找到不在距离内的那个点
        while(no[rr].y-no[mid].y<=Math.sqrt(minleng)/2&&rr+1<=right) {rr++;}//从中间向右找到不在距离内的那个带
        for(int i=ll;i<rr;i++)
        {
            for(int j=i+1;j<rr+1;j++)
            {
                double team=0;
                if(Math.abs((no[i].x-no[j].x)*(no[i].x-no[j].x))>minleng) {continue;}
                else
                { 
                    team=(no[i].x-no[j].x)*(no[i].x-no[j].x)+(no[i].y-no[j].y)*(no[i].y-no[j].y);
                    if(team<minleng)minleng=team;
                }
            }
        }
        return minleng;	
	}
	private static double min(double a, double b) {		
		return a<b?a:b;
	}
	static Comparator<node>com=new Comparator<node>() {	
		public int compare(node a1, node a2) {			
			return a1.y-a2.y>0?1:-1;
		}};
	static class node
	{
		double x;
		double y;
		public node(double x,double y)
		{
			this.x=x;
			this.y=y;
		}
	}
}
