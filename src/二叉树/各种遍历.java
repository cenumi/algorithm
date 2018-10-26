package 二叉树;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 各种遍历 {

    public static void main(String[] args) {

    }

    public static void preOrderRecur(TreeNode head){
        if (head == null){
            return;
        }
        System.out.println(head.val + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void inOrderRecur(TreeNode head){
        if (head == null){
            return;
        }
        preOrderRecur(head.left);
        System.out.println(head.val + " ");
        preOrderRecur(head.right);
    }

    public static void afterOrderRecur(TreeNode head){
        if (head == null){
            return;
        }
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.val + " ");
    }


    public static void preOrderUnRecur(TreeNode head){
        if (head != null){
            Stack<TreeNode> stack = new Stack<>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.val + " ");
                if (head.right != null){
                    stack.push(head.right);
                }
                if (head.left != null){
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }

    public static void inOrderUnRecur(TreeNode head){
        Stack<TreeNode> stack = new Stack<>();
        if (head != null){
            while (!stack.isEmpty() || head != null){
                if (head!= null){
                    stack.push(head);
                    head = head.left;
                }else{
                    head = stack.pop();
                    System.out.println(head.val + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    public static void afterOrderUnRecur(TreeNode head){
        if(head != null){
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();

            s1.push(head);
            while (!s1.isEmpty()){
                head = s1.pop();
                s2.push(head);
                if (head.left != null){
                    s1.push(head.left);
                }
                if (head.right != null){
                    s1.push(head.right);
                }
            }

            while (!s2.isEmpty()){
                System.out.println(s2.pop().val + " ");
            }
        }
        System.out.println();

    }

    public static void depth(TreeNode head){
        if (head != null){
            Stack<TreeNode> s = new Stack<>();
            s.push(head);
            while (!s.isEmpty()){
                System.out.println(s.pop().val);

                if (head.right != null){
                    s.push(head.right);
                }

                if (head.left != null){
                    s.push(head.left);
                }
            }
        }
    }

    public static void width(TreeNode head){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        if (head != null){
            while (!queue.isEmpty()){
                System.out.println(queue.poll().val);

                if (head.left != null){
                    queue.add(head.left);
                }

                if (head.right != null){
                    queue.add(head.right);
                }
            }

        }
    }


}
