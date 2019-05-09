package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class º¼µçoj1496 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer>map=new HashMap();
		while(sc.hasNext())
		{
			map.clear();
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			if(a>0&&b>0&&c>0&&d>0) {System.out.println(0);}
			else
			{
				
				for(int i=1;i<=100;i++)
				{
					for(int j=1;j<=100;j++)
					{
						
							int q=a*i*i+b*j*j;
							if(map.containsKey(q)) {map.put(q, map.get(q)+1);}
							else
							{
								map.put(q, 1);
							}
						
						
					}
				}
				int value=0;
				for(int i=1;i<101;i++)
				{
					for(int j=1;j<101;j++)
					{
					int q=-i*i*d-c*j*j;
					if(map.containsKey(q)) {value+=map.get(q);}
					}
				}
				value*=16;
				System.out.println(value);
			}
		}
	}
}
