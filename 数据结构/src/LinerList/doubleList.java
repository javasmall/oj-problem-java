package LinerList;

/*
 * 不带头节点的
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
	private node<T> head;// 头节点
	private node<T> tail;// 尾节点
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

	void add(T data)// 尾节点插入
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
	T getElum(int index)//为了简单统一从头找
	{
		node<T> team=head;
		for(int i=0;i<index;i++)//不带头节点  遍历次数-1
		{
			team=team.next;
		}
		return team.data;
	}
	void add(int index, T data)// 编号插入
	{
		if (index == 0) {
			addfirst(data);
		} else if (index == length) {
			add(data);
		} else {// 重头戏
			node teampre = head;// 为插入的前qu
			for (int i = 0; i < index -1; i++)// 无头节点，index-1位置找到前驱节点
			{
				teampre = teampre.next;
			}

			node<T> team = new node(data);// a c 中插入B 找打a
			team.next = teampre.next;// B.next=c
			teampre.next.pre = team;// c.pre=B
			team.pre = teampre;// 关联a B
			teampre.next = team;
			length++;
		}
	}
	void deletefirst()// 头部删除
	{
		if (length == 1)// 只有一个元素
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
		 else {//删除 为了理解统一从头找那个节点  
			node<T>team=head;
			for(int i=0;i<index-1;i++)
			{
				team=team.next;
			}
			//team 此时为要删除的前节点  a  c   插入B  a为team
			team.next.next.pre=team;//c的前驱变成a
			team.next=team.next.next;//a的后驱变成c
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
