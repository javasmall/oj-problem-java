package Ë®;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
public class º¼µçoj1029 {
    public static void main(String[] args) throws IOException
    {    
    	StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out)); 
        int b[]=new int[1000000];
        while(in.nextToken()!=StreamTokenizer.TT_EOF)
        {            
        	int n=(int)in.nval;
            
            int time=1;
            int exe=-1;                         
            for(int i=0;i<n;i++)
            {
            	in.nextToken();
                b[i]=(int)in.nval;
                if(b[i]==exe) {time++;}
                else if(b[i]!=exe) {time--;if(time<=0) {exe=b[i];time=1;}}
            }                    
//            sort(b,0,n-1);            
            out.println(exe);
            out.flush();
        }
    }
}