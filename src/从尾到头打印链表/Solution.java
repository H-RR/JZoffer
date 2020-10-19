package 从尾到头打印链表;
import java.util.ArrayList;
import java.util.Stack;
  public class ListNode {
     int val;
      ListNode next = null;

               ListNode(int val) {
           this.val = val;
        }
    }


import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList();
        Stack<Integer> stack=new Stack();
        while(listNode!=null)
        {
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        while(!stack.empty())
        {
            list.add(stack.pop());
        }
        return list;
    }
}
