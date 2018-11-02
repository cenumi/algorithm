package sword;

import java.util.ArrayList;
import java.util.Arrays;

public class 最小的k个数 {
    /**
     * 输入n个整数，找出其中最小的K个数。
     * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
     */
    public static void main(String[] args) {
        int[] arr = new int[]{4,5,1,6,2,7,3,8};
        new 最小的k个数().GetLeastNumbers_Solution(arr,4);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (k > input.length)
            return arrayList;
        Arrays.sort(input);
        for (int i = 0; i <k ; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}
