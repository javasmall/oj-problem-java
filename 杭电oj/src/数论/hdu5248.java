package 数论;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hdu5248 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int q=0;q<T;q++)
		{
			int n=sc.nextInt();
			List<Long>list=new ArrayList<Long>();
			for(int i=0;i<n;i++)
			{
				long te=sc.nextLong();
				int num=0;
				for(int j=2;(long)j*j<te+1;j++)
				{
					while(te%j==0)
					{
						list.add((long) j);
						te/=j;
						num++;
					}
					if(num>2)break;//其实找到两个就不用找了
				}
				if(te>1) {list.add(te);}
			}
			if(list.size()<2)
				System.out.println(-1);
			else {
				list.sort(null);
				System.out.println((long)(list.get(0)*list.get(1)));
			}
		}

	}
}
