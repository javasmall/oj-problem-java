package LinerList;

public class seqlist<T> implements ListInterface<T> {
	private Object[] date;//����������
	private int lenth;
	public seqlist() {//��ʼ��СĬ��Ϊ10
		Init(10);
	}

	public void Init(int initsize) {//��ʼ��
		this.date=new Object[initsize];
		lenth=0;		
	}
	public int length() {		
		return this.lenth;
	}

	public boolean isEmpty() {//�Ƿ�Ϊ��
		if(this.lenth==0)
			return true;
		return false;
	}

	/*
	 * * @param t	
	 * ������Ƚ����Ϊ-1Ϊfalse
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
	 *��õڼ���Ԫ��
	 */
	public T getElem(int index) throws Exception {
		// TODO Auto-generated method stub
		if(index<0||index>lenth-1)
			throw new Exception("��ֵԽ��");
		return (T) date[index];
	}
	
	
	public void add(T t) throws Exception {//β������
		 add(lenth,t);
	}

	/*
	 *���ݱ�Ų���
	 */
	public void add(int index, T t) throws Exception {
		if(index<0||index>lenth)
			throw new Exception("��ֵԽ��");
		if (lenth==date.length)//����
		{
			Object newdate[]= new Object[lenth*2];
			for(int i=0;i<lenth;i++)
			{
				newdate[i]=date[i];
			}
			date=newdate;
		}
		for(int i=lenth-1;i>=index;i--)//����Ԫ�غ��ƶ�
		{
			date[i+1]=date[i];
		}
		date[index]=t;//����Ԫ��
		lenth++;//˳�����+1
		
	}

	public void delete(int index) throws Exception {
		if(index<0||index>lenth-1)
			throw new Exception("��ֵԽ��");
		for(int i=index;i<lenth;i++)//index֮��Ԫ��ǰ�ƶ�
		{
			date[i]=date[i+1];
		}
		lenth--;//����-1	
	}

	

	@Override
	public void set(int index, T t) throws Exception {
		if(index<0||index>lenth-1)
			throw new Exception("��ֵԽ��");
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
