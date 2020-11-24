package com.faang.Trees;

public class sortedListBST {
///Input: head = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;

            TreeNode() {
            }

            TreeNode(int val) {
                this.val = val;
            }

            TreeNode(int val, TreeNode left, TreeNode right) {
                this.val = val;
                this.left = left;
                this.right = right;
            }
        }


        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) {
                return null;
            }

            ListNode middle = findMiddle(head); // getting mid
            TreeNode node = new TreeNode(middle.val);

            if (head == middle) {
                return node;
            }

            node.left = sortedListToBST(head);

            node.right = sortedListToBST(middle.next);

            return node;
        }


        ListNode findMiddle(ListNode  h){
            if(h == null)
                return h;

            ListNode fp =h, sp =h;
            while(fp!= null && fp.next != null)
            {
                fp = fp.next.next;
                if(fp == null)
                    return sp;
                sp = sp.next;

            }

            return sp;
        }


    }
}
