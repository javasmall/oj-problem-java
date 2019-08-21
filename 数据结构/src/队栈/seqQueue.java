package 队栈;

public class seqQueue<T> {
	private T data[];// 数组容器
	private int front;// 头
	private int rear;// 尾
	private int maxsize;// 最大长度

	public seqQueue(int i)// 设置长为i的int 型队列
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

	public void enQueue(T i) throws Exception// 入队
	{
		if (isfull())
			throw new Exception("已满");
		else {
			data[rear] = i;
			rear=(rear + 1) % maxsize;
		}
	}

	public T deQueue() throws Exception// 出队
	{
		if (isempty())
			throw new Exception("已空");
		else {
			T va=data[front];
			front=(front+1)%maxsize;
			return va;
		}
	}

	public String toString()// 输出队
	{
		String va="队头: ";
		int lenth=lenth();
		for(int i=0;i<lenth;i++)
		{
			va+=data[(front+i)%maxsize]+" ";
		}
		return va;
	}

}