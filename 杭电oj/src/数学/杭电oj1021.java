package ��ѧ;

import java.util.Scanner;
/*
 * �ҹ��ɴ��
 * һ������������֮�͵����������������ֱ�������ĺͣ�ˮ��
 */
public class ����oj1021 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
        while(sc.hasNext())
        {
        	int n=sc.nextInt();
        	if(n%8==2||n%8==6)
        	{
        		System.out.println("yes");
        	}
        	else
        		System.out.println("no");
        }
	}
}
