package controller;

import service.ValidateBST;
import BST.TreeNode;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static ValidateBST validateBST = new ValidateBST();

    public static void main(String[] args) {
        int rootVal = 0;
        TreeNode left;
        TreeNode right;;
        int size = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity of nods: ");
        size = input.nextInt();
        int[] nodes = new int[size];
        for (int i = 0; i < nodes.length; i++) {
            System.out.print("Node " + (i + 1) + ": ");
            nodes[i] = input.nextInt();
        }
        rootVal = nodes[0];
        TreeNode root = new TreeNode(rootVal);

        System.out.print("BST is valid: " + validateBST.isValidBST(root));
    }
}