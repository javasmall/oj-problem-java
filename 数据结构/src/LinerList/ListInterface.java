package LinerList;

public interface ListInterface<T> {	
	void Init(int initsize);//��ʼ����
	int length();
	boolean isEmpty();//�Ƿ�Ϊ��
	int ElemIndex(T t);//�ҵ����
	T getElem(int index) throws Exception;//����index��ȡ����
	void add(int index,T t) throws Exception;//����index��������
	void delete(int index) throws Exception;
	void add(T t) throws Exception;//β������
	void set(int index,T t) throws Exception;
	String toString();//ת��String���	
}
