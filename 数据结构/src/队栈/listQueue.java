package 队栈;

public class listQueue<T> {
	static class node<T> {
		T data;// 节点的结果
		node next;// 下一个连接的节点
		public node() {}
		public node(T data) {
			this.data = data;
		}
	}
	node front;//相当于head 带头节点的
	node rear;//相当于tail/end
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
	public void enQueue(T value) // 入队.尾部插入
	{
		node va=new node<T>(value);
		rear.next=va;
		rear=va;
	}

	public T deQueue() throws Exception// 出队
	{
		if (isempty())
			throw new Exception("已空");
		else {
			T va=(T) front.next.data;
			front.next=front.next.next;
			return va;
		}
	}
	public String toString()
	{
		node team=front.next;
		String va="队头： ";
		while(team!=null)
		{
			va+=team.data+" ";
			team=team.next;
		}
		return va;
	}
}
