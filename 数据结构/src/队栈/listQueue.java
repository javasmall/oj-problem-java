package ��ջ;

public class listQueue<T> {
	static class node<T> {
		T data;// �ڵ�Ľ��
		node next;// ��һ�����ӵĽڵ�
		public node() {}
		public node(T data) {
			this.data = data;
		}
	}
	node front;//�൱��head ��ͷ�ڵ��
	node rear;//�൱��tail/end
	public listQueue() {
		front=new node<T>();
		rear=front;
	}
	public int  lenth() {
		int len=0;
		node team=front;
		while(team!=rear)
		{
			len++;team=team.next;
		}
		return len;
	}
	public boolean isempty() {
		return rear == front;
	}
	public void enQueue(T value) // ���.β������
	{
		node va=new node<T>(value);
		rear.next=va;
		rear=va;
	}

	public T deQueue() throws Exception// ����
	{
		if (isempty())
			throw new Exception("�ѿ�");
		else {
			T va=(T) front.next.data;
			front.next=front.next.next;
			return va;
		}
	}
	public String toString()
	{
		node team=front.next;
		String va="��ͷ�� ";
		while(team!=null)
		{
			va+=team.data+" ";
			team=team.next;
		}
		return va;
	}
}
