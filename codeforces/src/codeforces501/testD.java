package codeforces501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class testD {

	public static void main(String[] args) throws IOException {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		 PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
         in.nextToken();int n=(int)in.nval;//房子数量
         in.nextToken();long k=(long)in.nval;//次数
         in.nextToken();long s=(long)in.nval;//到达
         if(k*(n-1)<s||k>s) {out.println("NO");}
         else
         {
        	 out.println("YES");
        	 int room=1;
        	while(k-->0)
        	{
        		long move=(s-k)>(n-1)?(n-1):(s-k);
        		s-=move;
        		if(room+move>n) {room-=move;out.print(room+" ");}
        		else
        		{room+=move;out.print(room+" ");}
        	}
         }
         out.flush();
         

	}

}
