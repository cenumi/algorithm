package 排序;

import 排序.Sort;

public class 荷兰国旗问题 {
    /**
     *  给定一个数组 arr 和一个数 num 请把小于num的数放在数组的左边，
     *  等于 num 的数 放在数组的中间，大于num的数放在数组的右边
     *  要求额外空间复杂度O(1),时间复杂度O(N)
     */

    public static int[] netherlandsFlag(int[] arr,int l,int r,int num){
        int less = l - 1;
        int more = r + 1;
        int cur = l;
        while (cur < more){
            if (arr[cur] < num){
                Sort.swap(arr,++less,cur++);
            }else if (arr[cur] > num){
                Sort.swap(arr,--more,cur);
            }else{
                cur++;
            }
        }
        // 返回等于区域的左右边界
        return new int[]{less+1,more-1};
    }

}
