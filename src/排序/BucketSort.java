package 排序;

public class BucketSort {


    /**
     * 给定一个数组，求如果排序之后，相邻两数的最大差值，要求时间复杂度O（N）,且要求不能用非基于比较的排序
     * 有 n 个 数 ，准备 n+1 个桶，最小值放到 0 号桶，最大值放到 n 号桶
     * 所有桶中，只记最小值和最大值，以及桶内是否有数
     * 遍历桶，若为空，跳过，如果为非空 BR，找左边离得最近的非空桶 BL 计算 max = (BL(min) - BR(max))
     * 求max(max1,max2,max3..)
     */

    public static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        if (min == max) {
            return 0;
        }
        boolean[] hasNum = new boolean[len + 1];
        int[] maxs = new int[len + 1];
        int[] mins = new int[len + 1];
        int bid = 0;
        for (int num : nums) {
            bid = bucket(num, len, min, max);
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], num) : num;
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], num) : num;
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0];
        int i = 1;
        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;
    }

    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,5,3,3,4,8,2,5};
        System.out.println(maxGap(arr));
    }
}
