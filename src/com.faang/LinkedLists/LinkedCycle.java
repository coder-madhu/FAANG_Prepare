package com.faang.LinkedLists;
import java.util.*;

class LLNode
{
    int data;
    LLNode next;
    LLNode(int d) {data = d; next = null; }
}

public class LinkedCycle {

    void removeCycle(LLNode head)
    {

        LLNode prev = null;
        LLNode  curr =head;
        HashSet<LLNode> hs=new HashSet<LLNode>();

        while(curr!=null)
        {
            if(!hs.contains(curr))
            {
                hs.add(curr);
                prev =curr;
                curr = curr.next;
            }
            else{
                prev.next= null;
                break;

            }

            while(head!=null){

                System.out.print(head.data);
            }

        }
    }

    public static void main(String[] args)
    {
        LLNode node = new LLNode(2);
     //   LLNode node = new LLNode(3);

    }
}


