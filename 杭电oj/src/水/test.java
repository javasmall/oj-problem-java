package ˮ;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
/*
 * ��̫С����   
 */
public class test {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		out.println("��������������");out.flush();;
		in.nextToken();
		int number=(int)in.nval;
		int sum=0;int studentnumber=number;
		while(number-->0)
		{
			in.nextToken();
			int score=(int)in.nval;
			sum+=score;
		}
		out.println("ѧ��ƽ���ɼ�Ϊ��"+(double)sum/studentnumber);
		out.println("ѧ���ܳɼ�Ϊ��"+sum);
		out.println();out.flush();
	}
}
