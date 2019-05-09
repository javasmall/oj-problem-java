package dp;
import java.util.Arrays;
import java.util.Scanner;

public class 杭电oj1421 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int n,k;
            n = scan.nextInt();
            k = scan.nextInt();
            int[] w = new int[n+1];
            for(int i = 1;i<=n;i++)
                w[i] = scan.nextInt();
            int[][] dp = new int[n+1][k+1];
            Arrays.sort(w,1,n+1);

            //dp[i][j]表示前i件物品取j对的最优解
            //dp[i][j] = min(dp[i-1][j],dp[i-2][j-1]+(w[i]-w[i-1])^2
            //当i<2j时 dp[i][j]不存在不用考虑
            //当 i == 2j 时 dp[i-1][j]不存在，也就是说必须选第四个,也就意味着必须选第三个,所以dp[i][j] = dp[i-2][j-1]+(w[i]-w[i-1])^2
            for(int j = 1;j<=k;j++){
                for(int i = 2*j;i<=n;i++){
                    dp[i][j] = dp[i-2][j-1]+(w[i]-w[i-1])*(w[i]-w[i-1]);
                if(i > 2*j ){
                        dp[i][j] = min(dp[i-1][j],dp[i-2][j-1]+(w[i]-w[i-1])*(w[i]-w[i-1]));
                    }
                }
            }
            System.out.println(dp[n][k]);   
        }
    }

    private static int min(int i, int j) {
        return i<j?i:j;
    }


}