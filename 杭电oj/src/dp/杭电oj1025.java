package dp;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class º¼µçoj1025 {


    public static void main(String[] args)  {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
            int count = 1;

            String s;
            while (true) {
                s = br.readLine();
                if(s.equals(""))
                    continue;
                int n = Integer.parseInt(s.trim());

                int[] data = new int[n];
                for(int i = 0;i < n;i++){
                    String str = br.readLine().trim();
                    String[] strings = str.split(" ");
                    int f = 0;
                    int s1 = 0,s2 = 0;
                    for(int j = 0;j < strings.length;j++){
                        if(!strings[j].equals("")&&f ==0){
                            s1 = Integer.parseInt(strings[j]);
                            f = 1;
                        }
                        else if(!strings[j].equals("")&&f==1){
                            s2 = Integer.parseInt(strings[j]);
                        }

                    }
                    data[s1-1] = s2;
                }

                int[] B = new int[n];
                int len = 1;
                B[0] = data[0];
                for (int i = 1;i < n;i++){
                    int result = search(B,0,len-1,data[i]);
                    if(result == 1){
                        len++;
                    }
                }
                if(len>1){
                    System.out.println("Case "+count+":");
                    System.out.println("My king, at most "+len+" roads can be built.");
                    System.out.println();
                }
                else{
                    System.out.println("Case "+count+":");
                    System.out.println("My king, at most "+len+" road can be built.");
                    System.out.println();
                }
                count++;
            }
        }catch (Exception e){

        }

    }

    public static int search(int[] a, int h, int e, int number) {
        if (e == h) {
            if (a[e] > number) {
                a[e] = number;
                return 0;
            } else if (a[e] < number) {
                a[e + 1] = number;
                return 1;
            } else
                return -1;
        } else {
            int mid = 0;
            int result = 0;
            while (e != h) {
                mid = (e + h) / 2;
                if (a[mid] == number) {
                    result = mid;
                    break;
                } else if (a[mid] > number) {
                    e = mid;
                    result = e;
                } else {
                    h = mid + 1;
                    result = h;
                }

            }
            //ÕÒ²»µ½
            if (a[result] > number) {
                a[result] = number;
                return 0;
            } else if (a[result] < number) {
                a[result + 1] = number;
                return 1;
            } else {
                return -1;
            }
        }

    }
}