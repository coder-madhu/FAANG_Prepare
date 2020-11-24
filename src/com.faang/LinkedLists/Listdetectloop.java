package com.faang.LinkedLists;

import java.util.*;

public class Listdetectloop {

    static Node head;

    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    static public void push(int new_data)
    {
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }


    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            if (s.contains(h))
                return true;
            s.add(h);

            h = h.next;
        }

        return false;
    }

    public static void main(String[] args)
    {
        Listdetectloop llist = new Listdetectloop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);


        llist.head.next.next.next.next = llist.head;

        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
}