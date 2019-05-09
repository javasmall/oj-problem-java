package 历年测试;

import java.util.Scanner;

public class test02 {
	static int end=0;//终止条件
	static char icon='$';//打印的图标
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		end=n;
		sc.close();
		n=5+2*(n*2);//整个图有多少行多少列
		char[][] map=new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				map[i][j]='.';
			}
		}
		paintMid(map);
		paint(map,0,n,0);
		show(map);
		//System.out.println(n);
	}
	//赋值四边
	public static void paint(char[][] map,int start ,int n,int count){
		if(count>=end)return;
		//赋值第一行，倒数第一行
		for(int i=start+2;i<n-2;i++){
			map[start][i]=icon;
			map[n-1][i]=icon;
		}
		//赋值第二行，倒数第二行
		map[start+1][start+2]=icon;
		map[start+1][n-3]=icon;
		map[n-2][start+2]=icon;
		map[n-2][n-3]=icon;
		//赋值第三行，倒数第三行
		int temp=0;//因为start不断变大，所以倒数的三列不能减去start来打印‘￥’,只能定义多一个变量
		for(int i=start;i<start+3;i++){
			//第三行
			map[start+2][i]=icon;
			map[start+2][n-1-temp]=icon;
			//倒数第三行
			map[n-3][i]=icon;
			map[n-3][n-1-temp]=icon;
			temp++;
		}
		//赋值左右两边
		for(int i=start+2;i<n-2;i++){
			map[i][start]=icon;
			map[i][n-1]=icon;
		//	System.out.println("aaaa");
		}
		count++;
		paint(map,start+2,n-2,count);//递归调用打印
	}
	//赋值中间的十字
	public static void paintMid(char[][] map){
		int midline=map.length/2;
		int j=end*2;
		for(int i=0;i<5;i++){
			map[midline][j+i]=icon;
			map[j+i][midline]=icon;
		}
	}//将图形打印出来
	public static void show(char[][] map){
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map.length;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}