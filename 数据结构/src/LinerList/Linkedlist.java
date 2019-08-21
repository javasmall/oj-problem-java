package LinerList;


public class Linkedlist<T> implements ListInterface<T>{
	class node<T>{
	    T data;//节点的结果
	    node next;//下一个连接的节点
	    public node(){}
	    public node(T data)
	    {
	        this.data=data;
	    }
	    public node(T data, node next) {
	        this.data = data;
	        this.next = next;
	    }  
	}

	node head;
	private int length;
	public Linkedlist() {
		head=new node();
		length=0;
	}
	public void Init(int initsize) {
		head.next=null;
		
	}

	public int length() {
        return this.length;
	}

	
	public boolean isEmpty() {
		if(length==0)return true;
		else return false;
	}

	/*
	 * 获取元素编号
	 */
	public int ElemIndex(T t) {
		node team=head.next;
		int index=0;
		while(team.next!=null)
		{
			if(team.data.equals(t))
			{
				return index;
			}
			index++;
			team=team.next;
		}
		return -1;//如果找不到
	}

	@Override
	public T getElem(int index) throws Exception {
		node team=head.next;
		if(index<0||index>length-1)
		{
			throw new Exception("数值越界");
		}
		for(int i=0;i<index;i++)
		{
			team=team.next;
		}
		return (T) team.data;
	}


	public void add(T t) throws Exception {
		add(length,t);
		
	}
	//带头节点的插入，第一个和最后一个一样操作
	public void add(int index, T value) throws Exception {
		if(index<0||index>length)
		{
			throw new Exception("数值越界");
		}
		node<T> team=head;//team 找到当前位置node
		for(int i=0;i<index;i++)
		{
		     team=team.next;
		}
		node<T>node =new node(value);//新建一个node
		node.next=team.next;//指向index前位置的下一个指针
		team.next=node;//自己变成index位置	
		length++;
	}
	

	@Override
	public void delete(int index) throws Exception {
		if(index<0||index>length-1)
		{
			throw new Exception("数值越界");
		}
		node<T> team=head;//team 找到当前位置node
		for(int i=0;i<index;i++)//标记team 前一个节点
		{
		     team=team.next;
		}
		//team.next节点就是我们要删除的节点
		team.next=team.next.next;
		length--;
	}

	@Override
	public void set(int index, T t) throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>length-1)
		{
			throw new Exception("数值越界");
		}
		node<T> team=head;//team 找到当前位置node
		for(int i=0;i<index;i++)
		{
		     team=team.next;
		}
		team.data=t;//将数值赋值，其他不变
		
	}

	public String toString() {
		String va="";
		node team=head.next;
		while(team!=null)
		{
			va+=team.data+" ";
			team=team.next;
		}
		return va;
	}

}
