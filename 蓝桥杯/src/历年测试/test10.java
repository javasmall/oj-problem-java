package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.List;

public class test10 {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		in.nextToken();
		int a=(int)in.nval;
		in.nextToken();int b=(int)in.nval;
		List<Integer> list=new ArrayList();
		for(int i=1;i<b*2;i+=2)
		{
			list.add(i);
		}		
		int index=1;
		while(list.get(index)*2<b)
		{
			int k=list.get(index++);//第一个数 减去位置
			for(int j=list.size();j>0;j--)
			{
				if(j%k==0) {list.remove(j-1);}
			}
		}
		index=0;
		while(list.get(index++)<=a){}
		int count=0;
		if(list.get(index)>b)System.out.println(0);
		else {
		while(list.get(index++)<b) {count++;}
		System.out.println(count+1);}
	}
}
