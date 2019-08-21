package LinerList;

public interface ListInterface<T> {	
	void Init(int initsize);//初始化表
	int length();
	boolean isEmpty();//是否为空
	int ElemIndex(T t);//找到编号
	T getElem(int index) throws Exception;//根据index获取数据
	void add(int index,T t) throws Exception;//根据index插入数据
	void delete(int index) throws Exception;
	void add(T t) throws Exception;//尾部插入
	void set(int index,T t) throws Exception;
	String toString();//转成String输出	
}
