package ����;

public class test88 {

	static long x=0;static long y=0;//ȫ�ֱ���
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
        long b=19670206;long a=409459685;
		long q=tgcd(a,b);
        // long x1=x;
           if(1%q!=0) {System.out.println("Not Exist");}
            else {
        while(x<=0){//x*a+y*b=1  Ҫ��x>0��������Ҫ��x��С����ô�����������൱��+ab-ab�������տ�ʼ��û����
          x+=b;
          y-=a;
      }
       System.out.println(x);}
	}
	static long tgcd(long a,long b)
    {
        if(b==0) {x=1;y=0;return a;}
        long ans=tgcd(b,a%b);
        long team=x;
        x=y;
        y=team-a/b*y;
       // System.out.println(x);
        return ans;

    }
}
