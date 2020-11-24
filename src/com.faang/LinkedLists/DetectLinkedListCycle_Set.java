package com.faang.LinkedLists;

import java.util.HashSet;
import java.util.Set;

public class DetectLinkedListCycle_Set {
    public boolean hasCycle(ListNode head)
    {
        Set<ListNode> nodeSeen = new HashSet<>();
        while(head != null)
        {
            if(nodeSeen.contains(head))
            {
                return true;
            }
            else
            {
                nodeSeen.add(head);
            }
            head = head.next;
        }

        return false;
    }
}
