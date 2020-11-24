package com.faang.LinkedLists;

class SLLNode{

     int data;
    SLLNode next;
    SLLNode(int val) {
        data = val;
        next = null;
    }
}


public class LinkedListTemplate {

    SLLNode findMiddle(SLLNode  h){
        if(h == null)
            return h;

        SLLNode fp =h, sp =h;
        while(fp!= null && fp.next != null)
        {
            fp = fp.next.next;
            if(fp == null)
                return sp;
            sp = sp.next;

        }

        return sp;
    }

    SLLNode merge(SLLNode h1, SLLNode h2){
        if( h1 == null)
            return h2;
        if( h2 == null)
            return h1;
        h1.next =merge(h2,h1.next);

      return h1;


    }

    SLLNode revers(SLLNode h)
    {
        SLLNode c = h, p = null, n;
        while( c!= null)
        {
            n = c.next;
            c.next  = p;
            p = c;
            c = n;
        }
        return p;
    }

    void frontLastRearragne(SLLNode head) {
        //if (head == null) return null;
        SLLNode h1 = head;
        // Find middle node
        SLLNode mid = findMiddle(head);
        // psilt the last into 2 parts

        SLLNode h2 = mid.next;
        mid.next = null;
        h2 = revers(h2);
        merge(h1, h2);
    }

}
