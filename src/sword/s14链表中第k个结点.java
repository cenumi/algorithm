package sword;

import java.util.Stack;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class s14链表中第k个结点 {


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

    }
    /*
        思考： 遍历链表压入栈。
     */

    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null){
            return null;
        }
        Stack<ListNode> s = new Stack<>();
        ListNode res = null;
        while (head != null){
            s.push(head);
            head = head.next;
        }
        if (k > s.size()) return null;
        for (int i = 0; i < k; i++) {
            res = s.pop();
        }
        return res;
    }
}
