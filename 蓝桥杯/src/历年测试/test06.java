package ¿˙ƒÍ≤‚ ‘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test06 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String chu=br.readLine();
		String end=br.readLine();
		char a1[]=chu.toCharArray();
		char a2[]=end.toCharArray();
		boolean b[]=new boolean[a1.length];
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==a2[i]) {b[i]=true;}
		}
		int time=0;
		//System.out.println(a1.length);
		for(int i=0;i<a1.length-1;i++)
		{
			if(b[i]==true) {}
			else if(b[i]==false)
			{
				if(b[i+1]==false) {time++;b[i]=true;b[i+1]=true;}
				else
				{
					time++;b[i+1]=!b[i+1];
				}
			}
		}
		System.out.println(time);
	}

}
