package com.hongghe.basicjava.lab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hongghe 2018/8/24
 */
public class BinarySearchTree {

    private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchTree.class);

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        insert(root, 6);
        insert(root, 9);
        insert(root, 9);
    }

    public static void insert(TreeNode root, int key) {
        if (search(root, key) != null) {
            System.out.println("already has key");
            return;
        }
        TreeNode node = new TreeNode(key);
        if (root == null) {
            root = node;
        } else {
            TreeNode current = root;
            TreeNode parent;
            while (true) {
                parent = current;
                if (key < current.val) {
                    current = current.left;
                    if (current == null) {
                        parent.left = node;
                        System.out.println("insert " + node.val);
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = node;
                        System.out.println("insert " + node.val);
                        return;
                    }
                }
            }
        }
    }

    public static TreeNode search(TreeNode root, int key) {
        if (root == null) {
            LOGGER.info("The root is null");
            return null;
        }
        TreeNode node = root;
        while (key != node.val) {
            if (key < node.val) {
                node = node.left;
            } else {
                node = node.right;
            }
            if (node == null) {
                return null;
            }
        }
        return node;
    }
}

