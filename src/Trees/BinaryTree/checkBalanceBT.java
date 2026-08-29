package Trees.BinaryTree;
import java.util.*;
public class checkBalanceBT {
    public static Node buildTree(Scanner sc){
        System.out.println("Enter root value: ");
        int value=sc.nextInt();
        if(value == -1) return null;
        Node root =new Node(value);
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node curr=q.poll();
            System.out.println("Enter left child of : " + curr.val);
            int leftVal=sc.nextInt();
            if(leftVal!=-1){
                curr.left=new Node(leftVal);
                q.offer(curr.left);
            }
            System.out.println("Enter right child of : " + curr.val);
            int rightVal=sc.nextInt();
            if(rightVal!=-1){
                curr.right=new Node(rightVal);
                q.offer(curr.right);
            }
        }
        return root;
    }
    public static int maxDepthInBT(Node root){
        if(root == null) return 0;
        return 1+Math.max(maxDepthInBT(root.left), maxDepthInBT(root.right));
    }
    public static boolean balanceBT(Node root){
        if(root == null) return true;
        int leftH=maxDepthInBT(root.left);
        int rightH=maxDepthInBT(root.right);
        if(Math.abs(leftH-rightH)>1) return false;
        return balanceBT(root.left) && balanceBT(root.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root=buildTree(sc);
        System.out.println(balanceBT(root));
    }
}
