package ȫ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* -----------------------------------
 *  WARNING:
 * -----------------------------------
 *  Your code may fail to compile
 *  because it contains public class
 *  declarations.
 *  To fix this, please remove the
 *  "public" keyword from your class
 *  declarations.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//Definition for singly-linked list.
  class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
  class Solution {
	   public ListNode insertionSortList(ListNode head) {
	       /*
		         * head �޷���Ϊ��׼���أ���Ϊ�п�����headǰ����ڵ㣬�������޷�ʶ��ǰ�ڵ㣬
		         * ��Ҫ����������value ��next��ʼΪhead
		         * �����Ϳ�����value�ж�head���в���
		         */
		        if(head == null)
		        {
		            return head;
		        }
		        ListNode movenodeqian=head;
		        ListNode movenode=movenodeqian.next;//�ƶ����Ľڵ�
		        ListNode value=new ListNode(10000);//���صĽ�� value.next
		        value.next=head;//��ͷ��ʼ
		        ListNode team=value;//ÿ�δ�ͷ�����Ľڵ㣬�ýڵ��next.val���Ƚ�
		        while(movenode != null)
		        {
		           team=value;
		            while(team.next!=null&team.next.val<movenode.val)//����Ҫ����
		            {
		            	team=team.next;
		            }
		            //����
		            if(team.next.val>=movenode.val&&team.next!=movenode) {
	                    movenodeqian.next=movenode.next;//������ǰ��С�ڵ�
	                    movenode.next=team.next;//����
	                    team.next=movenode;
	                    movenode=movenodeqian.next;//ָ���λ���´�����
		            }
		            else {
		            	movenodeqian=movenode;
						movenode=movenode.next;
					}
		            
		        }
		        return value.next;     
	        
	    }
	}


public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            
            ListNode ret = new Solution().insertionSortList(head);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}