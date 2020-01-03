package 图论;
public class floyd {
	static int max = 66666;// 别Intege.max 两个相加越界为负
	public static void main(String[] args) {
		int dist[][] = {
				{ 0, 2, 3, 6, max, max }, 
				{ 2, 0, max, max,4, 6 }, 
				{ 3, max, 0, 2, max, max },
				{ 6, max, 2, 0, 1, 3 }, 
				{ max, 4, max, 1, 0, max }, 
				{ max, 6, max, 3, max, 0 } };// 地图
		// 6个
		for (int k = 0; k < 6; k++)// 加入滴k个节点
		{
			for (int i = 0; i < 6; i++)// 松弛I行
			{
				for (int j = 0; j < 6; j++)// 松弛i列
				{
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		// 输出
		for (int i = 0; i < 6; i++) {
			System.out.print("节点"+(i+1)+" 的最短路径： ");
			for (int j = 0; j < 6; j++) {
				System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
	}
}
