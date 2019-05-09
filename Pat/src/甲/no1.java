package ¼×;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class no1{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
		
		String a="a";
		char b=a.charAt(a.length()-1);
		System.out.println('a'-'9');
		Map<Integer,Integer>map=new TreeMap();
	    map.put(2, 5);
	    map.put(1, 9);
	    map.put(8, 2);
	    for(int e:map.keySet())
	    {
	    	System.out.println(e);
	    }
	
	}
	}
