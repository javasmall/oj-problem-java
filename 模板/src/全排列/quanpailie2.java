package 全排列;

import java.util.Scanner;

public class quanpailie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s[] = sc.nextLine().split(" ");
		int a[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		long startTime = System.currentTimeMillis();
		arrange(a, 0, a.length - 1);
		long endTime = System.currentTimeMillis();
		System.out.println("运行时间:" + (endTime - startTime) + "ms");
	}
	static void arrange(int a[], int start, int end) {

		if (start == end) {		
//			for (int i : a) {
//				System.out.print(i);
//			}
//			System.out.println();
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(a, i, start);
			arrange(a, start + 1, end);
			swap(a, i, start);
		}
	}

	static void swap(int arr[], int i, int j) {
		int te = arr[i];
		arr[i] = arr[j];
		arr[j] = te;
	}
}
