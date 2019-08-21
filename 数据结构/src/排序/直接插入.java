package 排序;

import java.util.LinkedList;
import java.util.List;

public class 直接插入 {
	public static void main(String[] args)
	{
		List a=new LinkedList();//链表集合
		a.add(5);
	    a.add(9);
	    a.add(1);
	    a.add(4);
	    a.add(89);
	    a.add(50);
	    a.add(7);
	    a.add(43);
	    pai(a);
	    System.out.println(a);
	}

	private static void pai(List a) {
		int l=a.size();
		for(int i=1;i<a.size();i++)
		{
			for(int j=0;j<i;j++)
			{
				if((int)a.get(j)>(int)a.get(i))//强制转换
				{
					int team=(int) a.get(j);
					a.add(j,a.get(i) );
					a.remove(i+1);
				}
			}
		}
		
	}

}
