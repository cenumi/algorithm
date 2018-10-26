package problems;

public class 反转单向和双向链表 {
    static class Single{
        int value;
        Single next = null;

        public Single(int value) {
            this.value = value;
        }
    }

    static class Double{
        int value;
        Double pre = null;
        Double next = null;

        public Double(int value) {
            this.value = value;
        }
    }

    /**
     * 分别实现反转单向链表和反转双向链表的函数
     * 如果链表长度为 N，时间复杂度要求为 O（N），额外空间复杂度要求为O（1）
     */


    public static void main(String[] args) {

    }

    private void testSingle(){
        Single head = new Single(1);
        Single node1 = new Single(2);
        Single node2 = new Single(3);
        Single node3 = new Single(4);
        Single node4 = new Single(5);
        Single node5 = new Single(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        Single s = reverseSingle(head);
        while (s != null){
            System.out.println(s.value);
            s = s.next;
        }
    }
    private void testDouble(){
        Double head = new Double(1);
        Double node1 = new Double(2);
        Double node2 = new Double(3);
        Double node3 = new Double(4);
        Double node4 = new Double(5);
        Double node5 = new Double(6);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node1.pre = head;
        node2.pre = node1;
        node3.pre = node2;
        node4.pre = node3;
        node5.pre = node4;

    }

    public static Single reverseSingle(Single head){
        Single pre = null;
        Single next = null;

        while (head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }


    public static Double reverseDouble(Double head){
        Double pre = null;
        Double next = null;
        while (head != null){
            next = head.next;
            head.next = pre;
            head.pre = next;
            pre = head;
            head = next;
        }
        return pre;
    }
}
