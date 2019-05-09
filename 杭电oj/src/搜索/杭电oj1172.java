package 搜索;
import java.text.DecimalFormat; // DecimalFormat df = new DecimalFormat("#0.000");
import java.util.Scanner;
import java.math.*;
import java.io.*;
import java.text.*;
import java.util.Arrays; // Arrays.sort(s);
import java.math.BigInteger;
import java.util.Queue;
import java.util.LinkedList;

//Queue<node> queue = new LinkedList<node>();  声明队列
public class 杭电oj1172 {
    public static final double PI = 3.1415927;

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        // int t = cin.nextInt();
        // int Case = 0;
        while (cin.hasNext()) {
            int n = cin.nextInt();
            if (n == 0)
                break;
            int[] a = new int[105];
            int[] b = new int[105];
            int[] c = new int[105];
            for (int i = 1; i <= n; i++) {
                a[i] = cin.nextInt();
                b[i] = cin.nextInt();
                c[i] = cin.nextInt();
            }
            int number = 0;
            int ans = 1000;
            for (int i = 1000; i <= 9999; i++) {
                if (check(i, n, a, b, c) == 1) {
                    number++;
                    ans = i;
                    if (number >= 2)
                        break;
                }
            }
            if (number >= 2) {
                System.out.println("Not sure");
            } else {
                System.out.println(ans);
            }
        }

    }

    public static int check(int number, int n, int a[], int b[], int c[]) {
        int vis1[] = new int[10];
        int vis2[] = new int[10];
        int ok = 1;
        for (int i = 1; i <= n; i++) {
            int res = number;
            int ans = a[i];
            int ok1, ok2;
            ok1 = ok2 = 0;
            int cnt = 0;
            while (res != 0) {
                vis1[cnt] = res % 10;
                vis2[cnt++] = ans % 10;
                if (res % 10 == ans % 10)
                    ok2++;
                res /= 10;
                ans /= 10;
            }
            for (int k = 0; k < 4; k++) {
                for (int z = 0; z < 4; z++) {
                    if (vis1[k] == vis2[z] && vis2[z] != -1) {
                        ok1++;
                        vis2[z] = -1;
                        break;

                    }
                }
            }
            for (int k = 0; k < 4; k++) {
                vis1[k] = vis2[k] = 0;
            }
            if (ok1 != b[i] || ok2 != c[i]) {
                ok = 0;
                break;
            }
        }
        return ok;
    }
}