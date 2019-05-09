package 甲;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStream;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.io.PrintWriter;
	import java.io.StreamTokenizer;
	import java.util.HashMap;
	import java.util.Map;
	
	public class pat27 {
	
		public static void main(String[] args) throws IOException {
			// TODO 自动生成的方法存根
			BufferedReader in=(new BufferedReader(new InputStreamReader(System.in)));
			PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));
			String s="";
			Map<String,Integer>map=new HashMap();
			while((s=in.readLine())!=null)
			{
	                char[]a=s.toLowerCase().toCharArray();String team="";
	                for(int i=0;i<a.length;i++)
	                {
	                	
	                	if((a[i]>='a'&&a[i]<='z')||(a[i]>='0'&&a[i]<='9'))
	                	{
	                		team+=a[i];
	                	}
	                	else if(team.length()>0)
	                	{
	        				if(map.containsKey(team)) {map.put(team, map.get(team)+1);}
	        				else map.put(team, 1);
	        				team="";
	        			}
	                }
	               int big=0;
	                for(String str:map.keySet())
	                {
	                	           
	                	if(map.get(str)>big) {big=map.get(str);team=str;}
	                	else if(map.get(str)==big) {
	                	if(str.startsWith(team)) {}
	                	else if(team.startsWith(str)) {team=str;}
	                	else {
	                		int index=0;
	                		while((team.charAt(index)-str.charAt(index))==0){index++;}
	                		team=(team.charAt(index)-str.charAt(index))>0?str:team;
	                	}
	                	}
	                }
	                out.println(team+" "+big);out.flush();
			}
		}
	
	}
