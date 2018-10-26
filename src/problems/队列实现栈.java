package problems;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;
import java.util.Queue;

public class 队列实现栈 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

    static class MyStack{
        private Queue<Integer> q1;
        private Queue<Integer> q2;

        public MyStack() {
            this.q1 = new LinkedList<>();
            this.q2 = new LinkedList<>();
        }

        public void push(int num){
            q1.add(num);
        }

        public Integer pop(){
            if (q1.isEmpty())
                throw new ArrayIndexOutOfBoundsException("无");
            while(q1.size() >1){
                q2.add(q1.poll());
            }
            Integer res =  q1.poll();
            swap();
            return res;

        }

        public Integer peek(){
            if (q1.isEmpty())
                throw new ArrayIndexOutOfBoundsException("无");
            while(q1.size()>1){
                q2.add(q1.poll());
            }
            Integer res =  q1.poll();
            q2.add(res);
            swap();
            return res;

        }

        private void swap(){
            Queue<Integer> temp;
            temp = q2;
            q2 = q1;
            q1 = temp;
        }
    }
}
