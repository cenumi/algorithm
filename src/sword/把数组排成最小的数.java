package sword;

import java.util.Arrays;
import java.util.Comparator;

public class 把数组排成最小的数 {
    /**
     * 输入一个正整数数组，
     * 把数组里所有数字拼接起来排成一个数，
     * 打印能拼接出的所有数字中最小的一个。
     * 例如输入数组{3，32，321}，
     * 则打印出这三个数字能排成的最小数字为321323。
     */

    public static void main(String[] args) {
        int[] num = new int[]{3,32,321};
        new 把数组排成最小的数().PrintMinNumber(num);
    }

    public String PrintMinNumber(int [] numbers) {
        String[] strs = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strs[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1+o2)-Integer.valueOf(o2+o1);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String s: strs)
            sb.append(s);
        return sb.toString();

    }
}
