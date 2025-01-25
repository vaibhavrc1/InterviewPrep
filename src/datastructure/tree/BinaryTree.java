package datastructure.tree;

import java.util.ArrayDeque;
import java.util.Queue;

// Time complexity: O(n)
// Space complexity: O(n) (n+1)/2 nodes at last level in queue
public class BinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        levelOrderTraversal(root);
    }

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode curr = root;
        queue.add(curr);
        int level = 0;
        int odd = 0, even = 0;
        while(!queue.isEmpty()){
            level++;
            int size = queue.size();
            while(size-- > 0){
                curr = queue.poll();
                System.out.print(curr.data + " ");
                if(level % 2 == 0){
                    even += curr.data;
                }
                else{
                    odd += curr.data;
                }
                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            System.out.println();
        }
        System.out.println("Odd sum:" + odd);
        System.out.println("Even sum:" + even);
        System.out.println("Difference:" + Math.abs(odd - even));
    }
}

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
    }
}
