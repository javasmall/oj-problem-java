package 链表;

public class node {
    public int value;//节点的结果
    node next;//下一个连接的节点
    public node(){}
    public node(int value)
    {
        this.value=value;
    }
    public void display()
    {
        System.out.println(value+" ");
    }
}
