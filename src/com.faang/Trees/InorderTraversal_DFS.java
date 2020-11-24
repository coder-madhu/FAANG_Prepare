package com.faang.Trees;

import java.util.*;

class TreeNode {
        int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
   }
  }

public class InorderTraversal_DFS {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Set<TreeNode> visited = new HashSet<>();
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.addLast(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.removeLast();
            if (visited.contains(node)) {
                result.add(node.val);
            } else {
                visited.add(node);
                if (node.right != null) stack.addLast(node.right);
                stack.addLast(node);
                if (node.left != null) stack.addLast(node.left);
            }
        }
        return result;
    }
}