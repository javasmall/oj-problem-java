package ËÑË÷;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class poj2718 {

	static int min = Integer.MAX_VALUE;
	static int mid = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(in.readLine());
		for (int q = 0; q < t; q++) {
			String s[] = in.readLine().split(" ");
			int a[] = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			min = Integer.MAX_VALUE;
			mid = (a.length) / 2;
			arrange(a, 0, a.length - 1);
			out.println(min);
			out.flush();
		}
	}
	static void arrange(int a[], int start, int end) {

		if (start == end) {
//			for(int i:a)
//			{
//				System.out.print(i);
//			}
//			System.out.println();

			if ((a[0] == 0 && mid == 1) || (a[mid] == 0 && a.length - mid == 0) || (a[0] != 0 && a[mid] != 0)) {
				int va1 = 0;
				int va2 = 0;
				for (int i = 0; i < mid; i++) {
					va1 = va1 * 10 + a[i];
				}
				for (int i = mid; i < a.length; i++) {
					va2 = va2 * 10 + a[i];
				}
				min = min < Math.abs(va1 - va2) ? min : Math.abs(va1 - va2);
			}
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(a, start, i);
			arrange(a, start + 1, end);
			swap(a, start, i);
		}
	}

	static void swap(int arr[], int i, int j) {
		int te = arr[i];
		arr[i] = arr[j];
		arr[j] = te;
	}
}
