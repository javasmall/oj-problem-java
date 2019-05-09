package ¼×;
/*
 * ×ªÒå×Ö·û¡°.¡±
 */
import java.util.Scanner;

public class pat18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String a=s.split(" ")[0];
		String b=s.split(" ")[1];
		String a1[]=a.split("\\.");
		String b1[]=b.split("\\.");
		int team=0;
		int kunt=Integer.parseInt(a1[2])+Integer.parseInt(b1[2]);
        if(kunt>=29) {kunt-=29;team++;}
        int sick=Integer.parseInt(a1[1])+Integer.parseInt(b1[1])+team;
        team=0;
        if(sick>=17) {sick-=17;team++;}
        int gal=Integer.parseInt(a1[0])+Integer.parseInt(b1[0])+team;
        System.out.println(gal+"."+sick+"."+kunt);
	}

}
