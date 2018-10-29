package sword;


/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class s15反转链表 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    /*
        思路：1->2->3->4->5
            1<-2<-3<-4<-5

     */

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        node.next = node2;
        node2.next =node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

//        System.out.println(ReverseList(node).val);
        System.out.println(ReverseList(node).next.next.val);

    }

    public static ListNode ReverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        while (head != null){
           next = head.next;
           head.next = pre;

           pre = head;
           head = next;

        }
        return pre;

    }
}
