package B模拟1;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(13&(1<<1));
		
		int n=5;//5个小球
	    for(int i=0; i<(1<<n); i++) //从0～2^5-1个状态
	    {
	        for(int j=0; j<n; j++) //遍历二进制的每一位
	        {
	            if((i&(1<<j))>0)//判断二进制第j位是否存在
	            {
	               System.out.print(j);;//如果存在输出第j个元素
	            }
	        }
	       System.out.println();
	    }



	}

}
