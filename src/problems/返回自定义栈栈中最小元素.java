package problems;

import java.util.Stack;

public class 返回自定义栈栈中最小元素 {
    /**
     * 实现一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作
     *
     * pop\push\getMin 操作的时间复杂度都是 O(1)
     * 设计的栈的类型可是使用现成的栈结构
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(3);
        System.out.println(stack.getMin());

        stack.push(4);
        System.out.println(stack.getMin());

        stack.push(1);
        System.out.println(stack.getMin());

        System.out.println(stack.pop());
        System.out.println(stack.getMin());


    }

    static class MyStack{
        private Stack<Integer> data;
        private Stack<Integer> min;

        public MyStack() {
            this.data = new Stack<>();
            this.min = new Stack<>();
        }

        public void push(int num){
            if (data.isEmpty()){
                data.push(num);
                min.push(num);
            }else{
                data.push(num);
                min.push(num<min.peek()?num:min.peek());
            }
        }

        public int getMin(){
            return min.peek();
        }

        public int peek(){
            return data.peek();
        }

        public int pop(){
            min.pop();
            return data.pop();
        }
    }


}
