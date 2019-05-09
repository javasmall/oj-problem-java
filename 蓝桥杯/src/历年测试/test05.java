package ¿˙ƒÍ≤‚ ‘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		if(N==0) {return;}
		int m=0;int n=0;List<Integer>list=new ArrayList();
		for(int i=0;i<N;i++)
		{
			String s=br.readLine();
			String text="";
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(j)>='0'&&s.charAt(j)<='9')
				{
					text+=s.charAt(j)+"";
				}
				else
				{
					if(!text.trim().equals("")) {
						list.add(Integer.parseInt(text));
						text="";
					}
					else
					{text="";		}
				}
			}
			if(!text.trim().equals("")) {list.add(Integer.parseInt(text));text="";}
			
		}
		list.sort(null);
		for(int i=0;i<list.size()-1;i++)
		{
			if(list.get(i).equals(list.get(i+1))) {n=list.get(i);}
			else if(list.get(i+1).equals(list.get(i)+2)) {m=list.get(i)+1;}
			//if(m!=0&&n!=0) {break;}
		}
		System.out.println(m+" "+n);
	}
}
