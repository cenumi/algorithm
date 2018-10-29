package 二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 判断搜索二叉树完全二叉树 {
    /**
     * 二叉树的中序遍历的结果是依次升序的就是搜索二叉树
     * （通常不存在重复节点）
     */


    public static void main(String[] args) {

    }

    public static boolean isBST(TreeNode head){
        if (head == null)
            return true;
        Stack<TreeNode> s = new Stack<>();
        int pre = Integer.MIN_VALUE;
        while (!s.isEmpty() || head!=null){
            if (head != null){
                s.push(head);
                head = head.left;
            }else{
                head = s.pop();
                if (head.val < pre){
                    return false;
                }
                pre = head.val;
                head = head.right;

            }
        }
        return true;
    }

    public static boolean isCBT(TreeNode head){
        if (head == null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLeaf = false;
        TreeNode l = null ;
        TreeNode r = null ;
        queue.offer(head);
        while (!queue.isEmpty()){
            l = head.left;
            r = head.right;
            if ((isLeaf && (l != null || r != null)) || (l == null && r !=null)){
                return false;
            }
            if (l != null){
                queue.offer(l);
            }
            if (r != null){
                queue.offer(r);
            }else{
                isLeaf = true;
            }
        }
        return true;

    }
}
