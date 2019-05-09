package ÊýÂÛ;

import java.util.Scanner;


import java.util.*;
import java.math.BigInteger;
public class º¼µçoj1133{
    public static void main(String[] args){
            int a,b;
            Scanner in=new Scanner(System.in);
            int cnt=0;
            while(in.hasNext()){
                cnt++;
                a=in.nextInt();
                b=in.nextInt();
                BigInteger ans=BigInteger.ONE;
                if(a==0&&b==0)break;
                if(a<b) ans=BigInteger.ZERO;
                else {
                    for(int i=1;i<=a+b;i++){
                        ans=ans.multiply(BigInteger.valueOf(i));
                    }
                    int mpl=(a-b+1);
                    int dvd=(a+1);
                    ans=ans.multiply(BigInteger.valueOf(mpl));
                    ans=ans.divide(BigInteger.valueOf(dvd));
                }
                System.out.println("Test #"+cnt+":");
                System.out.println(ans);
            }
        }
}

