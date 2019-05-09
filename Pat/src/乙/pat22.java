package 乙;
/*
 * hashmap的运用
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class pat22 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		Map<Integer,Integer>map=new HashMap();
		for(int i=0;i<n;i++)
		{
			int w=sc.nextInt();
			int m=sc.nextInt();
			if(map.containsKey(w))
			{
				map.put(w, map.get(w)+m);
			}
			else
				map.put(w, m);
		}
		int index=0,value=0;
		Iterator it=map.keySet().iterator();
		while(it.hasNext())
		{
			int a=(int) it.next();
			if(map.get(a)>value)
			{
				value=map.get(a);
				index=a;
			}			
		}
		System.out.println(index+" "+value);		
	}
}
