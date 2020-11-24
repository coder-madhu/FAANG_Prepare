package com.faang.LinkedLists;


import java.util.Stack;

class ListNode2 {
       int val;
      ListNode2 next;
      ListNode2() {}
      ListNode2(int val) { this.val = val; }
      ListNode2(int val, ListNode2 next) { this.val = val; this.next = next; }
 }

public class ReverseLinkedListStack {
    // You can use the stack
    public ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<ListNode> ();

        while(head != null)
        {
            stack.push(head);
            head =head.next;

        }

        ListNode dummy = new ListNode(-1);
        head = dummy;

        while(!stack.isEmpty())
        {
            ListNode current = stack.pop();
            head.next = new  ListNode(current.val);
            head = head.next;
        }


        return dummy.next;

    }
}