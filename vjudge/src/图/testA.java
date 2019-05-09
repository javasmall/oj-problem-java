package м╪;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class testA {
    static int value;
	static boolean heng[];
	static boolean shu[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int n=sc.nextInt();
			int k=sc.nextInt();
			if(n==-1&&k==-1) {break;}
			char map[][]=new char[n][];
			 heng=new boolean[n];
			 shu=new boolean[n];
			for(int i=0;i<n;i++)
			{
				String s=sc.next();
				map[i]=s.toCharArray();
			}
			
			value=0;
			dfs(map,k,0,0);
		   System.out.println(value);
		}

	}
  private static void dfs(char[][] map, int k, int num,int index) {
		if(num==k) {value++;}
		else
		{
			int count=0;
			for(int i=index;i<map.length;i++)//апеепп
			{
				if(!heng[i])
				{
					heng[i]=true;
				  for(int j=0;j<map.length;j++)
				  {
					if(!shu[j]&&map[i][j]=='#')
					{
						shu[j]=true;
						dfs(map, k, num+1, i+1);
					    shu[j]=false;
					}
				  }
				  heng[i]=false;
				}
			}
		}		
	}

}
