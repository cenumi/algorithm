package problems;

import java.util.LinkedList;
import java.util.List;

public class 将单向链表按某值划分成左边小中间相等右边大的形式 {
    static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
    /**
     * 给定一个单向链表的头节点 head ，节点的值的类型是整型，再给定一个整数
     * pivot 实现一个调整链表的函数，将链表调整为做部分都是值小于 pivot 的节点
     * 中间部分都是值等于 pivot的节点，右部分都是值大于 pivot 的节点。
     * 除这个要求外，对调整后的节点顺序没有更多的要求。
     * 例如：
     * 链表 9->0->4->5->1 pivot = 3
     * 调整后 可以是 1->0->4->9->5
     * 也可以是     0->1->9->5->4
     * 总之，满足左部分都是小于3的节点，中间部分都是等于3的节点，右部分都是大于3的节点即可。
     *
     * 进阶：
     * 在左、中、右三个部分的内部也做顺序要求，要求每部分里的节点从左到右的顺序
     * 与原链表中节点的先后次序一致
     * 例如：
     * 9->0->4->5->1,pivot = 3
     * 调整后： 0->1->9->4->5
     * 如果链表长度为 N 时间复杂度O(N),额外空间复杂度O(1)
     *
     *
     */

    public static void main(String[] args) {

    }

    public static void simple(Node head){


    }
}
