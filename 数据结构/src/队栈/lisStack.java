package ��ջ;

public class lisStack <T>{
	static class node<T>
	{
		T data;
		node next;
		public node() {    
		}
		public node(T value)
		{
			this.data=value;
		}
	}
	int length;
    node<T> head;//ͷ�ڵ�
    public lisStack() {
		head=new node<>();
		length=0;
	}
    boolean isEmpty()
	{
		return head.next==null;
	}
	int length()
	{
		return length;
	}
    public void push(T value) {//��ջ
       node<T> team=new node<T>(value);
       if(length==0)
       {
    	   head.next=team;
       }
       else {
		team.next=head.next;
		head.next=team;}
       length++;
    }
    public T peek() throws Exception {
        if(length==0) {throw new Exception("����Ϊ��");}
        else {//ɾ��
			return (T) head.next.data;
		}
  }
    public T pop() throws Exception {//��ջ
          if(length==0) {throw new Exception("����Ϊ��");}
          else {//ɾ��
        	T value=(T) head.next.data;
			head.next=head.next.next;//va.next
			length--;
			return value;
			
			
		}
    }
    public String toString(){
    	if(length==0) {return "";}
    	else {
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
}