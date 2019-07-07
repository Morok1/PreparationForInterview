package com.smagin.codingforinterview.binarysearch;


// Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

// Note:
// Given target value is a floating point.
// You are guaranteed to have only one unique value in the BST that is closest to the target.

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

public class ClosetBinarySearchTreeValue {
    //TODO Доделать
    public double closestValue(TreeNode root, double target) {
        double diff = 0d;

        if (Math.abs(root.getValue() - target) < diff) {
            diff = compute(root.getLeft(), target);
        } else {
            diff = compute(root.getRight(), target);
        }
        return 0;
    }



    public double compute(TreeNode node1, double target) {
        return Math.abs(node1.getValue() - target);
    }

    public class TreeNode {
        private double value;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
}
