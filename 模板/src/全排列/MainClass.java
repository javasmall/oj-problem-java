package 全排列;

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
		         * head 无法作为标准返回，因为有可能在head前插入节点，单链表无法识别前节点，
		         * 需要引入新链表value 的next初始为head
		         * 这样就可以在value中对head进行操作
		         */
		        if(head == null)
		        {
		            return head;
		        }
		        ListNode movenodeqian=head;
		        ListNode movenode=movenodeqian.next;//移动到的节点
		        ListNode value=new ListNode(10000);//返回的结果 value.next
		        value.next=head;//从头开始
		        ListNode team=value;//每次从头遍历的节点，用节点的next.val作比较
		        while(movenode != null)
		        {
		           team=value;
		            while(team.next!=null&team.next.val<movenode.val)//不需要更换
		            {
		            	team=team.next;
		            }
		            //交换
		            if(team.next.val>=movenode.val&&team.next!=movenode) {
	                    movenodeqian.next=movenode.next;//跳过当前较小节点
	                    movenode.next=team.next;//插入
	                    team.next=movenode;
	                    movenode=movenodeqian.next;//指针归位，下次运算
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