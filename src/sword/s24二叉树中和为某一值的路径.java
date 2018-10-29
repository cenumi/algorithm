package sword;

import java.util.ArrayList;
import java.util.Stack;

public class s24二叉树中和为某一值的路径 {

    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    /**
     * 输入一颗二叉树的跟节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
     * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
     * (注意: 在返回值的list中，数组长度大的数组靠前)
     */
    public static void main(String[] args) {


    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        return null;
    }

    public void scan(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<ArrayList<Integer>> arrs = new ArrayList<>();

        stack.push(root);
        int sum = 0;
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left == null){

            }
            if (node.right == null){

            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }

        }
    }
}
