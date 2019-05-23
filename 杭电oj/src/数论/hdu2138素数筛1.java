package ����;

import java.util.Scanner;

public class hdu2138����ɸ1 {

	static boolean isprime[];
	static int prime[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getprimeoula();
		while (sc.hasNext()) {
			int n = sc.nextInt();
			int num = 0;
			for (int i = 0; i < n; i++) {
				int te = sc.nextInt();
				if (te < 100000) {
					if (!isprime[te])
						num++;
				} else {
					if (isprime(te))
						num++;
				}

			}
			System.out.println(num);
		}

	}

	static void getprime() {
		prime = new int[100001];// ��¼�ڼ���prime
		int index = 0;
		isprime = new boolean[1000001];
		for (int i = 2; i < 1000001; i++) {
			if (!isprime[i]) {
				prime[index++] = i;
			}
			for (int j = i + i; j < 1000000; j = j + i)// �������б�����over
			{
				isprime[j] = true;
			}
		}
	}

	static void getprimeoula()// ŷ��ɸ
	{
		prime = new int[100001];// ��¼�ڼ���prime
		int index = 0;
		isprime = new boolean[1000001];
		for (int i = 2; i < 1000001; i++) {
			if (!isprime[i]) {
				prime[index++] = i;
			}
			for (int j = 0; j < index && i * prime[j] < 1000001; j++) {
				isprime[i * prime[j]] = true;// �ҵ��������ı���������
				if (i % prime[j] == 0)
					break;// �ؼ���������
			}
		}

	}

	static boolean isprime(int val) {
		if (val <= 3)
			return true;
		for (int i = 2; i * i < val + 1; i++) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;
	}

}
