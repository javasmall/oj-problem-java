package ȫ����;

import java.util.Scanner;

public class quanpailie1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int a[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		int b[] = new int[a.length];
		boolean b1[] = new boolean[a.length];// �ж��Ƿ���
		long startTime = System.currentTimeMillis();
		dfs(b1, a, b, 0);
		long endTime = System.currentTimeMillis();
		System.out.println("����ʱ��:" + (endTime - startTime) + "ms");
	}

	private static void dfs(boolean[] b1, int[] a, int b[], int index) {
		// TODO Auto-generated method stub
		int len = a.length;
		if (index == a.length)// ֹͣ
		{
//			if (b[0] == 0) {
//			} else {
//				for (int j : b) {
//					System.out.print(j + "  ");
//				}
//				System.out.println();
//			}
		} else
			for (int i = 0; i < len; i++) {
				if (!b1[i]) {
					b[index] = a[i];
					b1[i] = true;// �²㲻������
					dfs(b1, a, b, index + 1);
					b1[i] = false;// ��ԭ

				}
			}

	}
}
