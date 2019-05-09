package 历年测试;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class test23 {
	public static void main(String[] args) throws IOException {
	StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	in.nextToken();int n=(int)in.nval;//学生数量
	long count=0;
	in.nextToken();int k=(int)in.nval;//数字
	in.nextToken();int t=(int)in.nval;
    //1  7  22                            //1 2 3                  4 5 6              7 8 9
    long add=1;long first=1;
	for(int i=0;i<t;i++)
	{
		//System.out.println(count);
		count+=first%k;
		add=((long)(i*n+1+i*n+n)*n/2)%k;
		first+=add;
		first%=k;		
	}
	out.println(count);
	out.flush();
	}
}

