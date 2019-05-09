package codeforces504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testA {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        in.nextToken();
        int n=(int)in.nval;
        for(int i=0;i<n;i++)
        {
        	in.nextToken();
        	int l=(int)in.nval;
        	boolean b=true;
        	in.nextToken();String a=in.sval;
        	
        	int mid=l/2;
        	int mid2=mid-1;
        	while(mid2>=0)
        	{
//        		if(a.charAt(mid2)=='a'||a.charAt(mid)=='a'||a.charAt(mid2)=='z'||a.charAt(mid)=='z')
//        		{
//        			if(Math.abs(a.charAt(mid2)-a.charAt(mid))>1)
//        			{
//        				b=false;break;
//        			}
//        		}
//        		else
        			if(Math.abs(a.charAt(mid2)-a.charAt(mid))>2||Math.abs(a.charAt(mid2)-a.charAt(mid))==1)
        			{b=false;break;}
        		mid++;
        		mid2--;
        	}
        	if(b) {out.println("YES");}
        	else out.println("NO");
        	out.flush();
        }

	}

}
