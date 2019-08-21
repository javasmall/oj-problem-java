package 队栈;

import java.util.ArrayDeque;
import java.util.Queue;

public class test {
    public static void main(String[] args) throws Exception { 
        seqStack<String>s=new seqStack<String>();
        s.push("hello");
        s.push("54");
        s.push("bigsai");
        System.out.println(s.toString());
        s.push("欢迎关注公众号：");
        s.push("bigsai"); s.push("我快满了。");
        System.out.println("length:"+s.length()+"  ");
        System.out.println(s.toString());
        System.out.println(s.peek());
       // s.push("55");
        s.pop();s.pop();s.pop();
        System.out.println(s.toString());
        s.pop();s.pop();s.pop();
        System.out.println("isempty?"+ s.isEmpty());
        System.out.println("lenth:" + s.length());
        
        System.out.println();
        lisStack<String> s2=new lisStack<String>();
        s2.push("hello");
        s2.push("54");
        s2.push("bigsai");
        System.out.println(s2.toString());
        s2.push("欢迎关注公众号：");
        s2.push("bigsai"); s2.push("我快满了。");
        System.out.println("length:"+s2.length()+"  ");
        System.out.println(s2.toString());
        System.out.println(s2.peek());
       // s2.push("55");
        s2.pop();s2.pop();s2.pop();
        System.out.println(s2.toString());
        s2.pop();s2.pop();s2.pop();
        System.out.println("isempty?"+ s2.isEmpty());
        System.out.println("lenth:" + s2.length());
        System.err.println("关注公众号：bigsai，回复 数据结构 获得精心资料一份");         
    }
}