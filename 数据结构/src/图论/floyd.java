package ͼ��;
public class floyd {
	static int max = 66666;// ��Intege.max �������Խ��Ϊ��
	public static void main(String[] args) {
		int dist[][] = {
				{ 0, 2, 3, 6, max, max }, 
				{ 2, 0, max, max,4, 6 }, 
				{ 3, max, 0, 2, max, max },
				{ 6, max, 2, 0, 1, 3 }, 
				{ max, 4, max, 1, 0, max }, 
				{ max, 6, max, 3, max, 0 } };// ��ͼ
		// 6��
		for (int k = 0; k < 6; k++)// �����k���ڵ�
		{
			for (int i = 0; i < 6; i++)// �ɳ�I��
			{
				for (int j = 0; j < 6; j++)// �ɳ�i��
				{
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
		// ���
		for (int i = 0; i < 6; i++) {
			System.out.print("�ڵ�"+(i+1)+" �����·���� ");
			for (int j = 0; j < 6; j++) {
				System.out.print(dist[i][j]+" ");
			}
			System.out.println();
		}
	}
}
