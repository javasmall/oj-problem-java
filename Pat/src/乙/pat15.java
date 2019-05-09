package ““;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
   
public class pat15
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String fadr = sc.next();
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashMap<String, Node> nodes = new HashMap<String, Node>();
        List<Node> list = new ArrayList<Node>();
        for(int i=0;i<n;i++)
        {
             String address = sc.next();
             nodes.put(address, new Node(address, sc.nextInt(), sc.next()));
        }
        sc.close();
        while(!fadr.equals("-1"))
        {
            Node node = nodes.get(fadr);
            list.add(node);
            fadr=node.next;
        }
        for(int i = 0; i<list.size()-k; i+=k) {
            int l = i;
            int r = i+k-1;
            while(l<r){
                Node t = list.get(l);
                list.set(l, list.get(r));
                list.set(r, t);
                l++;
                r--;
            }
        }
        int i;
   
        for(i = 0; i<list.size()-1; i++) {
            Node node = list.get(i);
            System.out.println(node.address+" "+node.data+" "+list.get(i+1).address);
        }
        Node node = list.get(i);
        System.out.println(node.address+" "+node.data+" -1");
    }
    static class Node{
        String address;
        int data;
        String next;
   
        public Node(String address, int data, String next) {
            this.address = address;
            this.data = data;
            this.next = next;
        }
    }
}