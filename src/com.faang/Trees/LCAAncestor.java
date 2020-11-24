package com.faang.Trees;

class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1(int x) {
          val = x;
      }
 }


class LCAAncestor {

    public TreeNode1 lowestCommonAncestor(TreeNode1 root, TreeNode1 p, TreeNode1 q) {

        if( p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p, q);
        else if( p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right,p, q);
        else
            return root;


    }
}