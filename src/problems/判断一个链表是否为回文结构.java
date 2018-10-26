package problems;

import java.util.Stack;

public class 判断一个链表是否为回文结构 {

    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    /**
     * 给定一个链表的头结点 head，请判断该链表是否为回文结构
     * 例如 1->2->1 返回 true
     * 1->2->2->1 返回 true
     * 15->6->15 返回 true
     * 1->2->3 返回 false
     *
     * 进阶：
     * 如果链表长度为 N，时间复杂度达到 O(N)
     * 额外空间复杂度达到O(1)
     */

    public static void main(String[] args) {

    }

    public static boolean simple(Node node){
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        Node head = node;
        while (node != null){
            stack.push(node.val);
            node = node.next;
        }
        while (head != null){
            if (head.val != stack.pop()){
                flag = false;
                break;
            }else{
                head = head.next;
            }
        }
        return flag;
    }

    public static boolean advanced(Node head){
        if (head == null || head.next == null)
            return true;
        Node n1 = head;
        Node n2 = head;
        while (n2.next != null && n2.next.next != null){
            n1 = n1.next;
            n2 = n2.next.next;
        }
        n2 = n1.next;
        n1.next = null;
        Node n3 = null;
        while (n2 != null){
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }
        n3 = n1;
        n2 = head;
        boolean res = true;
        while (n1 != null && n2 != null){
            if (n1.val != n2.val){
                res = false;
                break;
            }
            n1 = n1.next;
            n2 = n2.next;
        }
        n1 = n3.next;
        n3.next = null;
        while (n1!= null){
            n2 = n1.next;
            n1.next = n3;
            n3 = n1;
            n1 = n2;
        }

        return res;

    }
}
