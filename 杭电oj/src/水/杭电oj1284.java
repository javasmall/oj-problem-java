package ˮ;
import java.util.Scanner;
/*
 * ����Ǯ���ⱳ������
 */
public class ����oj1284 {
    
    public static void main(String[] args) {    
           Scanner sc=new Scanner(System.in);
           int dp[][]=new int[4][32768];          
           for(int i=1;i<4;i++) {dp[i][0]=1;}
           for(int j=1;j<32768;j++) {dp[1][j]=1;}
          for(int i=1;i<4;i++) 
          {
            for(int j=1;j<32768;j++)
           {
               if(i>j) {dp[i][j]=dp[i-1][j];}
               else
                   dp[i][j]=dp[i-1][j]+dp[i][j-i];
           }
          }
          while(sc.hasNext())
          {
              int n=sc.nextInt();
              System.out.println(dp[3][n]);
          }
    }               
    }