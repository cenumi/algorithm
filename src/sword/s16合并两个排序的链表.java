package sword;

import com.sun.scenario.effect.Merge;

import java.util.List;

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则
 */
public class s16合并两个排序的链表 {

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    /*
        思路：
     */

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        ListNode list5 = new ListNode(5);
        ListNode list6 = new ListNode(6);

        list1.next = list3;
        list3.next = list5;

        list2.next = list4;
        list4.next = list6;
        ListNode root = Merge2(list1,list2);
        while ( root != null){
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val < list2.val){
            list1.next = Merge(list1.next,list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }

    public static ListNode Merge2(ListNode list1,ListNode list2) {
        ListNode head;
        ListNode cur = new ListNode(-1);
        head = cur;
        while (list1 !=null && list2 != null){
            if (list1.val <= list2.val){
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            }
        }
        if (list1 == null){
            cur.next = list2;
        }
        if (list2 == null){
            cur.next = list1;
        }
        return head.next;


    }
}
