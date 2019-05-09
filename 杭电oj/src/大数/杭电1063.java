package ´óÊý;
import java.io.BufferedInputStream;
import java.math.BigDecimal;
import java.util.Scanner;


public class º¼µç1063 {

    public static void main(String[] args) {
     BigDecimal a;
     int b;
     Scanner input = new Scanner(new BufferedInputStream(System.in));
     while(input.hasNext()){
      a=input.nextBigDecimal();
      b=input.nextInt();
      BigDecimal k=a;
      for(int i=1;i<b;i++){
          a=a.multiply(k);
      }
      String s=a.stripTrailingZeros().toPlainString();
      if("0".equals(s.substring(0,1))&&s.length()!=1){
          System.out.println(s.substring(1));
      }
      else
          System.out.println(s);
     }
    }
}
