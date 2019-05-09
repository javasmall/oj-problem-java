package µÝ¹é;
import java.util.Scanner;  
  
public class º¼µçoj2045{  
    public static void main(String[] args){  
        Scanner sc=new Scanner(System.in);  
        long[] nums=new long[51];  
        nums[0]=0;  
        nums[1]=3;  
        nums[2]=6;  
        nums[3]=6;  
        for(int i=4;i<51;i++){  
            nums[i]=nums[i-1]+nums[i-2]*2;  
        }  
        while(sc.hasNextInt()){  
            int num=sc.nextInt();  
            System.out.println(nums[num]);  
        }  
    }  
}