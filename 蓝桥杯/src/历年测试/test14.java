package �������;

import java.util.Scanner;
public class test14 {
    /**
     * @param args
     * ��ϲ�����ת��Ϊ��ķ��
     */
    public static boolean f(int x[]){
        int sum=0;
        for(int i=0;i<x.length-1;i+=2){
            /*
             * ���������˲����̨��
             */
            sum^=(x[i+1]-x[i]-1);
        }
        return sum!=0;
    }
    //�κ���ƫ����Ϸ�����Ͽ���ת��Ϊ��ķ�ѡ�
    public static void solve(int x[]){
        for(int i=0;i<x.length-1;i++)
            for(int k=x[i]+1;k<x[i+1];k++){
                int old=x[i];
                try{
                    x[i]=k;//��̽
                    if(f(x)==false){
                        System.out.println(old+" "+k);
                        return;
                    }
                }finally{
                    x[i]=old;//����
                }
            }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*
        solve(new int[]{1,5,9});
        solve(new int[]{1,5,8,10});
        */
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String[] arrayA = A.split(" ");
        int[] a=new int[arrayA.length];
        for(int i=0;i<a.length;i++){
            a[i]=Integer.valueOf(arrayA[i]);
        }
        //���������aΪС������վ��λ�á�
        solve(a);
    }
}
