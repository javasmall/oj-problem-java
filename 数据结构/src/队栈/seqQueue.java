package ��ջ;

public class seqQueue<T> {
	private T data[];// ��������
	private int front;// ͷ
	private int rear;// β
	private int maxsize;// ��󳤶�

	public seqQueue(int i)// ���ó�Ϊi��int �Ͷ���
	{
		data = (T[]) new Object[i+1];
		front = 0;
		rear = 0;
		maxsize = i+1;
	}

	public int  lenth() {
		return (rear+maxsize-front)%maxsize;
	}
	public boolean isempty() {
		return rear == front;
	}

	public boolean isfull() {
		return (rear + 1) % maxsize == front;
	}

	public void enQueue(T i) throws Exception// ���
	{
		if (isfull())
			throw new Exception("����");
		else {
			data[rear] = i;
			rear=(rear + 1) % maxsize;
		}
	}

	public T deQueue() throws Exception// ����
	{
		if (isempty())
			throw new Exception("�ѿ�");
		else {
			T va=data[front];
			front=(front+1)%maxsize;
			return va;
		}
	}

	public String toString()// �����
	{
		String va="��ͷ: ";
		int lenth=lenth();
		for(int i=0;i<lenth;i++)
		{
			va+=data[(front+i)%maxsize]+" ";
		}
		return va;
	}

}