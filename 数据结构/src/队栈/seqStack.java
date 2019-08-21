package ¶ÓÕ»;

public class seqStack<T> {
	
	private T data[];
	private int top;
	public seqStack() {
		data=(T[]) new Object[10];
		top=-1;
	}
	public seqStack(int maxsize)
	{
		data=(T[]) new Object[maxsize];
		top=-1;
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	int length()
	{
		return top+1;
	}
	
	boolean push(T value) throws Exception//Ñ¹ÈëÕ»
	{
		if(top+1>data.length-1)
		{
			throw new Exception("Õ»ÒÑÂú");
		}
		else {
			data[++top]=value;
			return true;
		}
	}
	T peek() throws Exception//·µ»ØÕ»¶¥ÔªËØ²»ÒÆ³ı
	{
		if(!isEmpty())
		{
			return data[top];
		}
		else {
			throw new Exception("Õ»Îª¿Õ");
		}
	}
	T pop() throws Exception
	{
		if(isEmpty())
		{
			throw new Exception("Õ»Îª¿Õ");
		}
		else {
		   return data[top--];
		}
	}
	public String toString()
	{
		if(top==-1)
		{
			return "";
		}
		else {
			String va="";
			for(int i=top;i>=0;i--)
			{
				va+=data[i]+"  ";
			}
			return va;
		}
	}
}
