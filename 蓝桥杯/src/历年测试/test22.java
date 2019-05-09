package 历年测试;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class test22 {
	static int a[];
	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		in.nextToken();
		int n = (int) in.nval;// 小岛的数量
		a = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			a[i] = -1;
		}
		in.nextToken();
		int m = (int) in.nval;// 桥的数量
		List<node> list = new ArrayList();
		for (int i = 0; i < m; i++) {
			in.nextToken();
			int x = (int) in.nval;
			in.nextToken();
			int y = (int) in.nval;
			in.nextToken();
			int z = (int) in.nval;
			list.add(new node(x, y, z));
		}
		list.sort(com);
		int day = Integer.MAX_VALUE;
		int count = 0;
		boolean b[] = new boolean[100001];
		for (int i = 0; i < m; i++) {
			node no = list.get(i);
			int x = no.x;
			int y = no.y;
			if (isunion(x, y)) {
			} // 如果已经联合说明不用那抗议
			else {
				union(x, y);
				if (!b[no.day]) {
					count++;
					b[no.day] = true;
				}
			}
		}
		out.println(count);
		out.flush();
	}
	private static void union(int x, int y) {
		int rootx = root(x);
		int rooty = root(y);
		if(-a[rootx]<-a[rooty])//优化树的大小   小数量的树并到大树上
		{
			int number=-a[rootx];
			a[rootx] = rooty;
			a[rooty]-=number;		
		}
		else
		{
			int number=-a[rooty];
			a[rooty]=rootx;
			a[rootx]-=number;
		}
		
	}
	private static boolean isunion(int x, int y) {
		if (root(x) == root(y) && root(x) != -1)
			return true;
		else
			return false;
	}

	private static int root(int x) {
		if (a[x] < 0) {
			return x;
		} else
			return root(a[x]);
	}

	static Comparator<node> com = new Comparator<node>() {
		public int compare(node a1, node a2) {
			return a2.day - a1.day;
		}
	};
static	class node {
		int x;
		int y;
		int day;

		public node(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
}

