package �������;

import java.util.Scanner;

public class test02 {
	static int end=0;//��ֹ����
	static char icon='$';//��ӡ��ͼ��
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		end=n;
		sc.close();
		n=5+2*(n*2);//����ͼ�ж����ж�����
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
	//��ֵ�ı�
	public static void paint(char[][] map,int start ,int n,int count){
		if(count>=end)return;
		//��ֵ��һ�У�������һ��
		for(int i=start+2;i<n-2;i++){
			map[start][i]=icon;
			map[n-1][i]=icon;
		}
		//��ֵ�ڶ��У������ڶ���
		map[start+1][start+2]=icon;
		map[start+1][n-3]=icon;
		map[n-2][start+2]=icon;
		map[n-2][n-3]=icon;
		//��ֵ�����У�����������
		int temp=0;//��Ϊstart���ϱ�����Ե��������в��ܼ�ȥstart����ӡ������,ֻ�ܶ����һ������
		for(int i=start;i<start+3;i++){
			//������
			map[start+2][i]=icon;
			map[start+2][n-1-temp]=icon;
			//����������
			map[n-3][i]=icon;
			map[n-3][n-1-temp]=icon;
			temp++;
		}
		//��ֵ��������
		for(int i=start+2;i<n-2;i++){
			map[i][start]=icon;
			map[i][n-1]=icon;
		//	System.out.println("aaaa");
		}
		count++;
		paint(map,start+2,n-2,count);//�ݹ���ô�ӡ
	}
	//��ֵ�м��ʮ��
	public static void paintMid(char[][] map){
		int midline=map.length/2;
		int j=end*2;
		for(int i=0;i<5;i++){
			map[midline][j+i]=icon;
			map[j+i][midline]=icon;
		}
	}//��ͼ�δ�ӡ����
	public static void show(char[][] map){
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map.length;j++){
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}