package problems;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class 用数组结构实现大小固定的队列和栈 {
    public static void main(String[] args) {

    }


    static class MyQueue{
        private int size;
        private int capacity;
        private int start;
        private int end;
        private int[] arr;
        MyQueue(int size){
            if (size < 0)
                throw new IllegalArgumentException("大小不能小于0");
            this.size = size;
            this.arr = new int[size];
            this.capacity = 0;
            this.start = 0;
            this.end = 0;
        }

        public int peek(){
            if (capacity == 0)
                throw new ArrayIndexOutOfBoundsException("无");
            return arr[start];
        }

        public void push(int num){
            if (capacity == size)
                throw new ArrayIndexOutOfBoundsException("满");
            capacity++;
            arr[end] = num;
            end = end == size-1?0:end+1;
        }
        public int poll(){
            if (capacity == 0)
                throw new ArrayIndexOutOfBoundsException("空");
            capacity--;
            int tmp = start;
            start = start == size-1 ? 0: start + 1;
            return arr[tmp];
        }

//        // 我的实现
//        public void add(int num){
//            capacity++;
//            if (capacity > size)
//                return;
//            arr[(end++)%size] = num;
//
//        }
//
//        public int out(){
//            capacity--;
//            if (capacity < 0)
//                return -1;
//            return arr[(start++)%size];
//
//        }




    }

    static class MyStack{
        private int size;
        private int[] arr;
        private int index;

        public MyStack(int size) {
            if (size < 0)
                throw new IllegalArgumentException("大小不能小于0");
            this.size = size;
            this.arr = new int[size];
            this.index = 0;
        }

        public void push(int num){
            if (index == size){
                throw new ArrayIndexOutOfBoundsException("已满");
            }
            arr[index++] = num;
        }

        public int peek(){
            if (index == 0)
                throw new ArrayIndexOutOfBoundsException("已空");
            return arr[index-1];
        }

        public int pop(){
            if (index == 0){
                throw new ArrayIndexOutOfBoundsException("已空");
            }
            return arr[--index];
        }
    }
}
