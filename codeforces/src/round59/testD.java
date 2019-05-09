package round59;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testD {

	static String s[]= {"0000","0001","0010","0011","0100","0101","0110","0111","1000","1001","1010","1011","1100","1101","1110","1111"};
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自动生成的方法存根
		BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int a=Integer.parseInt(in.readLine());
		char m[][]=new char[a][a];
		String team="";
		for(int i=0;i<a;i++)
		{
			String string=in.readLine();
			//int n=Integer.parseInt(string)/4;
			for(int q=0;q<a/4;q++)
			{
				
			}
			char a1=string.charAt(0);char a2=string.charAt(1);
			team="";
			if('A'<=a1&&a1<='F') {team+=s[(int)(a1-'A')];}
			else team+=s[(int)(a1-'0')];
			if('A'<=a2&&a2<='F') {team+=s[(int)(a2-'A')];}
			else team+=s[(int)(a2-'0')];
			m[i]=team.toCharArray();
		}
		int value=1;
		boolean jud=false;
		for(int i=2;i<a;i++)
		{
			//heng
		  for(int k=0;k<a;k++) {//横行
			int t=0;//xunhuan
			char te='.';
			for(int j=0;j<a;j++)
			{
				if(t==0) {te=m[k][j];}
				else if(te!=m[k][j]) {
					jud=true;break;				
				}
				else {
					continue;
				}
				if(t==i) {t=0;}
				else {t++;}
				
			}
			if(jud) {break;}		
		}
		  if(!jud) {
			  for(int k=0;k<a;k++) {//shu行
					int t=0;//xunhuan
					char te='.';
					for(int j=0;j<a;j++)
					{
						if(t==0) {te=m[j][k];}
						else if(te!=m[j][k]) {
							jud=true;break;				
						}
						else {
							continue;
						}
						
					}
					if(jud) {break;}		
				}
		  }
		}
		
	}

}
