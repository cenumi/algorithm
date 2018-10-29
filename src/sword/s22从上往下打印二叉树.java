package sword;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class s22从上往下打印二叉树 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    /**
     *
     从上往下打印出二叉树的每个节点，同层节点从左至右打印
     */

    public static void main(String[] args) {

    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList arr = new ArrayList();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null){
            queue.offer(root);
            while (!queue.isEmpty()){
                TreeNode node = queue.poll();
                arr.add(node.val);
                if (node.left != null){
                    queue.offer(node.left);
                }
                if (node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return arr;
    }




}
