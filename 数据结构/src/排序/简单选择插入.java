package ≈≈–Ú;

import java.util.LinkedList;
import java.util.List;

public class ºÚµ•—°‘Ò≤Â»Î {
	public static void main(String[] args)
	{
		List a=new LinkedList();
		a.add(25);
		a.add(14);
		a.add(29);
		a.add(90);
		a.add(5);
		a.add(13);
		a.add(69);
		a.add(7);
		sort(a);
		System.out.println(a);
	}

	private static void sort(List a) {
		int l=a.size();
		for(int i=0;i<l;i++)
			{
			int min=(int) a.get(i);
			int number=i;
			int team=(int) a.get(i);
			for(int j=i+1;j<l;j++ )
			{
				if((int)a.get(j)<min)
				{
					min=(int)a.get(j);
					number=j;
				}
			}
			a.set(i,min);
			a.set(number, team);
			}
	}

}
