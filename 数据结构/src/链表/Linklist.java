package ����;

public class Linklist {
	   node first;//ͷ�ڵ�
	    public Linklist()
	    {
	        first=null;
	    }
	    int length() {
	        if(first==null) {return 0;}
	            int n=1;
	            node p=first;  
	            while(p.next!=null) {n++;p=p.next; }//
	            return n;
	    }
	    /*
	     * ͷ�����������ж�ͷ�ڵ��Ƿ�Ϊ�գ����ͷ�ڵ�Ϊ�գ�ͷ�ڵ��ָ��Ϊ�½ڵ�
	     * ���ͷ�ڵ㲻Ϊ�գ����½ڵ�ָ��ͷ�ڵ㣬����ʱ�½ڵ���ǰ��ͷ�ڵ�ָ���ں�
	     * ����ͷ�ڵ��� 2 5 6**  ��ô�½ڵ���� 3 2 5 6**
	     * �ٽ�ͷ�ڵ�ָ���½ڵ� ��ôͷ�ڵ���� 3 2 5 6**
	     * ӵ���˽ڵ㣬��ӵ������������������Ϊ��
	     */
	    public void insertfirst(int a) //��ͷ������
	    {
	        if(first==null)
	        {first=new node(a);}
	        else if(first!=null)
	        {
	        node p=new node(a);//�½ڵ�
	        p.next=first;//�ڵ�ָ��first
	        first=p;//firstָ���һλ��
	        }       
	    }
	    /*
	     * β����������������
	     * ���Ȼ���Ҫ�ж�ͷ�Ƿ�Ϊ��
	     * Ȼ�����ҵ����һ���ڵ㣬����
	     */
	    public void insertend(int b)//��β������
	    {
	        if(first==null)
	        {
	            first=new node(b);
	        }
	        else
	        {
	        node q=new node(b);//�½ڵ�
	        node p=first;
	        while(p.next!=null)
	        {
	            p=p.next;
	        }
	        p.next=q;
	        }
	    }
	    public void dispiay()//�����ȻҪ�ж�ͷ�ڵ�
	    {
	        if(first==null) {System.out.println("����Ϊ��");return;}        
	        node p=new node();
	        p.next=first;       
	        while(p.next!=null)
	        {
	            p=p.next;
	            System.out.println("value="+p.value);
	        }
	    }
	}