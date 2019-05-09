package 甲;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class pat20 {

	public static void main(String[] args) throws IOException {
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
		String s=in.readLine();
		int n=Integer.parseInt(s.split(" ")[0]);
		String a1=s.split(" ")[1];
		String b1=s.split(" ")[2];
		
		String a2=get(a1,n);
		String b2=get(b1,n);
		if(a2.equals(b2))
		{
			out.print("YES ");
			out.println(a2);
		}
		else
		{
			out.print("NO ");
			out.print(a2+" "+b2);
		}out.flush();
	}

	private static String get(String a1, int n) {
		if(!a1.contains(".")) {a1+=".0";}
		String end="000000";
		for(int i=0;i<n;i++)
		{
			end+="00";
		}
		a1+=end;//保证小数足够多
		int dian=a1.indexOf(".");//记录小数点的位置
	    if(dian>1)
	    {
//	    	System.out.print(dian+" ");
	    	int team=0;
	    	while(a1.charAt(0)=='0'&&team<dian-1)
	    	{
	    		team++;a1=a1.substring(1);
//	    		System.out.println(team+" "+a1);
	    	}
	    	dian-=team;
	    }
	    
		StringBuilder b1=new StringBuilder("0.");
//		System.out.println(a1+"              thedela");
		
		{int team2=0;
		if(Double.valueOf(a1)!=0)
		while(a1.charAt(team2)=='0'||a1.charAt(team2)=='.')
		{team2++;}
		for(int i=0;i<n;i++)
		{			
			if(a1.charAt(i+team2)=='.') {n++;}
			else 
				b1.append(a1.charAt(i+team2));
		}}
		b1.append("*10^");
		String exam="";
		double a222=Double.valueOf(a1);
		int a333=(int) a222;
		if(a333==0) {
			//处理前面的0
         int team=0;int index=2;
         
         while(a1.charAt(index++)=='0'&&index<a1.length())
         {
        	 team++;
         }
         if(index!=a1.length())
         exam="-"+team+"";
         else
 			exam="0";
		}
		
		
		else
			exam=dian+"";
		b1.append(exam);
		return b1.toString();
		
	}
}

