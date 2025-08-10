package controller;

import service.ValidateBST;
import BST.TreeNode;

import java.util.Scanner;

public class Main {
    static ValidateBST validateBST = new ValidateBST();

    public static void main(String[] args) {
        int rootVal = 0;
        Scanner input = new Scanner(System.in);
        rootVal = input.nextInt();

        TreeNode root = new TreeNode(rootVal); //Нужно добавить ещё ветвей

        System.out.print("BST is valid: " + validateBST.isValidBST(root));
    }
}
