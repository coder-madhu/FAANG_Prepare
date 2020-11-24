package com.faang.LinkedLists;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val =x;
    }
}
public class deleteDuplicates {
    public ListNode deleteDuplicates(ListNode head)
    {
        ListNode current_node = head;
        while(current_node != null && current_node.next != null)
        {
            if(current_node.next.val == current_node.val)
            {
                current_node.next = current_node.next.next;
            }
            else
            {
                current_node = current_node.next;
            }
        }
        return head;
    }

}
