package controller;

import service.ValidateBST;
import BST.TreeNode;

import java.util.Scanner;

public class Main {
    static ValidateBST validateBST = new ValidateBST();

    public static void main(String[] args) {
        int size = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity of nods: ");
        size = input.nextInt();
        int[] nodes = new int[size];
        for (int i = 0; i < nodes.length; i++) {
            System.out.print("Node " + (i + 1) + ": ");
            nodes[i] = input.nextInt();
        }
        Main tree = new Main();
        TreeNode root = tree.createTreeFromArray(nodes);

        System.out.print("BST is valid: " + validateBST.isValidBST(root));
    }

    public TreeNode createTreeFromArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return createTreeFromArray(array, 0);
    }

    // Рекурсивный метод для заполнения дерева
    private TreeNode createTreeFromArray(int[] array, int index) {
        if (index >= array.length) {
            return null;
        }

        TreeNode root = new TreeNode(array[index]);
        root.left = createTreeFromArray(array, 2 * index + 1);
        root.right = createTreeFromArray(array, 2 * index + 2);
        return root;
    }

}