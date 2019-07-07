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
    public double closestValue(TreeNode root, double target) {

    }

    public double compute(TreeNode node1, TreeNode node2) {
        return Math.abs(node1.getValue() - node2.getValue());
    }

    public class TreeNode {
        double value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }
}
