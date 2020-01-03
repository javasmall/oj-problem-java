package Í¼ÂÛ;

public class maze2 {
	static int X[]= {1,0,-1,0};
	static int Y[]= {0,1,0,-1};
	static int map[][];
	static boolean isvisit[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map=new int[6][6];
		isvisit=new boolean[6][6];
		dfs(0,0);
		

	}
	private static void dfs(int i, int j) {
		if(i>map.length||j>map[0].length) {return;}
		else if(!isvisit[i][j]) {
			System.out.println(i+" "+j);
			isvisit[i][j]=true;
			for(int q=0;q<4;q++)
			{
				dfs(i+X[i], j+Y[i]);
			}
		}
		
	}

}
