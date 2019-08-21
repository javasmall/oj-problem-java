package LinerList;

public class loopList {

	private  class node
	{
		int data;
		node next;
		public node() {
		}
		public node(int data) {
			this.data=data;
		}
	}
	node head;
	node last;
	int length;
	public loopList() {
		length=0;
		head=new node();
		last=head;
		head.next=head;
	}
	void add(int value)
	{
		if(length==0)
		{
			head=new node(value);
		}
		else {
			node team=new node(value);
			team.next=last.next;//head
			last=team;
		}
	}
	void delete(int num)
	{
		node team=head;
		for(int i=0;i<num;i++)
		{
			team=team.next;
		}
		team.next=team.next.next;
	}

}
