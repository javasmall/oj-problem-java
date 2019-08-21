package LinerList;

public class seqlist<T> implements ListInterface<T> {
	private Object[] date;//数组存放数据
	private int lenth;
	public seqlist() {//初始大小默认为10
		Init(10);
	}

	public void Init(int initsize) {//初始化
		this.date=new Object[initsize];
		lenth=0;		
	}
	public int length() {		
		return this.lenth;
	}

	public boolean isEmpty() {//是否为空
		if(this.lenth==0)
			return true;
		return false;
	}

	/*
	 * * @param t	
	 * 返回相等结果，为-1为false
	 */
	public int ElemIndex(T t) {
		// TODO Auto-generated method stub
		for(int i=0;i<date.length;i++)
		{
			if(date[i].equals(t))
			{
				return i;
			}
		}
		return -1;
	}

	/*
	 *获得第几个元素
	 */
	public T getElem(int index) throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>lenth-1)
			throw new Exception("数值越界");
		return (T) date[index];
	}
	
	
	public void add(T t) throws Exception {//尾部插入
		 add(lenth,t);
	}

	/*
	 *根据编号插入
	 */
	public void add(int index, T t) throws Exception {
		if(index<0||index>lenth)
			throw new Exception("数值越界");
		if (lenth==date.length)//扩容
		{
			Object newdate[]= new Object[lenth*2];
			for(int i=0;i<lenth;i++)
			{
				newdate[i]=date[i];
			}
			date=newdate;
		}
		for(int i=lenth-1;i>=index;i--)//后面元素后移动
		{
			date[i+1]=date[i];
		}
		date[index]=t;//插入元素
		lenth++;//顺序表长度+1
		
	}

	public void delete(int index) throws Exception {
		if(index<0||index>lenth-1)
			throw new Exception("数值越界");
		for(int i=index;i<lenth;i++)//index之后元素前移动
		{
			date[i]=date[i+1];
		}
		lenth--;//长度-1	
	}

	

	@Override
	public void set(int index, T t) throws Exception {
		if(index<0||index>lenth-1)
			throw new Exception("数值越界");
		date[index]=t;
	}
	public String  toString() {
		String vaString="";
		for(int i=0;i<lenth;i++)
		{
			vaString+=date[i].toString()+" ";
		}
		return vaString;
		
	}
}
