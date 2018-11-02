package sword;

import java.util.*;

public class 数组中出现次数超过一半的数字 {
    /**
     * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
     * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
     * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
     */

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,2,2,5,4,2};
        System.out.println(new 数组中出现次数超过一半的数字().MoreThanHalfNum_Solution(arr));

    }

    public int MoreThanHalfNum_Solution(int [] array) {
        int size = array.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i :array){
            int num = map.getOrDefault(i,0);
            map.put(i,num + 1);
            if (num+1 > size){
                return i;
            }
        }
        return 0;

    }
}
