package LinerList;


public class Linkedlist<T> implements ListInterface<T>{
	class node<T>{
	    T data;//�ڵ�Ľ��
	    node next;//��һ�����ӵĽڵ�
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
	 * ��ȡԪ�ر��
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
		return -1;//����Ҳ���
	}

	@Override
	public T getElem(int index) throws Exception {
		node team=head.next;
		if(index<0||index>length-1)
		{
			throw new Exception("��ֵԽ��");
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
	//��ͷ�ڵ�Ĳ��룬��һ�������һ��һ������
	public void add(int index, T value) throws Exception {
		if(index<0||index>length)
		{
			throw new Exception("��ֵԽ��");
		}
		node<T> team=head;//team �ҵ���ǰλ��node
		for(int i=0;i<index;i++)
		{
		     team=team.next;
		}
		node<T>node =new node(value);//�½�һ��node
		node.next=team.next;//ָ��indexǰλ�õ���һ��ָ��
		team.next=node;//�Լ����indexλ��	
		length++;
	}
	

	@Override
	public void delete(int index) throws Exception {
		if(index<0||index>length-1)
		{
			throw new Exception("��ֵԽ��");
		}
		node<T> team=head;//team �ҵ���ǰλ��node
		for(int i=0;i<index;i++)//���team ǰһ���ڵ�
		{
		     team=team.next;
		}
		//team.next�ڵ��������Ҫɾ���Ľڵ�
		team.next=team.next.next;
		length--;
	}

	@Override
	public void set(int index, T t) throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>length-1)
		{
			throw new Exception("��ֵԽ��");
		}
		node<T> team=head;//team �ҵ���ǰλ��node
		for(int i=0;i<index;i++)
		{
		     team=team.next;
		}
		team.data=t;//����ֵ��ֵ����������
		
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
