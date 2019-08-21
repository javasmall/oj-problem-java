package 链表;

public class Linklist {
	   node first;//头节点
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
	     * 头部插入首先判断头节点是否为空，如果头节点为空，头节点的指向为新节点
	     * 如果头节点不为空，将新节点指向头节点，（暂时新节点在前，头节点指向在后）
	     * 将设头节点是 2 5 6**  那么新节点就是 3 2 5 6**
	     * 再将头节点指向新节点 那么头节点就是 3 2 5 6**
	     * 拥有了节点，就拥有了整个链表（个人认为）
	     */
	    public void insertfirst(int a) //从头部插入
	    {
	        if(first==null)
	        {first=new node(a);}
	        else if(first!=null)
	        {
	        node p=new node(a);//新节点
	        p.next=first;//节点指向first
	        first=p;//first指向第一位。
	        }       
	    }
	    /*
	     * 尾部插入相对容易理解
	     * 首先还是要判断头是否为空
	     * 然后在找到最后一个节点，插入
	     */
	    public void insertend(int b)//从尾部插入
	    {
	        if(first==null)
	        {
	            first=new node(b);
	        }
	        else
	        {
	        node q=new node(b);//新节点
	        node p=first;
	        while(p.next!=null)
	        {
	            p=p.next;
	        }
	        p.next=q;
	        }
	    }
	    public void dispiay()//输出依然要判断头节点
	    {
	        if(first==null) {System.out.println("链表为空");return;}        
	        node p=new node();
	        p.next=first;       
	        while(p.next!=null)
	        {
	            p=p.next;
	            System.out.println("value="+p.value);
	        }
	    }
	}