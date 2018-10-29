package sword;

import java.util.Stack;

public class s20包含min函数的栈 {
    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
     */

    public static class Solution{

        Stack<Integer> origin;
        Stack<Integer> min;

        public Solution() {
            origin = new Stack<>();
            min = new Stack<>();
        }

        public void push(int node) {
            if (origin.isEmpty()){
                min.push(node);
            }else{
                min.push(node < min.peek()?node:min.peek());
            }
            origin.push(node);

        }

        public void pop() {
            origin.pop();
            min.pop();
        }

        public int top() {
            return origin.peek();
        }

        public int min() {
            return min.peek();
        }
    }
}
