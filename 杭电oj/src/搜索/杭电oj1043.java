package 搜索;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 杭电oj1043 {
    static int jiecheng[]= {1,1,2,6,24,120,720,5040,40320};
    public static void main(String[] args)  {
         Scanner sc=new Scanner(System.in);        
         char start[][]= {{'1','2','3'},{'4','5','6'},{'7','8','9'}};
        //char end[][]= {{1,2,3},{4,5,6},{7,8,9}};
        // System.out.println(kangtuo(start));
         int judgel[]=new int[362880];
         String path []=new String [362880];
         Queue<char[][]> q1=new ArrayDeque();
         judgel[0]=1;path[0]="";//初始化
         q1.add(start);
         while(!q1.isEmpty())
         {
            char[][]exa=q1.poll();
//            for(int i=0;i<3;i++)
//            {
//                for(int j=0;j<3;j++)
//                    System.out.print(exa[i][j]+" ");
//            }
            int kang=kangtuo(exa);//System.out.println(kang);            
             int x1=0,y1=0;
            for(int i=0;i<3;i++)//找打'x'的位置
            {
                for(int j=0;j<3;j++)
                {
                    if(exa[i][j]=='9')
                    {x1=i;y1=j;}//System.out.println(x1+" "+y1);
                    
                }
            }
            int k2=0;    
             {char[][]t2=r(exa,x1,y1); k2=kangtuo(t2);if(judgel[k2]==0) {q1.add(t2);path[k2]='l'+path[kang];judgel[k2]=1;}}    
             {char[][]t1=l(exa,x1,y1); k2=kangtuo(t1);if(judgel[k2]==0) {q1.add(t1);path[k2]='r'+path[kang];judgel[k2]=1;}}        
             {char[][]t4=down(exa,x1,y1); k2=kangtuo(t4);if(judgel[k2]==0) {q1.add(t4);path[k2]='u'+path[kang];judgel[k2]=1;}}
             {char[][]t3=up(exa,x1,y1);  k2=kangtuo(t3);if(judgel[k2]==0) {q1.add(t3);path[k2]='d'+path[kang];judgel[k2]=1;}}            
         }
         while(sc.hasNextLine())
         {
             String a=sc.nextLine();
            String a2[]=a.split(" ");                         
             char c[][]=new char[3][3];
             for(int i=0;i<9;i++)
             {                 
                 c[i/3][i%3]=a2[i].charAt(0);                 
             }
             String value=path[kangtuo(c)];
             if(value==null) {System.out.println("unsolvable"); }
             else if(value=="") {System.out.println("lr");}
             else  System.out.println(value); 
//             for(int i=0;i<100;i++)
//             {
//                 System.out.println(path[i]);
//             }
         }
    }
    static int kangtuo(char[][] start) {
        int m=0;int n=0;
        char b[]=new char[9];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                b[i*3+j]=start[i][j];
        }
        for(int i=0;i<9;i++)
        {
            m=0;
            for(int j=i+1;j<9;j++)
            {
                if(b[i]>b[j])m++;
            }
            n+=m*jiecheng[8-i];
        }
        return n;                        
    }
    static char[][] l (char a[][],int x1,int y1)
    {
        
        char b[][]=new char[3][3];
        b[0]=a[0].clone();
        b[1]=a[1].clone();
        b[2]=a[2].clone();
        if(y1>0) {
        char team=b[x1][y1];
        b[x1][y1]=b[x1][y1-1];
        b[x1][y1-1]=team;}
        return b;                
    }
    static char[][] r (char a[][],int x1,int y1)
    {
        char b[][]=new char[3][3];
        b[0]=a[0].clone();
        b[1]=a[1].clone();
        b[2]=a[2].clone();
        if(y1<2) {
        char team=b[x1][y1];
        b[x1][y1]=b[x1][y1+1];
        b[x1][y1+1]=team;}
        return b;                
    }
    static char[][] up (char a[][],int x1,int y1)
    {
        char b[][]=new char[3][3];
        b[0]=a[0].clone();
        b[1]=a[1].clone();
        b[2]=a[2].clone();
        if(x1==1||x1==2) {
        char team=b[x1][y1];
        b[x1][y1]=b[x1-1][y1];
        b[x1-1][y1]=team;}
        return b;                
    }
    static char[][] down (char a[][],int x1,int y1)
    {
        char b[][]=new char[3][3];
        b[0]=a[0].clone();
        b[1]=a[1].clone();
        b[2]=a[2].clone();
        if(x1==0||x1==1) {
        char team=b[x1][y1];
        b[x1][y1]=b[x1+1][y1];
        b[x1+1][y1]=team;}
        return b;                
    }
    
}