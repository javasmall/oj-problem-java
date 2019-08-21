package LinerList;

/*
 * ����ͷ�ڵ��
 */
public class doubleList<T> {
	private class node<T> {
		T data;
		node<T> pre;
		node<T> next;

		public node() {
		}

		public node(T data) {
			this.data = data;
		}
	}
	private node<T> head;// ͷ�ڵ�
	private node<T> tail;// β�ڵ�
	private int length;

	public doubleList() {
		head = null;
		tail = head;
		length = 0;
	}

	boolean isEmpty() {
		return length == 0 ? true : false;
	}

	void addfirst(T data) {
		node<T> teamNode = new node(data);
		if (isEmpty()) {
			head = teamNode;
			tail = teamNode;
			
		} else {
			teamNode.next = head;
			head = teamNode;
		}
		length++;
	}

	void add(T data)// β�ڵ����
	{
		node<T> teamNode = new node(data);
		if (isEmpty()) {
			head = teamNode;
			tail = teamNode;
		} else {
			tail.next = teamNode;
			teamNode.pre=tail;
			tail = teamNode;
		}
		length++;
	}
    int length()
    {
    	return length;
    }
	T getElum(int index)//Ϊ�˼�ͳһ��ͷ��
	{
		node<T> team=head;
		for(int i=0;i<index;i++)//����ͷ�ڵ�  ��������-1
		{
			team=team.next;
		}
		return team.data;
	}
	void add(int index, T data)// ��Ų���
	{
		if (index == 0) {
			addfirst(data);
		} else if (index == length) {
			add(data);
		} else {// ��ͷϷ
			node teampre = head;// Ϊ�����ǰqu
			for (int i = 0; i < index -1; i++)// ��ͷ�ڵ㣬index-1λ���ҵ�ǰ���ڵ�
			{
				teampre = teampre.next;
			}

			node<T> team = new node(data);// a c �в���B �Ҵ�a
			team.next = teampre.next;// B.next=c
			teampre.next.pre = team;// c.pre=B
			team.pre = teampre;// ����a B
			teampre.next = team;
			length++;
		}
	}
	void deletefirst()// ͷ��ɾ��
	{
		if (length == 1)// ֻ��һ��Ԫ��
		{
			head = null;
			tail = head;
			length--;
		} else {
			head = head.next;
			length--;
		}
	}
	 void deletelast() {
		if(length==1)
		{
			head=null;
			tail=head;
			length--;
		}
		else {
			
			tail.pre.next=null;
			tail=tail.pre;
			length--;
			
		}
	}
	 void delete(int index)
	 {
		 if(index==0)deletefirst();
		 else if (index==length-1) {
			deletelast();
		}
		 else {//ɾ�� Ϊ�����ͳһ��ͷ���Ǹ��ڵ�  
			node<T>team=head;
			for(int i=0;i<index-1;i++)
			{
				team=team.next;
			}
			//team ��ʱΪҪɾ����ǰ�ڵ�  a  c   ����B  aΪteam
			team.next.next.pre=team;//c��ǰ�����a
			team.next=team.next.next;//a�ĺ������c
			length--;
		}
	 }
    void set(int index,T data)
    {
    	node<T>team=head;
		for(int i=0;i<index-1;i++)
		{
			team=team.next;
		}
		team.data=data;
    }
	@Override
	public String toString() {
		node<T> team = head;
		String vaString = "";
		while (team != null) {
			vaString += team.data + " ";
			team = team.next;
		}
		return vaString;
	}
}
