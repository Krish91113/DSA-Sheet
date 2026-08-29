package Trees.BinaryTree;
import com.sun.source.tree.Tree;

import java.util.*;
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
public class Preorder {
    public static TreeNode buildTree(Scanner sc){
        System.out.println("Enter root: ");
        int value=sc.nextInt();
        if(value == -1) return null;
        TreeNode root=new TreeNode(value);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            System.out.println("Enter left child of"+ curr.val);
            int leftVal=sc.nextInt();
            if(leftVal!=-1){
                curr.left=new TreeNode(leftVal);
                q.offer(curr.left);
            }
            System.out.println("Enter right child of"+ curr.val);
            int rightVal=sc.nextInt();
            if(rightVal!=-1){
                curr.right=new TreeNode(rightVal);
                q.offer(curr.right);
            }
        }
        return root;
    }
    public static void preorder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val +"->");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=buildTree(sc);
        System.out.print("Preorder: ");
        preorder(root);
    }
}
