package Bģ��1;

public class test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(13&(1<<1));
		
		int n=5;//5��С��
	    for(int i=0; i<(1<<n); i++) //��0��2^5-1��״̬
	    {
	        for(int j=0; j<n; j++) //���������Ƶ�ÿһλ
	        {
	            if((i&(1<<j))>0)//�ж϶����Ƶ�jλ�Ƿ����
	            {
	               System.out.print(j);;//������������j��Ԫ��
	            }
	        }
	       System.out.println();
	    }



	}

}
