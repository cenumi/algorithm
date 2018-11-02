package sword;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 序列化二叉树 {

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
     请实现两个函数，分别用来序列化和反序列化二叉树

     */

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        node4.left = node8;
        System.out.println(new 序列化二叉树().Serialize(root));

    }

    String Serialize(TreeNode root) {
        if (root == null)
            return "#!";
        return root.val + "!" + Serialize(root.left) + Serialize(root.right);
    }
    int index = -1;

    TreeNode Deserialize(String str) {
        index++;
        String[] strr = str.split("!");
        TreeNode node = null;
        if (!strr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(strr[index]));
            node.left = Deserialize(str);
            node.right = Deserialize(str);
        }
        return node;

    }

}
