package 搜索;
import java.util.Scanner;

public class 杭电oj1241 {
    static int d[][]= {{-1,0},{-1,1},{-1,-1},{0,1},{0,-1},{1,0},{1,-1},{1,1}};//八个方向
    static int m,n,number,value;
    static char a[][];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
             m=sc.nextInt();//行
             n=sc.nextInt();//列
            if(m==0&&n==0)break;
            sc.nextLine();
             a=new char[m][n];
            for(int i=0;i<m;i++)
            {
                String a1=sc.nextLine();
                a[i]=a1.toCharArray();
            }            
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(a[i][j]=='@')
                    {a[i][j]='*';number=0;dfs(i,j);value++;}
                }
            }
            System.out.println(value);
            value=0;
        }
        
    }
    private static void dfs(int x1, int y1) {
        
        for(int i=0;i<8;i++)            
        {
            if(x1+d[i][1]>=0&&x1+d[i][1]<m&&y1+d[i][0]>=0&&y1+d[i][0]<n)//不超届；
            {
                if(a[x1+d[i][1]][y1+d[i][0]]=='@'&&number<100)
                {
                    a[x1+d[i][1]][y1+d[i][0]]='*';
                    dfs(x1+d[i][1],y1+d[i][0]);
                }
            }
        }        
    }

}