package problems;

import java.util.Stack;

public class 栈实现队列 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.out.println(queue.peek());
        System.out.println(queue.pop());
        queue.push(4);
        queue.push(5);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }

    static class MyQueue{
        private Stack<Integer> in;
        private Stack<Integer> out;

        public MyQueue() {
            this.in = new Stack<>();
            this.out = new Stack<>();
        }

        public void push(int num){
            in.push(num);
        }

        public Integer peek(){
            if (out.isEmpty())
                while (!in.isEmpty()){
                    out.push(in.pop());
                }
            return out.peek();
        }

        public Integer pop(){
            if (out.isEmpty())
                while (!in.isEmpty()){
                    out.push(in.pop());
                }

            return out.pop();
        }
    }
}
