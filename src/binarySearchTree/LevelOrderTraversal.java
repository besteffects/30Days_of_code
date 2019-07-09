package binarySearchTree;
/*
A level-order traversal, also known as a breadth-first search, visits each level of a tree's nodes from left to right,
 top to bottom. You are given a pointer, root, pointing to the root of a binary search tree. Complete the levelOrder
 function provided in your editor so that it prints the level-order traversal of the binary search tree.
Hint: You'll find a queue helpful in completing this challenge.
 */

import java.util.*;
import java.io.*;

class LevelOrderTraversal {
    Node left, right;
    int data;

    LevelOrderTraversal(int data) {
        this.data = data;
        left = right = null;
    }
}

class Solution {

    static void levelOrder(Node root) {
        //Write your code here
        Queue<Node> queue = new LinkedList();
        // enqueue current root
        queue.add(root);

        // while there are nodes to process
        while (!queue.isEmpty()) {
            // dequeue next node
            Node tree = queue.remove();
            System.out.print(tree.data + " ");
            // process tree's root;

            // enqueue child elements from next level in order
            if (tree.left != null) {
                queue.add(tree.left);
            }
            if (tree.right != null) {
                queue.add(( tree.right ));
            }
        }
    }


    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
